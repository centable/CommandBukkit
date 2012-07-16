package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandfeed implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandfeed(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			if(p.hasPermission("commandbukkit.feed")||p.isOp()){
				p.setFoodLevel(20);
				p.sendMessage(ChatColor.YELLOW + "You have fed yourself.");
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 1){
			Player targetPlayer = p.getServer().getPlayer(args[0]);
			if(p.hasPermission("commandbukkit.feed.others")||p.isOp()){
				if(targetPlayer == null){p.sendMessage(ChatColor.RED + "Player not online!");}else{
					targetPlayer.setFoodLevel(20);
					targetPlayer.sendMessage(ChatColor.YELLOW + "You have been fed by " + p.getDisplayName() + ChatColor.YELLOW +".");
					p.sendMessage(ChatColor.YELLOW + "You have fed " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
				}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else{p.sendMessage(ChatColor.RED + "Too many arguments!");}
		return false;
	}
}
