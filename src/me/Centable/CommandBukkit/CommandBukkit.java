package me.Centable.CommandBukkit;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandBukkit extends JavaPlugin{
	// Just a few notes before you get into the code...
	// When I get into coding, you notice that after every
	// p.getDisplayName() or targetPlayer.getDisplayName()
	// I put a ChatColor.(Color of message)...
	// This is because of the iChatPlayerList, it will change the name
	// and the rest of the message to the color.  This prevents it.
	public final Logger logger = Logger.getLogger("Minecraft");
	public static CommandBukkit plugin;
	public Commandtime timeEx;
	public Commandnick nickEx;
	public Commandbroadcast broadcastEx;
	public Commandclear clearEx;
	public Commandfeed feedEx;
	public Commandfly flyEx;
	public Commandgm gmEx;
	public Commandheal healEx;
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been disabled.");
	}
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled!");
		getConfig().options().copyDefaults(true);
		saveConfig();
		timeEx = new Commandtime(this);
		getCommand("time").setExecutor(timeEx);
		nickEx = new Commandnick(this);
		getCommand("nick").setExecutor(nickEx);
		broadcastEx = new Commandbroadcast(this);
		getCommand("broadcast").setExecutor(broadcastEx);
		getCommand("bc").setExecutor(broadcastEx);
		clearEx = new Commandclear(this);
		getCommand("clear").setExecutor(clearEx);
		getCommand("ci").setExecutor(clearEx);
		getCommand("clearinventory").setExecutor(clearEx);
		feedEx = new Commandfeed(this);
		getCommand("feed").setExecutor(feedEx);
		flyEx = new Commandfly(this);
		getCommand("fly").setExecutor(flyEx);
		gmEx = new Commandgm(this);
		getCommand("gm").setExecutor(gmEx);
		getCommand("gamemode").setExecutor(gmEx);
		healEx = new Commandheal(this);
		getCommand("heal").setExecutor(healEx);
	}
}