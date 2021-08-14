package com.github.rumane

import com.github.rumane.CustomGui.getAllowOption
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.getChangeBlockOption
import com.github.rumane.CustomGui.setChangeBlockOption
import com.github.rumane.CustomGui.setOption
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.*
import kotlin.collections.ArrayList

class NoteblockManagerPlugin : JavaPlugin() {
    override fun onEnable() {
        load()
        setupCommands()
        setupEvents()
        optionInit()
    }

    override fun onDisable() {
        save()
    }

    private fun save() {
        val list = ArrayList<String>()

        playerOption.forEach { i ->
            list.add("${i.key}=${i.value}")
        }

        config.set("PlayerOptions", list)
        config.set("ChangeBlock", getChangeBlockOption())
        config.set("ChangeBlock", getAllowOption())
        saveConfig()
    }

    private fun load() {
        config.addDefault("PlayerOptions", ArrayList<String>())
        config.addDefault("ChangeBlock", Boolean)
        config.addDefault("AllowNotOp", Boolean)
        if (!config.isSet("ChangeBlock")) config.set("ChangeBlock", true)
        if (!config.isSet("AllowNotOp")) config.set("AllowNotOp", false)
        config.options().copyDefaults(true)
        config.getStringList("PlayerOptions").forEach { i ->
            val key = i.split('=')[0]
            val value = i.split('=')[1]
            playerOption[UUID.fromString(key)] = value.toBoolean()
        }
        setChangeBlockOption(config.getBoolean("ChangeBlock"))
    }

    private fun setupEvents() {
        server.pluginManager.registerEvents(BlockRegisterEvents(), this)
        server.pluginManager.registerEvents(InvClickEvents(), this)
    }

    private fun setupCommands() {
        val commands = Commands()
        server.getPluginCommand(commands.changeOptionCommand)!!.setExecutor(commands)
        server.getPluginCommand(commands.changeBlockOptionCommand)!!.setExecutor(commands)
        server.getPluginCommand(commands.allowNotOpCommand)!!.setExecutor(commands)
        server.getPluginCommand(commands.helpCommand)!!.setExecutor(commands)
    }

    private fun optionInit() {
        Bukkit.getOnlinePlayers().forEach {
            if (!playerOption.contains(it.uniqueId)) setOption(it, false)
        }
    }
}

