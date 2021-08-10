package com.github.rumane

import com.github.rumane.CustomGUI.getSetting
import com.github.rumane.CustomGUI.playerOptions
import com.github.rumane.CustomGUI.setSetting
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Commands : CommandExecutor {
    val cmd = "nbm"
    val cmd2 = "test"
    val cmd3 = "add"

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (cmd.equals(command.name, true)) {
            if (sender is Player) {
                if (playerOptions.contains(sender.uniqueId)) {
                    setSetting(sender.uniqueId, !getSetting(sender.uniqueId))
                    sender.sendMessage("${sender.name}.useNoteblockManager = ${getSetting(sender.uniqueId)}")
                }
            }
        }

        else if (cmd2.equals(command.name, true)) {
            println("size: ${playerOptions.size}")
            for (i in playerOptions) {
                println("${i.key}=${i.value}")
            }
        }

        else if (cmd3.equals(command.name, true)) {
            if (sender is Player) {
                setSetting(sender.uniqueId, false)
            }
        }
        return true
    }
}