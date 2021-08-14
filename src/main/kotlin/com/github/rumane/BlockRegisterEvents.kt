package com.github.rumane

import com.github.rumane.CustomGui.itemList
import com.github.rumane.CustomGui.openSetInstrumentGui
import com.github.rumane.CustomGui.openSetPitchGui
import com.github.rumane.CustomGui.setOption
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.setClickedBlock
import org.bukkit.block.data.type.NoteBlock
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

class BlockRegisterEvents : Listener {
    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        if (event.action != Action.RIGHT_CLICK_BLOCK) return
        if (event.clickedBlock!!.blockData !is NoteBlock) return
        if (!playerOption[event.player.uniqueId]!!) return
        if (!event.player.isSneaking) return
        if (!itemList.contains(event.player.inventory.itemInMainHand.type) && !itemList.contains(event.player.inventory.itemInOffHand.type)) return

        val block = event.clickedBlock!!
        val player = event.player


        openSetPitchGui(player)
        setClickedBlock(player, block)
    }

    @EventHandler
    fun onPlace(event: BlockPlaceEvent) {
        if (!playerOption[event.player.uniqueId]!!) return
        if (event.block.blockData !is NoteBlock) return

        val player = event.player
        val block = event.block

        openSetInstrumentGui(player)
        setClickedBlock(player, block)
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player
        if (!playerOption.contains(player.uniqueId)) setOption(player, false)
    }
}
