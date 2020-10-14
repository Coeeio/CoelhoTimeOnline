package coelho.coelho.runnables;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import coelho.coelho.dao.PlayerTimeDao;
import coelho.coelho.manager.PlayerTimeManager;
import coelho.coelho.models.PlayerTime;

public class PlayerTimeRunnable {
	
	public PlayerTimeRunnable() {
		new BukkitRunnable() {
			
			@Override
			public void run() {
				for (Player players : Bukkit.getOnlinePlayers()) {
					PlayerTime player = PlayerTimeDao.getPlayer(players.getName());
					
					if (player == null) {
						player = PlayerTimeManager.createPlayer(players.getName());
					}
					player.setTime(player.getTime() + 1);
				}
			}
		};
	}
}