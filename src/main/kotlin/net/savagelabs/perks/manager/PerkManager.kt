package net.savagelabs.perks.manager

import net.savagelabs.perks.Perks
import net.savagelabs.perks.struct.perk.Perk
import net.savagelabs.perks.util.log
import org.bukkit.Bukkit
import java.lang.IllegalArgumentException

object PerkManager {

    private val perks = HashSet<Perk>()

    fun register(name: String, perk: Perk) {
        Bukkit.getPluginManager().registerEvents(perk.listener, Perks.INSTANCE)
        perks.add(perk)
        log("Registered perk $name & it's listener.")
    }

}