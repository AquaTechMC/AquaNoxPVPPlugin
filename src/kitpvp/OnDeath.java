package kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class OnDeath implements Listener {
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player dead = event.getEntity().getPlayer();
		Player killer = dead.getKiller();

		
		event.getDrops().clear();
		event.setDroppedExp(0);

		event.setDeathMessage(ChatColor.RED + dead.getDisplayName()
				+ ChatColor.GRAY + " ➜ was killed by ➜ " + ChatColor.BLUE
				+ killer.getName() + ChatColor.GRAY + " using "
				+ ChatColor.DARK_AQUA + killer.getItemInHand().getType()
				+ ChatColor.GRAY + " with " + ChatColor.DARK_GREEN
				+ killer.getPlayer().getHealth() + ChatColor.GRAY
				+ " hearts left.");

		ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE);

		killer.getInventory().addItem(goldenapple);

		killer.giveExpLevels(1);
		killer.playSound(killer.getLocation(), Sound.BAT_HURT, 10, 1);
	}

}
