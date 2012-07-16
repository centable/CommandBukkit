package me.Centable.CommandBukkit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandtime implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandtime(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			p.sendMessage(ChatColor.RED + "Incorrect syntax (/time <time>)");
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.time")||p.isOp()){
				World world = p.getWorld();
				if(args[0].equalsIgnoreCase("day")){
					world.setTime(8000);
					Bukkit.broadcastMessage(ChatColor.YELLOW + "The time was set to day by " + p.getDisplayName() + ".");
				}else if(args[0].equalsIgnoreCase("noon")){
					world.setTime(6000);
					Bukkit.broadcastMessage(ChatColor.YELLOW + "The time was set to noon by " + p.getDisplayName() + ".");
				}else if(args[0].equalsIgnoreCase("night")){
					world.setTime(16000);
					Bukkit.broadcastMessage(ChatColor.YELLOW + "The time was set to night by " + p.getDisplayName() + ".");
				}else if(args[0].equalsIgnoreCase("midnight")){
					world.setTime(20000);
				}else{p.sendMessage(ChatColor.RED + "Unknown time format (day, night, noon, midnight)");}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else{p.sendMessage(ChatColor.RED + "Incorrect syntax (/time <time>)");}
		return false;
	}

}
