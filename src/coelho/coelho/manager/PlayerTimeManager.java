package coelho.coelho.manager;

import coelho.coelho.dao.PlayerTimeDao;
import coelho.coelho.models.PlayerTime;

public class PlayerTimeManager {
	
	public static PlayerTime createPlayer(String name) {
		PlayerTime player = new PlayerTime(name, 0);
		PlayerTimeDao.getPlayers().put(name, player);
		return player;
	}
	
	public void load() {
		
	}
}