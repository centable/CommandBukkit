package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Commandclear implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandclear(CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			if(p.hasPermission("commandbukkit.clear")||p.isOp()){
				Inventory inv = p.getInventory();
				inv.clear();
				p.sendMessage(ChatColor.YELLOW + "Your inventory has been cleared.");
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.clear.others")||p.isOp()){
				Player targetPlayer = p.getServer().getPlayer(args[0]);
				if(targetPlayer == null){
					p.sendMessage(ChatColor.RED + "Player not online!");
				}else{
					Inventory inv = targetPlayer.getInventory();
					inv.clear();
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your inventory has been cleared by " + p.getDisplayName() + ChatColor.YELLOW + ".");
					p.sendMessage(ChatColor.YELLOW + "You have cleared " + targetPlayer.getDisplayName() + ChatColor.YELLOW + "'s inventory.");
				}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else{
			p.sendMessage(ChatColor.RED + "Too many arguments.");
		}
		return false;
	}
	
}
