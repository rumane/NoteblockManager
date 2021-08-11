package com.github.rumane

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.util.*
import kotlin.collections.HashMap

object CustomGui {
    val itemList: EnumSet<Material>
    val playerOption: HashMap<UUID, Boolean>
    val clickedBlock: HashMap<UUID, Block?>

    val pitchTitle = Component.text("Set Pitch")
    val instrumentTitle = Component.text("Set Instrument")

    val pitchSlot0 = createItem(Material.LIME_CONCRETE, "F#", "#77D700")
    val pitchSlot1 = createItem(Material.LIME_TERRACOTTA, "G", "#95C000")
    val pitchSlot2 = createItem(Material.YELLOW_TERRACOTTA, "G#", "#B2A500")
    val pitchSlot3 = createItem(Material.ORANGE_TERRACOTTA, "A", "#CC8600")
    val pitchSlot4 = createItem(Material.ORANGE_CONCRETE, "A#", "#E26500")
    val pitchSlot5 = createItem(Material.RED_CONCRETE, "B", "#E26500")
    val pitchSlot6 = createItem(Material.RED_CONCRETE, "C", "#FC1E00")
    val pitchSlot7 = createItem(Material.RED_CONCRETE, "C#", "#FE000F")
    val pitchSlot8 = createItem(Material.PURPLE_TERRACOTTA, "D", "#F70033")
    val pitchSlot9 = createItem(Material.MAGENTA_CONCRETE, "D#", "#E8005A")
    val pitchSlot10 = createItem(Material.MAGENTA_CONCRETE, "E", "#CF0083")
    val pitchSlot11 = createItem(Material.PURPLE_CONCRETE, "F", "#AE00A9")
    val pitchSlot12 = createItem(Material.BLUE_CONCRETE, "F#", "#8600CC")
    val pitchSlot13 = createItem(Material.BLUE_CONCRETE, "G", "#5B00E7")
    val pitchSlot14 = createItem(Material.BLUE_CONCRETE, "G#", "#2D00F9")
    val pitchSlot15 = createItem(Material.BLUE_CONCRETE, "A", "#020AFE")
    val pitchSlot16 = createItem(Material.BLUE_TERRACOTTA, "A#", "#0037F6")
    val pitchSlot17 = createItem(Material.LIGHT_BLUE_CONCRETE, "B", "#0068E0")
    val pitchSlot18 = createItem(Material.LIGHT_BLUE_CONCRETE, "C", "#009ABC")
    val pitchSlot19 = createItem(Material.LIME_TERRACOTTA, "C#", "#00C68D")
    val pitchSlot20 = createItem(Material.LIME_CONCRETE, "D", "#00E958")
    val pitchSlot21 = createItem(Material.LIME_CONCRETE, "D#", "#00FC21")
    val pitchSlot22 = createItem(Material.LIME_CONCRETE, "E", "#1FFC00")
    val pitchSlot23 = createItem(Material.LIME_TERRACOTTA, "F", "#59E800")
    val pitchSlot24 = createItem(Material.GREEN_CONCRETE, "F#", "#94C100")
    val pitchSlot26 = createItem(Material.NOTE_BLOCK, "Set Instrument", "#ffffff")

    val instrumentSlot0 = createItem(Material.OAK_WOOD, "Base", "#ffffff")
    val instrumentSlot1 = createItem(Material.SAND, "Snare Drum", "#ffffff")
    val instrumentSlot2 = createItem(Material.GLASS, "Hihat", "#ffffff")
    val instrumentSlot3 = createItem(Material.STONE, "Bass Drum", "#ffffff")
    val instrumentSlot4 = createItem(Material.GOLD_BLOCK, "Bells", "#ffffff")
    val instrumentSlot5 = createItem(Material.CLAY, "Flute", "#ffffff")
    val instrumentSlot6 = createItem(Material.PACKED_ICE, "Chimes", "#ffffff")
    val instrumentSlot7 = createItem(Material.WHITE_WOOL, "Guitar", "#ffffff")
    val instrumentSlot8 = createItem(Material.BONE_BLOCK, "Xylophone", "#ffffff")
    val instrumentSlot9 = createItem(Material.IRON_BLOCK, "Iron Xylophone", "#ffffff")
    val instrumentSlot10 = createItem(Material.SOUL_SAND, "Cow Bell", "#ffffff")
    val instrumentSlot11 = createItem(Material.PUMPKIN, "Didgeridoo", "#ffffff")
    val instrumentSlot12 = createItem(Material.EMERALD_BLOCK, "Bit", "#ffffff")
    val instrumentSlot13 = createItem(Material.HAY_BLOCK, "Banjo", "#ffffff")
    val instrumentSlot14 = createItem(Material.GLOWSTONE, "Electric Piano", "#ffffff")
    val instrumentSlot15 = createItem(Material.GRASS_BLOCK, "Piano", "#ffffff")
    val instrumentSlot26 = createItem(Material.NOTE_BLOCK, "Set Pitch", "#ffffff")

