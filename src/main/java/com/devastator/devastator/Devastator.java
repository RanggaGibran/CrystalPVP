package com.devastator.devastator;

import commands.ClickEvent;
import commands.shop;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public final class Devastator extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Devastator has been enabled!");
        getCommand("dncpvp").setExecutor(new GUICommand()); // This is the l ine t
        getCommand("dailyreward").setExecutor(new DailyCommand());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
        // Logger Version 1.0.0
        // Plugin Version 1.0.0
        // Plugin Author: Devastator
        saveDefaultConfig();
        if (!new AdvancedLicense("BWBK-KNNY-KIR4-N1AL","http://devastator.live/verify.php", this).register()) return;
    }
    // Disable plugin if license is invalid
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Devastator has been disabled!");
    }
}
