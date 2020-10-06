package net.savagelabs.perks.struct.perk.impl

import net.savagelabs.perks.struct.perk.Perk
import net.savagelabs.perks.util.SerializableItem
import net.savagelabs.skyblockx.core.getIPlayer
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent

class MobDamagePerk(
    override val name: String = "Mob Damage Perk",
    override val guiRow: Int,
    override val guiColumn: Int,
    override val guiItem: SerializableItem,
    override val multiplier: Double
) : Perk() {

    override val listener: Listener = PerkListener()

    class PerkListener : Listener {

        @EventHandler
        fun onMobDamage(event: EntityDamageByEntityEvent) {
            if (event.damager !is Player
                || !(event.damager as Player).getIPlayer().isOnOwnIsland()
            ) return






        }

    }
}