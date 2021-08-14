package com.github.rumane

import com.github.rumane.CustomGui.getAllowOption
import com.github.rumane.CustomGui.getChangeBlockOption
import com.github.rumane.CustomGui.getOption
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.setAllowOption
import com.github.rumane.CustomGui.setChangeBlockOption
import com.github.rumane.CustomGui.setOption
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Commands : CommandExecutor {
    val changeOptionCommand = "nb"
    val changeBlockOptionCommand = "cb"
    val allowNotOpCommand = "ab"
    val helpCommand = "h"

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
            sender.sendMessage("changeBlockOption = ${getChangeBlockOption()}")
        }
        else if (allowNotOpCommand.equals(command.name, true)) {
            if (sender.isOp) setAllowOption(!getAllowOption())
            sender.sendMessage("allowNotOp = ${getAllowOption()}")
        }
        else if (helpCommand.equals(command.name, true)) {
            sender.sendMessage("/nb: 플러그인 Gui 사용 여부 설정")
            sender.sendMessage("/cb: 블럭이 바뀔지 여부 설정 (오피 권한)")
            sender.sendMessage("/ab: 오피가 없는 사람도 블럭이 바뀌게 할지 설정 (오피 권한)")
            sender.sendMessage("/h: 명령어 목록 출력")
        }
        return true
    }
}
