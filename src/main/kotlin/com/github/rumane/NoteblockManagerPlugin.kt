package com.github.rumane

import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.changeOption
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
        saveConfig()
    }

    private fun load() {
        config.options().copyDefaults(true)
        config.addDefault("PlayerOptions", ArrayList<String>())
        config.addDefault("ChangeBlock", Boolean)
        config.getStringList("PlayerOptions").forEach { i ->
            val key = i.split('=')[0]
            val value = i.split('=')[1]
            playerOption[UUID.fromString(key)] = value.toBoolean()
        }
        setChangeBlockOption(config.getBoolean("ChangeBlock"))
    }

    private fun setupEvents() {
        server.pluginManager.registerEvents(Events(), this)
        server.pluginManager.registerEvents(InvClickEvents(), this)
    }

    private fun setupCommands() {
        val commands = Commands()
        server.getPluginCommand(commands.changeOptionCommand)!!.setExecutor(commands)
        server.getPluginCommand(commands.changeBlockOptionCommand)!!.setExecutor(commands)
    }

    private fun optionInit() {
        Bukkit.getOnlinePlayers().forEach {
            if (!playerOption.contains(it.uniqueId)) setOption(it, false)
        }
    }
}

