package com.github.rumane

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Material
import org.bukkit.Note.Tone
import org.bukkit.inventory.ItemStack

enum class PitchSlots(
    val material: Material,
    val displayName: String,
    val colorHex: String,
    val tone: Tone?,
    val isSharp: Boolean?,
    val octave: Int?,
    val pitch: Float?,
    val slot:Int
) {
    SLOT0(Material.LIME_CONCRETE, "F#", "#77D700", Tone.F, true, 0, 0.5f, 0),
    SLOT1(Material.LIME_TERRACOTTA, "G", "#95C000", Tone.G, false, 0, 0.529732f, 1),
    SLOT2(Material.YELLOW_TERRACOTTA, "G#", "#B2A500", Tone.G, true, 0, 0.561231f, 2),
    SLOT3(Material.ORANGE_TERRACOTTA, "A", "#CC8600", Tone.A, false, 0, 0.594604f, 3),
    SLOT4(Material.ORANGE_CONCRETE, "A#", "#E26500", Tone.A, true, 0, 0.629961f, 4),
    SLOT5(Material.RED_CONCRETE, "B", "#E26500", Tone.B, false, 0, 0.667420f, 5),
    SLOT6(Material.RED_CONCRETE, "C", "#FC1E00", Tone.C, false, 0, 0.707107f, 6),
    SLOT7(Material.RED_CONCRETE, "C#", "#FE000F", Tone.C, true, 0, 0.749154f, 7),
    SLOT8(Material.PURPLE_TERRACOTTA, "D", "#F70033", Tone.D, false, 0, 0.793701f, 8),
    SLOT9(Material.MAGENTA_CONCRETE, "D#", "#E8005A", Tone.D, true, 0, 0.840896f, 18),
    SLOT10(Material.MAGENTA_CONCRETE, "E", "#CF0083", Tone.E, false, 0, 0.890899f, 19),
    SLOT11(Material.PURPLE_CONCRETE, "F", "#AE00A9", Tone.F, false, 0, 0.943874f, 20),
    SLOT12(Material.BLUE_CONCRETE, "F#", "#8600CC", Tone.F, true, 1, 1f, 21),
    SLOT13(Material.BLUE_CONCRETE, "G", "#5B00E7", Tone.G, false, 1, 1.059463f, 22),
    SLOT14(Material.BLUE_CONCRETE, "G#", "#2D00F9", Tone.G, true, 1, 1.122462f, 23),
    SLOT15(Material.BLUE_CONCRETE, "A", "#020AFE", Tone.A, false, 1, 1.189207f, 24),
    SLOT16(Material.BLUE_TERRACOTTA, "A#", "#0037F6", Tone.A, true, 1, 1.259921f, 25),
    SLOT17(Material.LIGHT_BLUE_CONCRETE, "B", "#0068E0", Tone.B, false, 1, 1.334840f, 26),
    SLOT18(Material.LIGHT_BLUE_CONCRETE, "C", "#009ABC", Tone.C, false, 1, 1.414214f, 36),
    SLOT19(Material.LIME_TERRACOTTA, "C#", "#00C68D", Tone.C, true, 1, 1.498307f, 37),
    SLOT20(Material.LIME_CONCRETE, "D", "#00E958", Tone.D, false, 1, 1.587401f, 38),
    SLOT21(Material.LIME_CONCRETE, "D#", "#00FC21", Tone.D, true, 1, 1.681793f, 39),
    SLOT22(Material.LIME_CONCRETE, "E", "#1FFC00", Tone.E, false, 1, 1.781797f, 40),
    SLOT23(Material.LIME_TERRACOTTA, "F", "#59E800", Tone.F, false, 1, 1.887749f, 41),
    SLOT24(Material.GREEN_CONCRETE, "F#", "#94C100", Tone.F, true, 2, 2f, 42),
    CHANGEGUI(Material.NOTE_BLOCK, "Set Instrument", "#ffffff", null, null, null, null, 53)
    ;

    fun material() = material
    fun displayName() = displayName
    fun colorHex() = colorHex
    fun tone() = tone!!
    fun isSharp() = isSharp!!
    fun octave() = octave!!
    fun pitch() = pitch!!
    fun slot() = slot

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