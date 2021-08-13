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
    var changeOption: Boolean

    val pitchTitle = Component.text("Set Pitch")
    val instrumentTitle = Component.text("Set Instrument")

    init {
        playerOption = HashMap()
        clickedBlock = HashMap()
        changeOption = true

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
        val inv = Bukkit.createInventory(null, 54, pitchTitle)
        inv.setPitchGuiItem()
        player.openInventory(inv)
    }

    fun openSetInstrumentGui(player: Player) {
        val inv = Bukkit.createInventory(null, 27, instrumentTitle)
        inv.init()
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

    fun getChangeBlockOption(): Boolean {
        return changeOption
    }

    fun setChangeBlockOption(bool: Boolean) {
        changeOption = bool
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
        PitchSlots.values().forEach {
            this.setItem(it.slot(), it.item())
        }
    }

    fun Inventory.init() {
        InsSlots.values().forEach {
            this.setItem(it.slot(), it.item())
        }
    }
}
