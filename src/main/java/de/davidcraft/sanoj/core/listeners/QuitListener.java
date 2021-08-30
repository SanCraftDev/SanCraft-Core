package de.davidcraft.sanoj.core.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        /*if (VanishAPI.isInvisible(player)) {
         event.setQuitMessage("");
         return;
         }**/
        if (player.hasPermission("prefix.admin") || player.isOp()) {
            event.setQuitMessage(ChatColor.DARK_RED + "« " + ChatColor.RED + player.getName());
        } else {
            event.setQuitMessage(ChatColor.DARK_RED + "« " + ChatColor.GREEN + player.getName());
        }
    }

}
