package com.github.rumane

import com.github.rumane.CustomGui.getChangeBlockOption
import com.github.rumane.CustomGui.getClickedBlock
import com.github.rumane.CustomGui.openSetInstrumentGui
import com.github.rumane.CustomGui.openSetPitchGui
import org.bukkit.Instrument
import org.bukkit.Note
import org.bukkit.Note.Tone
import org.bukkit.Sound
import org.bukkit.block.Block
import org.bukkit.block.data.type.NoteBlock
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class InvClickEvents: Listener {

    @EventHandler
    fun onPitchGuiClick(event: InventoryClickEvent) { // Set Pitch Gui Click TODO
        if (event.view.title() != CustomGui.pitchTitle) return
        event.isCancelled = true
        val player = event.whoClicked as Player
        val block = getClickedBlock(player)!!
        val noteBlock = block.blockData as NoteBlock
        when (event.currentItem) {
            PitchSlots.SLOT0.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT0.pitch())
                setPitch(block, PitchSlots.SLOT0.octave(), PitchSlots.SLOT0.tone(), PitchSlots.SLOT0.isSharp())
            }
            PitchSlots.SLOT1.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT1.pitch())
                setPitch(block, PitchSlots.SLOT1.octave(), PitchSlots.SLOT1.tone(), PitchSlots.SLOT1.isSharp())
            }
            PitchSlots.SLOT2.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT2.pitch())
                setPitch(block, PitchSlots.SLOT2.octave(), PitchSlots.SLOT2.tone(), PitchSlots.SLOT2.isSharp())
            }
            PitchSlots.SLOT3.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT3.pitch())
                setPitch(block, PitchSlots.SLOT3.octave(), PitchSlots.SLOT3.tone(), PitchSlots.SLOT3.isSharp())
            }
            PitchSlots.SLOT4.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT4.pitch())
                setPitch(block, PitchSlots.SLOT4.octave(), PitchSlots.SLOT4.tone(), PitchSlots.SLOT4.isSharp())
            }
            PitchSlots.SLOT5.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT5.pitch())
                setPitch(block, PitchSlots.SLOT5.octave(), PitchSlots.SLOT5.tone(), PitchSlots.SLOT5.isSharp())
            }
            PitchSlots.SLOT6.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT6.pitch())
                setPitch(block, PitchSlots.SLOT6.octave(), PitchSlots.SLOT6.tone(), PitchSlots.SLOT6.isSharp())
            }
            PitchSlots.SLOT7.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT7.pitch())
                setPitch(block, PitchSlots.SLOT7.octave(), PitchSlots.SLOT7.tone(), PitchSlots.SLOT7.isSharp())
            }
            PitchSlots.SLOT8.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT8.pitch())
                setPitch(block, PitchSlots.SLOT8.octave(), PitchSlots.SLOT8.tone(), PitchSlots.SLOT8.isSharp())
            }
            PitchSlots.SLOT9.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT9.pitch())
                setPitch(block, PitchSlots.SLOT9.octave(), PitchSlots.SLOT9.tone(), PitchSlots.SLOT9.isSharp())
            }
            PitchSlots.SLOT10.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT10.pitch())
                setPitch(block, PitchSlots.SLOT10.octave(), PitchSlots.SLOT10.tone(), PitchSlots.SLOT10.isSharp())
            }
            PitchSlots.SLOT11.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT11.pitch())
                setPitch(block, PitchSlots.SLOT11.octave(), PitchSlots.SLOT11.tone(), PitchSlots.SLOT11.isSharp())
            }
            PitchSlots.SLOT12.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT12.pitch())
                setPitch(block, PitchSlots.SLOT12.octave(), PitchSlots.SLOT12.tone(), PitchSlots.SLOT12.isSharp())
            }
            PitchSlots.SLOT13.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT13.pitch())
                setPitch(block, PitchSlots.SLOT13.octave(), PitchSlots.SLOT13.tone(), PitchSlots.SLOT13.isSharp())
            }
            PitchSlots.SLOT14.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT14.pitch())
                setPitch(block, PitchSlots.SLOT14.octave(), PitchSlots.SLOT14.tone(), PitchSlots.SLOT14.isSharp())
            }
            PitchSlots.SLOT15.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT15.pitch())
                setPitch(block, PitchSlots.SLOT15.octave(), PitchSlots.SLOT15.tone(), PitchSlots.SLOT15.isSharp())
            }
            PitchSlots.SLOT16.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT16.pitch())
                setPitch(block, PitchSlots.SLOT16.octave(), PitchSlots.SLOT16.tone(), PitchSlots.SLOT16.isSharp())
            }
            PitchSlots.SLOT17.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT17.pitch())
                setPitch(block, PitchSlots.SLOT17.octave(), PitchSlots.SLOT17.tone(), PitchSlots.SLOT17.isSharp())
            }
            PitchSlots.SLOT18.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT18.pitch())
                setPitch(block, PitchSlots.SLOT18.octave(), PitchSlots.SLOT18.tone(), PitchSlots.SLOT18.isSharp())
            }
            PitchSlots.SLOT19.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT19.pitch())
                setPitch(block, PitchSlots.SLOT19.octave(), PitchSlots.SLOT19.tone(), PitchSlots.SLOT19.isSharp())
            }
            PitchSlots.SLOT20.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT20.pitch())
                setPitch(block, PitchSlots.SLOT20.octave(), PitchSlots.SLOT20.tone(), PitchSlots.SLOT20.isSharp())
            }
            PitchSlots.SLOT21.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT21.pitch())
                setPitch(block, PitchSlots.SLOT21.octave(), PitchSlots.SLOT21.tone(), PitchSlots.SLOT21.isSharp())
            }
            PitchSlots.SLOT22.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT22.pitch())
                setPitch(block, PitchSlots.SLOT22.octave(), PitchSlots.SLOT22.tone(), PitchSlots.SLOT22.isSharp())
            }
            PitchSlots.SLOT23.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT23.pitch())
                setPitch(block, PitchSlots.SLOT23.octave(), PitchSlots.SLOT23.tone(), PitchSlots.SLOT23.isSharp())
            }
            PitchSlots.SLOT24.item() -> {
                player.playPitchSound(noteBlock, PitchSlots.SLOT24.pitch())
                setPitch(block, PitchSlots.SLOT24.octave(), PitchSlots.SLOT24.tone(), PitchSlots.SLOT24.isSharp())
            }
            PitchSlots.CHANGEGUI.item() ->
                openSetInstrumentGui(player)
            else ->
                return
        }
    }

    @EventHandler
    fun onInstrumentGuiClick(event: InventoryClickEvent) { // Set Instrument Gui Click
        if (event.view.title() != CustomGui.instrumentTitle) return
        event.isCancelled = true
        val player = event.whoClicked as Player
        val block = getClickedBlock(player)!!
        when (event.currentItem) {
            InsSlots.SLOT0.item() -> {
                player.playInstrumentSound(InsSlots.SLOT0.sound(), block)
                setInstrument(block, InsSlots.SLOT0.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT0.material()
            }
            InsSlots.SLOT1.item() -> {
                player.playInstrumentSound(InsSlots.SLOT1.sound(), block)
                setInstrument(block, InsSlots.SLOT1.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT1.material()
            }
            InsSlots.SLOT2.item() -> {
                player.playInstrumentSound(InsSlots.SLOT2.sound(), block)
                setInstrument(block, InsSlots.SLOT2.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT2.material()
            }
            InsSlots.SLOT3.item() -> {
                player.playInstrumentSound(InsSlots.SLOT3.sound(), block)
                setInstrument(block, InsSlots.SLOT3.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT3.material()
            }
            InsSlots.SLOT4.item() -> {
                player.playInstrumentSound(InsSlots.SLOT4.sound(), block)
                setInstrument(block, InsSlots.SLOT4.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT4.material()
            }
            InsSlots.SLOT5.item() -> {
                player.playInstrumentSound(InsSlots.SLOT5.sound(), block)
                setInstrument(block, InsSlots.SLOT5.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT5.material()
            }
            InsSlots.SLOT6.item() -> {
                player.playInstrumentSound(InsSlots.SLOT6.sound(), block)
                setInstrument(block, InsSlots.SLOT6.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT6.material()
            }
            InsSlots.SLOT7.item() -> {
                player.playInstrumentSound(InsSlots.SLOT7.sound(), block)
                setInstrument(block, InsSlots.SLOT7.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT7.material()
            }
            InsSlots.SLOT8.item() -> {
                player.playInstrumentSound(InsSlots.SLOT8.sound(), block)
                setInstrument(block, InsSlots.SLOT8.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT8.material()
            }
            InsSlots.SLOT9.item() -> {
                player.playInstrumentSound(InsSlots.SLOT9.sound(), block)
                setInstrument(block, InsSlots.SLOT9.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT9.material()
            }
            InsSlots.SLOT10.item() -> {
                player.playInstrumentSound(InsSlots.SLOT10.sound(), block)
                setInstrument(block, InsSlots.SLOT10.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT10.material()
            }
            InsSlots.SLOT11.item() -> {
                player.playInstrumentSound(InsSlots.SLOT11.sound(), block)
                setInstrument(block, InsSlots.SLOT11.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT11.material()
            }
            InsSlots.SLOT12.item() -> {
                player.playInstrumentSound(InsSlots.SLOT12.sound(), block)
                setInstrument(block, InsSlots.SLOT12.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT12.material()
            }
            InsSlots.SLOT13.item() -> {
                player.playInstrumentSound(InsSlots.SLOT13.sound(), block)
                setInstrument(block, InsSlots.SLOT13.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT13.material()
            }
            InsSlots.SLOT14.item() -> {
                player.playInstrumentSound(InsSlots.SLOT14.sound(), block)
                setInstrument(block, InsSlots.SLOT14.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT14.material()
            }
            InsSlots.SLOT15.item() -> {
                player.playInstrumentSound(InsSlots.SLOT15.sound(), block)
                setInstrument(block, InsSlots.SLOT15.instrument())
                if (player.isOp && getChangeBlockOption()) player.world.getBlockAt(block.location.add(0.0, -1.0, 0.0)).type = InsSlots.SLOT15.material()
            }
            InsSlots.CHANGEGUI.item() ->
                openSetPitchGui(player)
            else ->
                return

        }
    }

    private fun setPitch(block: Block, octave: Int, tone: Note.Tone, isSharp: Boolean) {
        try {
            block.blockData as NoteBlock
        } catch (e: Exception) {
            return
        }

        val noteBlock = block.blockData as NoteBlock
        if (isSharp) {
            noteBlock.note = Note.sharp(octave, tone)
        }
        else {
            noteBlock.note = Note.natural(octave, tone)
        }

        block.blockData = noteBlock
    }

    private fun setInstrument(block: Block, instrument: Instrument) {
        try {
            block.blockData as NoteBlock
        } catch (e:Exception) {
            return
        }

        val noteBlock = block.blockData as NoteBlock
        noteBlock.instrument = instrument
        block.blockData = noteBlock
    }

    private fun Player.playInstrumentSound(sound: Sound, block: Block) {
        (block.blockData as NoteBlock).let {
            this.playSound(this.location, sound, 1f, it.pitch())
        }
    }

    private fun Player.playPitchSound(block: NoteBlock, pitch: Float) {
        this.playSound(this.location, block.sound(), 1f, pitch)
    }

    private fun NoteBlock.sound(): Sound {
        val sound: Sound = when (this.instrument) {
            Instrument.BASS_GUITAR ->
                Sound.BLOCK_NOTE_BLOCK_BASS
            Instrument.SNARE_DRUM ->
                Sound.BLOCK_NOTE_BLOCK_SNARE
            Instrument.STICKS->
                Sound.BLOCK_NOTE_BLOCK_HAT
            Instrument.BASS_DRUM ->
                Sound.BLOCK_NOTE_BLOCK_BASEDRUM
            Instrument.BELL ->
                Sound.BLOCK_NOTE_BLOCK_BELL
            Instrument.FLUTE ->
                Sound.BLOCK_NOTE_BLOCK_FLUTE
            Instrument.CHIME ->
                Sound.BLOCK_NOTE_BLOCK_CHIME
            Instrument.GUITAR ->
                Sound.BLOCK_NOTE_BLOCK_GUITAR
            Instrument.XYLOPHONE ->
                Sound.BLOCK_NOTE_BLOCK_XYLOPHONE
            Instrument.IRON_XYLOPHONE ->
                Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE
            Instrument.COW_BELL ->
                Sound.BLOCK_NOTE_BLOCK_COW_BELL
            Instrument.DIDGERIDOO ->
                Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO
            Instrument.BIT ->
                Sound.BLOCK_NOTE_BLOCK_BIT
            Instrument.BANJO ->
                Sound.BLOCK_NOTE_BLOCK_BANJO
            Instrument.PLING ->
                Sound.BLOCK_NOTE_BLOCK_PLING
            Instrument.PIANO ->
                Sound.BLOCK_NOTE_BLOCK_HARP
            else ->
                Sound.BLOCK_NOTE_BLOCK_HARP
        }
        return sound
    }

    private fun NoteBlock.pitch():Float {
        var pitch: Float
        when (this.note) {
            Note.sharp(0, Note.Tone.F) -> pitch = 0.5f
            Note.natural(0, Tone.G) -> pitch = 0.529732f
            Note.sharp(0, Tone.A) -> pitch = 0.561231f
            Note.natural(0, Tone.A) -> pitch = 0.594604f
            Note.sharp(0, Tone.A) -> pitch = 0.629961f
            Note.natural(0, Tone.B) -> pitch = 0.667420f
            Note.natural(0, Tone.C) -> pitch = 0.707107f
            Note.sharp(0, Tone.C) -> pitch = 0.749154f
            Note.natural(0, Tone.D) -> pitch = 0.793701f
            Note.sharp(0, Tone.D) -> pitch = 0.840896f
            Note.natural(0, Tone.D) -> pitch = 0.890899f
            Note.natural(1, Tone.F) -> pitch = 0.943874f
            Note.sharp(0, Tone.F) -> pitch = 1f
            Note.natural(1, Tone.G) -> pitch = 1.059463f
            Note.sharp(1, Tone.G) -> pitch = 1.122462f
            Note.natural(1, Tone.A) -> pitch = 1.189207f
            Note.sharp(1, Tone.A) -> pitch = 1.259921f
            Note.natural(1, Tone.B) -> pitch = 1.334840f
            Note.natural(1, Tone.C) -> pitch = 1.414214f
            Note.sharp(1, Tone.C) -> pitch = 1.498307f
            Note.natural(1, Tone.D) -> pitch = 1.587401f
            Note.sharp(1, Tone.D) -> pitch = 1.681793f
            Note.natural(1, Tone.E) -> pitch = 1.781797f
            Note.natural(1, Tone.F) -> pitch = 1.887749f
            Note.sharp(2, Tone.F) -> pitch = 2f
            else -> pitch = 1f
        }
        return pitch
    }
}