    init {
        playerOption = HashMap()
        clickedBlock = HashMap()

        itemList = EnumSet.of(
            Material.WOODEN_AXE,
            Material.STONE_AXE,
            Material.IRON_AXE,
            Material.GOLDEN_AXE,
            Material.DIAMOND_AXE,
            Material.NETHERITE_AXE
        )
    }

    fun openSetPitchGui(player: Player) {
        val inv = Bukkit.createInventory(null, 27, pitchTitle)
        inv.setPitchGuiItem()
        player.openInventory(inv)
    }

    fun openSetInstrumentGui(player: Player) {
        val inv = Bukkit.createInventory(null, 27, instrumentTitle)
        inv.setInstrumentGuiItem()
        player.openInventory(inv)
    }

    fun getOption(player: Player): Boolean {
        return playerOption[player.uniqueId]!!
    }

    fun setOption(player: Player, bool: Boolean) {
        playerOption[player.uniqueId] = bool
    }

    fun getClickedBlock(player: Player): Block? {
        return clickedBlock[player.uniqueId]
    }

    fun setClickedBlock(player: Player, block: Block?) {
        clickedBlock[player.uniqueId] = block
    }

    private fun createItem(material: Material, name: String, color: String): ItemStack {
        val item = ItemStack(material)
        val itemMeta = item.itemMeta
        val itemNameComponent = Component.text(name).color(TextColor.fromHexString(color)).decoration(TextDecoration.ITALIC, false)
        itemMeta.displayName(itemNameComponent)
        item.itemMeta = itemMeta
        return item
    }

    private fun Inventory.setPitchGuiItem() {
        this.setItem(0, pitchSlot0)
        this.setItem(1, pitchSlot1)
        this.setItem(2, pitchSlot2)
        this.setItem(3, pitchSlot3)
        this.setItem(4, pitchSlot4)
        this.setItem(5, pitchSlot5)
        this.setItem(6, pitchSlot6)
        this.setItem(7, pitchSlot7)
        this.setItem(8, pitchSlot8)
        this.setItem(9, pitchSlot9)
        this.setItem(10, pitchSlot10)
        this.setItem(11, pitchSlot11)
        this.setItem(12, pitchSlot12)
        this.setItem(13, pitchSlot13)
        this.setItem(14, pitchSlot14)
        this.setItem(15, pitchSlot15)
        this.setItem(16, pitchSlot16)
        this.setItem(17, pitchSlot17)
        this.setItem(18, pitchSlot18)
        this.setItem(19, pitchSlot19)
        this.setItem(20, pitchSlot20)
        this.setItem(21, pitchSlot21)
        this.setItem(22, pitchSlot22)
        this.setItem(23, pitchSlot23)
        this.setItem(24, pitchSlot24)
        this.setItem(26, pitchSlot26)
    }

    private fun Inventory.setInstrumentGuiItem() {
        this.setItem(0, instrumentSlot0)
        this.setItem(1, instrumentSlot1)
        this.setItem(2, instrumentSlot2)
        this.setItem(3, instrumentSlot3)
        this.setItem(4, instrumentSlot4)
        this.setItem(5, instrumentSlot5)
        this.setItem(6, instrumentSlot6)
        this.setItem(7, instrumentSlot7)
        this.setItem(8, instrumentSlot8)
        this.setItem(9, instrumentSlot9)
        this.setItem(10, instrumentSlot10)
        this.setItem(11, instrumentSlot11)
        this.setItem(12, instrumentSlot12)
        this.setItem(13, instrumentSlot13)
        this.setItem(14, instrumentSlot14)
        this.setItem(15, instrumentSlot15)
        this.setItem(26, instrumentSlot26)
    }
}
