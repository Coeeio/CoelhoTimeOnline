package coelho.coelho.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import coelho.coelho.dao.PlayerTimeDao;
import coelho.coelho.manager.PlayerTimeManager;
import coelho.coelho.models.PlayerTime;

public class TimeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return false;
		}
		PlayerTime player = PlayerTimeDao.getPlayer(sender.getName());
		
		if (player == null) {
			player = PlayerTimeManager.createPlayer(sender.getName());
		}
		sender.sendMessage("§fTime: §a" + player.getTimeFormated());
		return false;
	}
}