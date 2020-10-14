package coelho.coelho;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import coelho.coelho.commands.TimeCommand;
import coelho.coelho.listeners.PlayerJoinListener;
import coelho.coelho.runnables.PlayerTimeRunnable;

public class TimeOnline extends JavaPlugin {
	
	public void onEnable() {
		Commands();
		Listeners();
		Messages();
		
		new PlayerTimeRunnable();
	}
	
	private void Messages() {
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage("§a[TimeOnline] §fPlugin habilited");
		getServer().getConsoleSender().sendMessage("§a[TimeOnline] §fAuthor §a" + getDescription().getAuthors().get(0));
		getServer().getConsoleSender().sendMessage("§a[TimeOnline] §fVersion §a" + getDescription().getVersion());
		getServer().getConsoleSender().sendMessage("");
	}

	private void Listeners() {
		Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
	}

	private void Commands() {
		getCommand("time").setExecutor(new TimeCommand());
	}

	public void onDisable() {
		
	}
	
	public static TimeOnline getTimeOnline() {
		return getPlugin(TimeOnline.class);
	}
}