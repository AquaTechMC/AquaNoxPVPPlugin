package kitpvp;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.player.*;
import org.bukkit.event.player.*;

public class Killstreak3 implements Listener {

	@EventHandler
	public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

		Player player = event.getPlayer();

		int reqlevel = event.getNewLevel();
		if (reqlevel == 3){

			player.addPotionEffect(new PotionEffect(
					PotionEffectType.REGENERATION, 100, 1));
			Bukkit.broadcastMessage(ChatColor.BLUE + player.getDisplayName()
					+ ChatColor.GRAY + " is on a 3 killstreak!");
					return true;

		}
		return false;
	}
}
