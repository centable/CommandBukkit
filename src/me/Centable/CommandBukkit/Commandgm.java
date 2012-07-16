package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandgm implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandgm(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			p.sendMessage(ChatColor.YELLOW + "Your current gamemode is " + p.getGameMode() + ".");
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.gm")||p.isOp()){
				if(args[0].equalsIgnoreCase("1")|| args[0].equalsIgnoreCase("creative")){
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to creative.");
				}else if(args[0].equalsIgnoreCase("0")||args[0].equalsIgnoreCase("survival")){
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage(ChatColor.YELLOW + "Your gamemode has been set to survival.");
				}else{p.sendMessage(ChatColor.RED + "Unknown gamemode.");}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 2){
			Player targetPlayer = p.getServer().getPlayer(args[0]);
			if(p.hasPermission("commandbukkit.gm.others")||p.isOp()){
				if(targetPlayer == null){
					p.sendMessage(ChatColor.RED + "Player not online!");
				}else{
					if(args[1].equalsIgnoreCase("1")||args[1].equalsIgnoreCase("creative")){
						targetPlayer.setGameMode(GameMode.CREATIVE);
						p.sendMessage(ChatColor.YELLOW + "Gamemode changed to creative for " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
						targetPlayer.sendMessage(ChatColor.YELLOW + "Gamemode changed to creative by " + p.getDisplayName() + ChatColor.YELLOW + ".");
					}else if(args[1].equalsIgnoreCase("0")||args[1].equalsIgnoreCase("survival")){
						targetPlayer.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(ChatColor.YELLOW + "Gamemode changed to survival for " + targetPlayer.getDisplayName() + ChatColor.YELLOW + ".");
						targetPlayer.sendMessage(ChatColor.YELLOW + "Gamemode changed to survival by " + p.getDisplayName() + ChatColor.YELLOW + ".");
					}else{p.sendMessage(ChatColor.RED + "Unknown gamemode.");}
				}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else{p.sendMessage(ChatColor.RED + "Too many arguments!");}
		return false;
	}

}
