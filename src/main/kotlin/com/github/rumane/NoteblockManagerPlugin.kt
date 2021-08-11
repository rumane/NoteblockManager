package com.github.rumane

import com.github.rumane.CustomGui.playerOption
import org.bukkit.plugin.java.JavaPlugin
import java.util.*
import kotlin.collections.ArrayList

class NoteblockManagerPlugin : JavaPlugin() {
    override fun onEnable() {
        load()
        setupCommands()
        setupEvents()
    }

    override fun onDisable() {
        save()
    }

    private fun save() {
        val list = ArrayList<String>()

        for (i in playerOption) {
            list.add("${i.key}=${i.value}")
            println("${i.key}=${i.value}")
        }

        config.set("PlayerOptions", list)
        saveConfig()
    }

    private fun load() {
        config.options().copyDefaults(true)
        config.addDefault("PlayerOptions", ArrayList<String>())
        for (i in config.getStringList("PlayerOptions")) {
            val key = i.split('=')[0]
            val value = i.split('=')[1]
            playerOption[UUID.fromString(key)] = value.toBoolean()
            println("${UUID.fromString(key)} = ${value.toBoolean()}")
        }
    }

    private fun setupEvents() {
        server.pluginManager.registerEvents(Events(), this)
    }

    private fun setupCommands() {
        val commands = Commands()
        server.getPluginCommand(commands.cmd)!!.setExecutor(commands)
        server.getPluginCommand(commands.cmd2)!!.setExecutor(commands)
        server.getPluginCommand(commands.cmd3)!!.setExecutor(commands)
        server.getPluginCommand(commands.cmd4)!!.setExecutor(commands)
    }
}

