package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandheal implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandheal(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			if(p.hasPermission("commandbukkit.heal")||p.isOp()){
				p.setHealth(20);
				p.setFoodLevel(20);
				p.sendMessage(ChatColor.YELLOW + "You've healed yourself.");
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.heal.other")||p.isOp()){
				Player targetPlayer = p.getServer().getPlayer(args[0]);
				if(targetPlayer == null){p.sendMessage(ChatColor.RED + "Player not online!");}else{
					targetPlayer.setHealth(20);
					targetPlayer.setFoodLevel(20);
					p.sendMessage(ChatColor.YELLOW + "You have fed " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
					targetPlayer.sendMessage(ChatColor.YELLOW + "You have been fed by " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else{p.sendMessage(ChatColor.RED + "Too many arguments!");}
		return false;
	}

}
