package me.Centable.CommandBukkit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandbroadcast implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandbroadcast(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("commandbukkit.broadcast")||p.isOp()){
			if(args.length == 0){
				p.sendMessage(ChatColor.RED + "Not enough arguments.");
			}else{
				String message = "";
				for(int i = 1; i<args.length; i++)
					message = message + args[i] + " ";
				Bukkit.broadcastMessage(ChatColor.RED + "[Broadcast] " + ChatColor.YELLOW + message);
			}
		}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		return false;
	}

}
