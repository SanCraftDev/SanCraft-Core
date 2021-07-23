package de.davidcraft.sanoj.core.listeners;

import de.davidcraft.sanoj.core.main;
import de.myzelyam.api.vanish.PlayerHideEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FakeQuitListener implements Listener {

    @EventHandler
    public void onVanish(PlayerHideEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("prefix.admin") || player.isOp()) {
            main.sendQuitMessage(player.getName(), true);
        } else {
            main.sendQuitMessage(player.getName(), false);
        }
    }

}
