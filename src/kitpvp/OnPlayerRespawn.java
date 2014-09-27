
package aquanoxpvp.AquaNoxPVPPlugin.src.kitpvp;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class OnPlayerRespawn implements Listener {

    public void onPlayerRespawn(PlayerJoinEvent event){
                        
        
                        Player player = event.getPlayer();
        
                        player.playSound(player.getLocation(), Sound.NOTE_PLING, 10, 1);
			player.getInventory().clear();

			ItemStack ironsword = new ItemStack(Material.IRON_SWORD);
			ItemStack ironhelm = new ItemStack(Material.IRON_HELMET);
			ItemStack ironchestplate = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack ironboots = new ItemStack(Material.IRON_BOOTS);
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack FNS = new ItemStack(Material.FLINT_AND_STEEL);
			ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
			ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
			ItemStack arrow = new ItemStack(Material.ARROW, 1);

			bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
			FNS.setDurability((short) 64);

			player.getInventory().setHelmet(ironhelm);
			player.getInventory().setChestplate(ironchestplate);
			player.getInventory().setLeggings(ironleggings);
			player.getInventory().setBoots(ironboots);
			player.getInventory().addItem(ironsword);
			player.getInventory().addItem(bow);
			player.getInventory().addItem(FNS);
			player.getInventory().addItem(fishingrod);
			player.getInventory().addItem(food);
			player.getInventory().addItem(arrow);
    }
}
