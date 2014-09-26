package kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class OnLogout implements Listener {
	@EventHandler
	public void onLogout(PlayerQuitEvent event) {
		Player playerlogout = event.getPlayer();
		{

			playerlogout.getInventory().clear();
			playerlogout.giveExpLevels(-999);

		}
	}

	@EventHandler
	public void onKick(PlayerKickEvent event) {
		Player playerkick = event.getPlayer();
		{

			playerkick.getInventory().clear();
			playerkick.giveExpLevels(-999);
		}
	}
}