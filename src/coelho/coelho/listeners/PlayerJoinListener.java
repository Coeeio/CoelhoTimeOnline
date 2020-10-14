package coelho.coelho.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import coelho.coelho.dao.PlayerTimeDao;
import coelho.coelho.manager.PlayerTimeManager;
import coelho.coelho.models.PlayerTime;

public class PlayerJoinListener implements Listener {
	
	@EventHandler
	public void listener(PlayerJoinEvent event) {
		PlayerTime player = PlayerTimeDao.getPlayer(event.getPlayer().getName());
		
		if (player == null) {
			player = PlayerTimeManager.createPlayer(event.getPlayer().getName());
		}
	}
}