package com.github.rumane

import com.github.rumane.CustomGUI.itemList
import com.github.rumane.CustomGUI.openSetInstrumentGUI
import com.github.rumane.CustomGUI.openSetPitchGUI
import com.github.rumane.CustomGUI.setSetting
import com.github.rumane.CustomGUI.playerOptions
import org.bukkit.Material
import org.bukkit.block.data.type.NoteBlock
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

class Events : Listener {
    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        if (event.action != Action.RIGHT_CLICK_BLOCK) return
        if (event.clickedBlock!!.blockData !is NoteBlock) return
        if (!playerOptions[event.player.uniqueId]!!) return
        if (!event.player.isSneaking) return
        if (!itemList.contains(event.player.inventory.itemInMainHand.type) && !itemList.contains(event.player.inventory.itemInOffHand.type)) return

        val block = event.clickedBlock!!.blockData as NoteBlock
        val player = event.player

        openSetPitchGUI(player)
    }

    @EventHandler
    fun onPlace(event: BlockPlaceEvent) {
        if (!playerOptions[event.player.uniqueId]!!) return
        if (event.block.blockData !is NoteBlock) return

        val player = event.player
        openSetInstrumentGUI(player)
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player
        if (!playerOptions.contains(player.uniqueId)) setSetting(player.uniqueId, false)
    }
}