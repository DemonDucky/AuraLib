package me.demonducky.auralib

import org.bukkit.ChatColor
import org.bukkit.entity.Entity

class MessageManager {

    fun sendMessage(message: String, target: Entity, prefix: String?, suffix: String?) {
        val prefixConverted = if (prefix != null) "$prefix " else ""
        val suffixConverted = if (suffix != null) " $suffix" else ""
        val convertedMessage = ChatColor.translateAlternateColorCodes(
            '&',
            "$prefixConverted$message$suffixConverted"
        )
        target.sendMessage(convertedMessage)
    }
}