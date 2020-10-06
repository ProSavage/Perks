package net.savagelabs.perks.util

import com.cryptomorin.xseries.XMaterial
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SerializableItem(var material: XMaterial, var name: String, var lore: List<String>, var amt: Int) {

    fun buildItem(): ItemStack {
        var parseItem = material.parseItem(true)
        // hacky fixes :(
        if (!XMaterial.isNewVersion())
            parseItem = when (parseItem?.type) {
                Material.valueOf("REDSTONE_COMPARATOR_OFF") -> ItemStack(Material.valueOf("REDSTONE_COMPARATOR"))
                Material.valueOf("DIODE_BLOCK_OFF") -> ItemStack(Material.valueOf("DIODE"))
                Material.valueOf("WOODEN_DOOR") -> ItemStack(Material.valueOf("WOOD_DOOR"))
                Material.BREWING_STAND -> ItemStack(Material.valueOf("BREWING_STAND_ITEM"))
                Material.CAULDRON -> ItemStack(Material.valueOf("CAULDRON_ITEM"))
                Material.valueOf("BED_BLOCK") -> ItemStack(Material.valueOf("BED"))
                else -> parseItem
            }

        if (material == XMaterial.RED_DYE) {
            parseItem = ItemStack(XMaterial.INK_SAC.parseMaterial()!!, 1, 1)
        }

        return ItemBuilder(parseItem!!).name(name).lore(lore).amount(amt).glowing(false).build()
    }

}