package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandfly implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandfly(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			p.sendMessage(ChatColor.RED + "Incorrect sytnax.");
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.fly")||p.isOp()){
				if(args[0].equalsIgnoreCase("on")){
					p.setAllowFlight(true);
					p.sendMessage(ChatColor.YELLOW + "Flight enabled.");
				}else if(args[0].equalsIgnoreCase("off")){
					p.setAllowFlight(false);
					p.sendMessage(ChatColor.YELLOW + "Flight disabled.");
				}else{p.sendMessage(ChatColor.RED + "Unknown arguments.");}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 2){
			if(p.hasPermission("commandbukkit.fly.others")||p.isOp()){
				Player targetPlayer = p.getServer().getPlayer(args[0]);
				if(targetPlayer == null){
					p.sendMessage(ChatColor.RED + "Player not online!");
				}else{
					if(args[1].equalsIgnoreCase("on")){
						targetPlayer.setAllowFlight(true);
						p.sendMessage(ChatColor.YELLOW + "Flight enabled for " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
						targetPlayer.sendMessage(ChatColor.YELLOW + "Flight enabled by " + p.getDisplayName() + ChatColor.YELLOW + ".");
					}else if(args[1].equalsIgnoreCase("off")){
						targetPlayer.setAllowFlight(false);
						p.sendMessage(ChatColor.YELLOW + "Flight disabled for " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
						targetPlayer.sendMessage(ChatColor.YELLOW + "Flight disabled by " + p.getDisplayName() + ChatColor.YELLOW + ".");
					}else{p.sendMessage(ChatColor.RED + "Unknown arguments.");}
				}
			}else{p.sendMessage(ChatColor.RED + "You don't have permisson.");}
		}else{p.sendMessage(ChatColor.RED + "Too many arguments!");}
		return false;
	}

}
