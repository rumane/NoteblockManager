package com.github.rumane

import com.github.rumane.CustomGui.getOption
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.setOption
import net.kyori.adventure.audience.Audience
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Commands : CommandExecutor {
    val cmd = "nbm"
    val cmd2 = "test"
    val cmd3 = "add"
    val cmd4 = "send"

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (cmd.equals(command.name, true)) {
            if (sender is Player) {
                if (playerOption.contains(sender.uniqueId)) {
                    setOption(sender, !getOption(sender))
                    sender.sendMessage("${sender.name}.useNoteblockManager = ${getOption(sender)}")
                }
            }
        }

        else if (cmd2.equals(command.name, true)) {
            println("size: ${playerOption.size}")
            for (i in playerOption) {
                println("${i.key}=${i.value}")
            }
        }

        else if (cmd3.equals(command.name, true)) {
            if (sender is Player) {
                setOption(sender, false)
            }
        }

        else if (cmd4.equals(command.name, true)) {
            if (sender is Player) {
                val audience = Audience.audience(sender)
                val com = Component.text()
                        .append(Component.text("hello", NamedTextColor.GOLD)
                        .append(Component.text(" world", NamedTextColor.WHITE)))
                        .build()
                audience.sendMessage(com)
            }
        }
        return true
    }
}