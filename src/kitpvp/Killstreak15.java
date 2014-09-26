package kitpvp;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.player.*;
import org.bukkit.event.player.*;
import org.bukkit.event.world.WorldEvent;
import org.bukkit.event.entity.*;
import org.bukkit.World;

public class Killstreak15 implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onSnowBall(EntityDamageByEntityEvent event) {

		if (event.getDamager() instanceof Snowball
				&& event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			player.damage(20);
			player.getLocation().getWorld().createExplosion(player.getLocation(), 0.0F);
			player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 10, 1);
			
		}
	}

	@EventHandler
	public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
		int reqlevel = event.getNewLevel();
		if (reqlevel == 15) {

			Player player = event.getPlayer();

			ItemStack snowball = new ItemStack(Material.SNOW_BALL, 5);
			player.getInventory().addItem(snowball);
			Bukkit.broadcastMessage(ChatColor.BLUE + player.getDisplayName()
					+ ChatColor.GRAY + " is on a 15 killing-rampage!");
			return true;

		}
		return false;
	}

}
