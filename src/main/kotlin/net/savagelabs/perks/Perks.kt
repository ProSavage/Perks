package net.savagelabs.perks

import org.bukkit.plugin.java.JavaPlugin

class Perks : JavaPlugin() {

    companion object {
        lateinit var INSTANCE: Perks
    }

    override fun onEnable() {
        INSTANCE = this
    }

    override fun onDisable() {

    }

}