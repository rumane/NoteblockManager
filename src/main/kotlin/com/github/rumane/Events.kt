package com.github.rumane

import com.github.rumane.CustomGui.getClickedBlock
import com.github.rumane.CustomGui.instrumentSlot0
import com.github.rumane.CustomGui.instrumentSlot1
import com.github.rumane.CustomGui.instrumentSlot10
import com.github.rumane.CustomGui.instrumentSlot11
import com.github.rumane.CustomGui.instrumentSlot12
import com.github.rumane.CustomGui.instrumentSlot13
import com.github.rumane.CustomGui.instrumentSlot14
import com.github.rumane.CustomGui.instrumentSlot15
import com.github.rumane.CustomGui.instrumentSlot2
import com.github.rumane.CustomGui.instrumentSlot26
import com.github.rumane.CustomGui.instrumentSlot3
import com.github.rumane.CustomGui.instrumentSlot4
import com.github.rumane.CustomGui.instrumentSlot5
import com.github.rumane.CustomGui.instrumentSlot6
import com.github.rumane.CustomGui.instrumentSlot7
import com.github.rumane.CustomGui.instrumentSlot8
import com.github.rumane.CustomGui.instrumentSlot9
import com.github.rumane.CustomGui.instrumentTitle
import com.github.rumane.CustomGui.itemList
import com.github.rumane.CustomGui.openSetInstrumentGui
import com.github.rumane.CustomGui.openSetPitchGui
import com.github.rumane.CustomGui.pitchSlot0
import com.github.rumane.CustomGui.pitchSlot26
import com.github.rumane.CustomGui.pitchTitle
import com.github.rumane.CustomGui.setOption
import com.github.rumane.CustomGui.playerOption
import com.github.rumane.CustomGui.setClickedBlock
import org.bukkit.Instrument
import org.bukkit.Sound
import org.bukkit.block.Block
import org.bukkit.block.data.type.NoteBlock
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

class Events : Listener {
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
        setClickedBlock(player, block) //TODO
    }

    @EventHandler
    fun onPitchGuiClick(event: InventoryClickEvent) { // Set Pitch Gui Click TODO
        if (event.view.title() != pitchTitle) return
        event.isCancelled = true
        val player = event.whoClicked as Player
        val block = getClickedBlock(player)
        when (event.currentItem) {
            pitchSlot26 ->
                openSetInstrumentGui(player)
            else ->
                return
        }
    }

    @EventHandler
    fun onInstrumentGuiClick(event: InventoryClickEvent) { // Set Instrument Gui Click TODO
        if (event.view.title() != instrumentTitle) return
        event.isCancelled = true
        val player = event.whoClicked as Player
        val block = getClickedBlock(player)!!
        when (event.currentItem) {
            instrumentSlot0 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_BASS, 1f, 1f)
                setInstrument(block, Instrument.BASS_GUITAR)
            }
            instrumentSlot1 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_SNARE, 1f, 1f)
                setInstrument(block, Instrument.SNARE_DRUM)
            }
            instrumentSlot2 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_HAT, 1f, 1f)
                setInstrument(block, Instrument.STICKS)
            }
            instrumentSlot3 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 1f, 1f)
                setInstrument(block, Instrument.BASS_DRUM)
            }
            instrumentSlot4 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_BELL, 1f, 1f)
                setInstrument(block, Instrument.BELL)
            }
            instrumentSlot5 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 1f, 1f)
                setInstrument(block, Instrument.FLUTE)
            }
            instrumentSlot6 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_CHIME, 1f, 1f)
                setInstrument(block, Instrument.CHIME)
            }
            instrumentSlot7 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 1f, 1f)
                setInstrument(block, Instrument.GUITAR)
            }
            instrumentSlot8 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 1f, 1f)
                setInstrument(block, Instrument.XYLOPHONE)
            }
            instrumentSlot9 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1f, 1f)
                setInstrument(block, Instrument.IRON_XYLOPHONE)
            }
            instrumentSlot10 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 1f, 1f)
                setInstrument(block, Instrument.COW_BELL)
            }
            instrumentSlot11 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 1f, 1f)
                setInstrument(block, Instrument.DIDGERIDOO)
            }
            instrumentSlot12 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_BIT, 1f, 1f)
                setInstrument(block, Instrument.BIT)
            }
            instrumentSlot13 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_BANJO, 1f, 1f)
                setInstrument(block, Instrument.BANJO)
            }
            instrumentSlot14 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_PLING, 1f, 1f)
                setInstrument(block, Instrument.PLING)
            }
            instrumentSlot15 -> {
                player.playSound(player.location, Sound.BLOCK_NOTE_BLOCK_HARP, 1f, 1f)
                setInstrument(block, Instrument.PIANO)
            }
            instrumentSlot26 ->
                openSetPitchGui(player)
            else ->
                return

        }
    }

    @EventHandler
    fun onPlace(event: BlockPlaceEvent) {
        if (!playerOption[event.player.uniqueId]!!) return
        if (event.block.blockData !is NoteBlock) return

        val player = event.player
        openSetInstrumentGui(player)
        setClickedBlock(player, event.block)
    }

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player
        if (!playerOption.contains(player.uniqueId)) setOption(player, false)
    }

    @EventHandler
    fun onInvClose(event: InventoryCloseEvent) {
        if (event.view.title() == pitchTitle || event.view.title() == instrumentTitle) {
            setClickedBlock(event.player as Player, null)
        }
    }

    fun setInstrument(block: Block, instrument: Instrument) {
        try {
            block as NoteBlock
        } catch (e:Exception) {
            return
        }

        val noteBlock = block.blockData as NoteBlock
        noteBlock.instrument = instrument
        block.blockData = noteBlock
    }
}
