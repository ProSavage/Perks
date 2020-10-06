package net.savagelabs.perks.struct.perk

import net.savagelabs.perks.util.SerializableItem
import org.bukkit.event.Listener

abstract class Perk {
    abstract val name: String
    abstract val guiRow: Int
    abstract val guiColumn: Int
    abstract val guiItem: SerializableItem
    abstract val multiplier: Double
    abstract val listener: Listener
}
