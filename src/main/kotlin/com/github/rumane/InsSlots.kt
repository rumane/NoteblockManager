package com.github.rumane

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Instrument
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.inventory.ItemStack

enum class InsSlots(
    val material: Material,
    val displayName: String,
    val colorHex: String,
    val instrument: Instrument?,
    val sound: Sound?,
    val slot: Int
) {
    SLOT0(Material.OAK_WOOD, "Base", "#ffffff", Instrument.BASS_GUITAR, Sound.BLOCK_NOTE_BLOCK_BASS, 0),
    SLOT1(Material.SAND, "Snare Drum", "#ffffff", Instrument.SNARE_DRUM, Sound.BLOCK_NOTE_BLOCK_SNARE, 1),
    SLOT2(Material.GLASS, "Hihat", "#ffffff", Instrument.STICKS, Sound.BLOCK_NOTE_BLOCK_HAT, 2),
    SLOT3(Material.STONE, "Bass Drum", "#ffffff", Instrument.BASS_DRUM, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 3),
    SLOT4(Material.GOLD_BLOCK, "Bells", "#ffffff", Instrument.BELL, Sound.BLOCK_NOTE_BLOCK_BELL, 4),
    SLOT5(Material.CLAY, "Flute", "#ffffff", Instrument.FLUTE, Sound.BLOCK_NOTE_BLOCK_FLUTE, 5),
    SLOT6(Material.PACKED_ICE, "Chimes", "#ffffff", Instrument.CHIME, Sound.BLOCK_NOTE_BLOCK_CHIME, 6),
    SLOT7(Material.WHITE_WOOL, "Guitar", "#ffffff", Instrument.GUITAR, Sound.BLOCK_NOTE_BLOCK_GUITAR, 7),
    SLOT8(Material.BONE_BLOCK, "Xylophone", "#ffffff", Instrument.XYLOPHONE, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 8),
    SLOT9(Material.IRON_BLOCK, "Iron Xylophone", "#ffffff", Instrument.IRON_XYLOPHONE, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 9),
    SLOT10(Material.SOUL_SAND, "Cow Bell", "#ffffff", Instrument.COW_BELL, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10),
    SLOT11(Material.PUMPKIN, "Didgeridoo", "#ffffff", Instrument.DIDGERIDOO, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 11),
    SLOT12(Material.EMERALD_BLOCK, "Bit", "#ffffff", Instrument.BIT, Sound.BLOCK_NOTE_BLOCK_BIT, 12),
    SLOT13(Material.HAY_BLOCK, "Banjo", "#ffffff", Instrument.BANJO, Sound.BLOCK_NOTE_BLOCK_BANJO, 13),
    SLOT14(Material.GLOWSTONE, "Electric Piano", "#ffffff", Instrument.PLING, Sound.BLOCK_NOTE_BLOCK_PLING, 14),
    SLOT15(Material.GRASS_BLOCK, "Piano", "#ffffff", Instrument.PIANO, Sound.BLOCK_NOTE_BLOCK_HARP, 15),
    CHANGEGUI(Material.NOTE_BLOCK, "Set Tone", "#ffffff", null, null, 26)
    ;

    fun material() = material
    fun displayName() = displayName
    fun colorHex() = colorHex
    fun slot() = slot
    fun instrument() = instrument!!
    fun sound() = sound!!

    fun item(): ItemStack {
        val item = ItemStack(material())
        val itemMeta = item.itemMeta
        val itemNameComponent = Component.text(displayName()).color(TextColor.fromHexString(colorHex()))
            .decoration(TextDecoration.ITALIC, false)
        itemMeta.displayName(itemNameComponent)
        item.itemMeta = itemMeta
        return item
    }
}