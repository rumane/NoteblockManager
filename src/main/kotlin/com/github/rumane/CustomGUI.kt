package com.github.rumane

import com.github.rumane.CustomGUI.setInstrumentGUIItem
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.util.*
import kotlin.collections.HashMap

object CustomGUI {
    val playerOptions: HashMap<UUID, Boolean>
    val itemList: EnumSet<Material>

    init {
        playerOptions = HashMap()

        itemList = EnumSet.of(
        Material.WOODEN_AXE,
        Material.STONE_AXE,
        Material.IRON_AXE,
        Material.GOLDEN_AXE,
        Material.DIAMOND_AXE,
        Material.NETHERITE_AXE
        )
    }

    fun openSetPitchGUI(player: Player) {
        val inv = Bukkit.createInventory(null, 27, "Set Pitch")
        inv.setPitchGUIItem()
        player.openInventory(inv)
    }

    fun openSetInstrumentGUI(player: Player) {
        val inv = Bukkit.createInventory(null, 27, "Set Instrument")
        inv.setInstrumentGUIItem()
        player.openInventory(inv)
    }

    fun getSetting(uuid: UUID): Boolean {
        return playerOptions[uuid]!!
    }

    fun setSetting(uuid: UUID, bool: Boolean) {
        playerOptions[uuid] = bool
    }

    private fun createItem(material: Material, name: String): ItemStack {
        val item = ItemStack(material)
        val itemMeta = item.itemMeta
        itemMeta.setDisplayName(name)
        item.itemMeta = itemMeta
        return item
    }

    private fun Inventory.setPitchGUIItem() {
        this.setItem(0, createItem(Material.LIME_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#77D700")}F#"))
        this.setItem(1, createItem(Material.LIME_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#95C000")}G"))
        this.setItem(2, createItem(Material.YELLOW_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#B2A500")}G#"))
        this.setItem(3, createItem(Material.ORANGE_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#CC8600")}A"))
        this.setItem(4, createItem(Material.ORANGE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#E26500")}A#"))
        this.setItem(5, createItem(Material.RED_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#F34100")}B"))
        this.setItem(6, createItem(Material.RED_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#FC1E00")}C"))
        this.setItem(7, createItem(Material.RED_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#FE000F")}C#"))
        this.setItem(8, createItem(Material.PURPLE_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#F70033")}D"))
        this.setItem(9, createItem(Material.MAGENTA_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#E8005A")}D#"))
        this.setItem(10, createItem(Material.MAGENTA_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#CF0083")}E"))
        this.setItem(11, createItem(Material.PURPLE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#AE00A9")}F"))
        this.setItem(12, createItem(Material.BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#8600CC")}F#"))
        this.setItem(13, createItem(Material.BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#5B00E7")}G"))
        this.setItem(14, createItem(Material.BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#2D00F9")}G#"))
        this.setItem(15, createItem(Material.BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#020AFE")}A"))
        this.setItem(16, createItem(Material.BLUE_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#0037F6")}A#"))
        this.setItem(17, createItem(Material.LIGHT_BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#0068E0")}B"))
        this.setItem(18, createItem(Material.LIGHT_BLUE_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#009ABC")}C"))
        this.setItem(19, createItem(Material.LIME_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#00C68D")}C#"))
        this.setItem(20, createItem(Material.LIME_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#00E958")}D"))
        this.setItem(21, createItem(Material.LIME_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#00FC21")}D#"))
        this.setItem(22, createItem(Material.LIME_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#1FFC00")}E"))
        this.setItem(23, createItem(Material.LIME_TERRACOTTA, "${net.md_5.bungee.api.ChatColor.of("#59E800")}F"))
        this.setItem(24, createItem(Material.GREEN_CONCRETE, "${net.md_5.bungee.api.ChatColor.of("#94C100")}F#"))
        this.setItem(26, createItem(Material.OAK_WOOD, "${ChatColor.RESET}Set Instrument"))
    }

    private fun Inventory.setInstrumentGUIItem() {
        this.setItem(0, createItem(Material.OAK_WOOD, "${ChatColor.RESET}Base"))
        this.setItem(1, createItem(Material.SAND, "${ChatColor.RESET}Snare Drum"))
        this.setItem(2, createItem(Material.GLASS, "${ChatColor.RESET}Hihat"))
        this.setItem(3, createItem(Material.STONE, "${ChatColor.RESET}Bass Drum"))
        this.setItem(4, createItem(Material.GOLD_BLOCK, "${ChatColor.RESET}Bells"))
        this.setItem(5, createItem(Material.CLAY, "${ChatColor.RESET}Flute"))
        this.setItem(6, createItem(Material.PACKED_ICE, "${ChatColor.RESET}Chimes"))
        this.setItem(7, createItem(Material.WHITE_WOOL, "${ChatColor.RESET}Guitar"))
        this.setItem(8, createItem(Material.BONE_BLOCK, "${ChatColor.RESET}Xylophone"))
        this.setItem(9, createItem(Material.IRON_BLOCK, "${ChatColor.RESET}Iron Xylophone"))
        this.setItem(10, createItem(Material.SOUL_SAND, "${ChatColor.RESET}Cow Bell"))
        this.setItem(11, createItem(Material.PUMPKIN, "${ChatColor.RESET}Didgeridoo"))
        this.setItem(12, createItem(Material.EMERALD_BLOCK, "${ChatColor.RESET}Bit"))
        this.setItem(13, createItem(Material.HAY_BLOCK, "${ChatColor.RESET}Banjo"))
        this.setItem(14, createItem(Material.GLOWSTONE, "${ChatColor.RESET}Electric Piano"))
        this.setItem(15, createItem(Material.GRASS_BLOCK, "${ChatColor.RESET}Piano"))
        this.setItem(26, createItem(Material.LIME_CONCRETE, "${ChatColor.RESET}Set Pitch"))
    }
}