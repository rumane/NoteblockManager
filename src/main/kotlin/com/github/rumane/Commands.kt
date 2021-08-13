package com.github.rumane

import com.github.rumane.CustomGui.getChangeBlockOption
import com.github.rumane.CustomGui.getOption
import com.github.rumane.CustomGui.itemList
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.setChangeBlockOption
import com.github.rumane.CustomGui.setOption
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Commands : CommandExecutor {
    val changeOptionCommand = "nb"
    val changeBlockOptionCommand = "cb"

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (changeOptionCommand.equals(command.name, true)) {
            if (sender is Player) {
                if (playerOption.contains(sender.uniqueId)) {
                    setOption(sender, !getOption(sender))
                    sender.sendMessage("${sender.name}.useNoteblockManager = ${getOption(sender)}")
                }
            }
        }
        else if (changeBlockOptionCommand.equals(command.name, true)) {
            if (sender.isOp) setChangeBlockOption(!getChangeBlockOption())
        }
        return true
    }
}
