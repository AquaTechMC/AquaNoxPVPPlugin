package kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Kitpvp extends JavaPlugin {
	public static Plugin plugin;

	public void onEnable() {
		plugin = this;
		getLogger().info("Plugin Initialized");
		Bukkit.getPluginManager().registerEvents(new OnDeath(), this);
		Bukkit.getPluginManager().registerEvents(new Killstreak3(), this);
		Bukkit.getPluginManager().registerEvents(new Killstreak5(), this);
		Bukkit.getPluginManager().registerEvents(new Killstreak7(), this);
		Bukkit.getPluginManager().registerEvents(new Killstreak9(), this);
		Bukkit.getPluginManager().registerEvents(new Killstreak15(), this);
		Bukkit.getPluginManager().registerEvents(new OnLogout(), this);
		
		
		
		CommandKitPVP cmds = new CommandKitPVP();

		getCommand("kitpvp").setExecutor(cmds);
		getCommand("Gamemaster").setExecutor(cmds);
		getCommand("Ratchet").setExecutor(cmds);
	}

	public static Plugin getInstance() {
		return plugin;
	}

}
