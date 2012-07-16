package me.Centable.CommandBukkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandnick implements CommandExecutor {
	@SuppressWarnings("unused")
	private CommandBukkit plugin;
	public Commandnick (CommandBukkit plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
		if(args.length == 0){
			String name = p.getDisplayName();
			p.sendMessage(ChatColor.YELLOW + "Your current display name is " + name + ChatColor.YELLOW + ".");
		}else if(args.length == 1){
			if(p.hasPermission("commandbukkit.nick")){
				String name = args[0];
				if(args[0].contains("&1")){
					p.setDisplayName(ChatColor.DARK_BLUE + name.replaceFirst("&1", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&2")){
					p.setDisplayName(ChatColor.DARK_GREEN + name.replaceFirst("&2", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&3")){
					p.setDisplayName(ChatColor.DARK_AQUA + name.replaceFirst("&3", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&4")){
					p.setDisplayName(ChatColor.DARK_RED + name.replaceFirst("&4", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&5")){
					p.setDisplayName(ChatColor.DARK_PURPLE + name.replaceFirst("&5", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&6")){
					p.setDisplayName(ChatColor.GOLD + name.replaceFirst("&6", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&7")){
					p.setDisplayName(ChatColor.GRAY + name.replaceFirst("&7", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&8")){
					p.setDisplayName(ChatColor.DARK_GRAY + name.replaceFirst("&8", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&9")){
					p.setDisplayName(ChatColor.BLUE + name.replaceFirst("&9", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&0")){
					p.setDisplayName(ChatColor.BLACK + name.replaceFirst("&0", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&a")){
					p.setDisplayName(ChatColor.GREEN + name.replaceFirst("&a", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&b")){
					p.setDisplayName(ChatColor.AQUA + name.replaceFirst("&b", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&c")){
					p.setDisplayName(ChatColor.RED + name.replaceFirst("&c", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&d")){
					p.setDisplayName(ChatColor.LIGHT_PURPLE + name.replaceFirst("&d", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&e")){
					p.setDisplayName(ChatColor.YELLOW + name.replaceFirst("&e", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&k")){
					p.setDisplayName(ChatColor.MAGIC + name.replaceFirst("&k", "") + ChatColor.WHITE);
					p.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else{p.setDisplayName(ChatColor.WHITE + name);}
			}else{p.sendMessage(ChatColor.RED + "You don't have permission.");}
		}else if(args.length == 2){
			Player targetPlayer = p.getServer().getPlayer(args[0]);
			if(targetPlayer == null){
				p.sendMessage(ChatColor.RED + "Player not online!");
			}else{
				String name = args[1];
				if(args[0].startsWith("&1")){
					targetPlayer.setDisplayName(ChatColor.DARK_BLUE + name.replaceFirst("&1", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&2")){
					targetPlayer.setDisplayName(ChatColor.DARK_GREEN + name.replaceFirst("&2", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&3")){
					targetPlayer.setDisplayName(ChatColor.DARK_AQUA + name.replaceFirst("&3", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&4")){
					targetPlayer.setDisplayName(ChatColor.DARK_RED + name.replaceFirst("&4", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&5")){
					targetPlayer.setDisplayName(ChatColor.DARK_PURPLE + name.replaceFirst("&5", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&6")){
					targetPlayer.setDisplayName(ChatColor.GOLD + name.replaceFirst("&6", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&7")){
					targetPlayer.setDisplayName(ChatColor.GRAY + name.replaceFirst("&7", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&8")){
					targetPlayer.setDisplayName(ChatColor.DARK_GRAY + name.replaceFirst("&8", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&9")){
					targetPlayer.setDisplayName(ChatColor.BLUE + name.replaceFirst("&9", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&0")){
					targetPlayer.setDisplayName(ChatColor.BLACK + name.replaceFirst("&0", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&a")){
					targetPlayer.setDisplayName(ChatColor.GREEN + name.replaceFirst("&a", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&b")){
					targetPlayer.setDisplayName(ChatColor.AQUA + name.replaceFirst("&b", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&c")){
					targetPlayer.setDisplayName(ChatColor.RED + name.replaceFirst("&c", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&d")){
					targetPlayer.setDisplayName(ChatColor.LIGHT_PURPLE + name.replaceFirst("&d", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&e")){
					targetPlayer.setDisplayName(ChatColor.YELLOW + name.replaceFirst("&e", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else if(args[0].startsWith("&k")){
					targetPlayer.setDisplayName(ChatColor.MAGIC + name.replaceFirst("&k", "") + ChatColor.WHITE);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been changed to " + p.getDisplayName() + ChatColor.YELLOW + ".");
				}else{
					targetPlayer.setDisplayName(ChatColor.WHITE + name);
					targetPlayer.sendMessage(ChatColor.YELLOW + "Your display name has been set to " + name + ChatColor.YELLOW + ".");
				}
			}
		}else{p.sendMessage(ChatColor.RED + "Too many arguments!");}
		return false;
	}

}
