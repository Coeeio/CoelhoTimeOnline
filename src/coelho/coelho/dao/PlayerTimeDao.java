package coelho.coelho.dao;

import java.util.HashMap;
import java.util.Map;

import coelho.coelho.models.PlayerTime;

public class PlayerTimeDao {
	
	private static Map<String, PlayerTime> players = new HashMap<>();
	
	public static Map<String, PlayerTime> getPlayers() {
		return players;
	}
	
	public static PlayerTime getPlayer(String name) {
		return getPlayers().getOrDefault(name, null);
	}
}