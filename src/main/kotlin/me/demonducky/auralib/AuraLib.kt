package me.demonducky.auralib

import org.bukkit.plugin.Plugin

object AuraLib {
    lateinit var plugin: Plugin
        private set

    val MessageManager by lazy { MessageManager() }

    internal fun initialize (plugin: Plugin) {
        this.plugin = plugin
    }

    fun Plugin.useAuraLib() {
        initialize(this)
    }
}