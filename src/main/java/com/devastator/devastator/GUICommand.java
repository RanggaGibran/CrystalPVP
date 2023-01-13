package com.devastator.devastator;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("dncpvp")) {
            // Command reload plugin
            if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("dncpvp.reload")) {
                    sender.sendMessage(ChatColor.GREEN + "Reloading Devastator...");
                    Bukkit.getPluginManager().disablePlugin(Bukkit.getPluginManager().getPlugin("Devastator"));
                    Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin("Devastator"));
                    // Log if plugin is failed to reload
                    sender.sendMessage(ChatColor.GREEN + "Devastator has been reloaded!");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }
            }
            // Command editor to edit gui
            if (args.length == 1 && args[0].equalsIgnoreCase("editor")) {
                if (sender.hasPermission("dncpvp.editor")) {
                    sender.sendMessage(ChatColor.GREEN + "Opening Devastator Editor...");
                    sender.sendMessage(ChatColor.GREEN + "Devastator Editor has been opened!");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }
            }
            // Command version
            if (args.length == 1 && args[0].equalsIgnoreCase("version")) {
                if (sender.hasPermission("dncpvp.version")) {
                    sender.sendMessage(ChatColor.GREEN + "Devastator Version: 1.0.0");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                    return true;
                }
            }
            // Daily Rewards 24 Hour Cooldown

            // Command help
            if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.GREEN + "Devastator Help:");
                sender.sendMessage(ChatColor.GREEN + "/dncpvp open - Open Devastator GUI");
                sender.sendMessage(ChatColor.GREEN + "/dncpvp reload - Reloads the plugin");
                sender.sendMessage(ChatColor.GREEN + "/dncpvp editor - Opens the editor coming soon!");
                sender.sendMessage(ChatColor.GREEN + "/dncpvp version - Shows the plugin version");
                sender.sendMessage(ChatColor.GREEN + "/dncpvp help - Shows this help menu");
                return true;
            }
            // if command is not found
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please use /dncpvp help for help!");
                return true;
            }
            // Command to open gui
            if (args.length == 1 && args[0].equalsIgnoreCase("open")) {
                if (sender instanceof Player) {
                    Player player = (Player) sender;

                    Inventory gui = player.getServer().createInventory(player, 18, ChatColor.DARK_RED + "Crystal PVP Devastator");

                    ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
                    ItemMeta meta = item.getItemMeta();
                    ArrayList<String> lore = new ArrayList<>();
                    meta.setDisplayName(ChatColor.AQUA + "Netherite Sword");
                    item.setItemMeta(meta);



                    ItemStack item2 = new ItemStack(Material.NETHERITE_HELMET, 1);
                    ItemMeta meta2 = item2.getItemMeta();
                    ArrayList<String> lore2 = new ArrayList<>();
                    meta2.setDisplayName(ChatColor.AQUA + "Netherite Helmet");
                    item2.setItemMeta(meta2);

                    ItemStack item3 = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
                    ItemMeta meta3 = item3.getItemMeta();
                    ArrayList<String> lore3 = new ArrayList<>();
                    meta3.setDisplayName(ChatColor.AQUA + "Netherite Chestplate");
                    item3.setItemMeta(meta3);

                    ItemStack item4 = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
                    ItemMeta meta4 = item4.getItemMeta();
                    ArrayList<String> lore4 = new ArrayList<>();
                    meta4.setDisplayName(ChatColor.AQUA + "Netherite Leggings");
                    item4.setItemMeta(meta4);

                    ItemStack item5 = new ItemStack(Material.NETHERITE_BOOTS, 1);
                    ItemMeta meta5 = item5.getItemMeta();
                    ArrayList<String> lore5 = new ArrayList<>();
                    meta5.setDisplayName(ChatColor.AQUA + "Netherite Boots");
                    item5.setItemMeta(meta5);

                    //Create a new ItemStack (type: diamond sword) and open new inventory

                    ItemStack[] m_items = {item, item2, item3, item4, item5};
                    gui.setContents(m_items);
                    player.openInventory(gui);

                    // Itemstack for the new slot in the inventory
                    ItemStack item6 = new ItemStack(Material.BARRIER, 1);
                    ItemMeta meta6 = item6.getItemMeta();
                    ArrayList<String> lore6 = new ArrayList<>();
                    meta6.setDisplayName(ChatColor.RED + "Close");
                    item6.setItemMeta(meta6);

                    // Set the item in the inventory
                    gui.setItem(17, item6);

                    // Next gui page
                    ItemStack item7 = new ItemStack(Material.ARROW, 1);
                    ItemMeta meta7 = item7.getItemMeta();
                    ArrayList<String> lore7 = new ArrayList<>();
                    meta7.setDisplayName(ChatColor.GREEN + "Next Page");
                    item7.setItemMeta(meta7);

                    // Set the item in the inventory
                    gui.setItem(8, item7);

                    ItemStack item8 = new ItemStack(Material.EXPERIENCE_BOTTLE, 1);
                    ItemMeta meta8 = item8.getItemMeta();
                    ArrayList<String> lore8 = new ArrayList<>();
                    meta8.setDisplayName(ChatColor.GREEN + "XP 100");
                    item8.setItemMeta(meta8);
                    // Set Experience bottle with command exp give
                    gui.setItem(6, item8);

                    ItemStack item9 = new ItemStack(Material.LAPIS_LAZULI, 64);
                    ItemMeta meta9 = item9.getItemMeta();
                    ArrayList<String> lore9 = new ArrayList<>();
                    meta9.setDisplayName(ChatColor.GREEN + "Lapis Lazuli");
                    item9.setItemMeta(meta9);
                    gui.setItem(7, item9);

                    ItemStack item10 = new ItemStack(Material.NETHERITE_SWORD, 1);
                    ItemMeta meta10 = item10.getItemMeta();
                    meta10.setDisplayName(ChatColor.GREEN + "Public KIT");
                    item10.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
                    item10.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
                    item10.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
                    item10.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
                    item10.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
                    item10.setItemMeta(meta10);
                    gui.setItem(9, item10);
                    
                }
                return true;
            }
                return true;
            }
        return false;
        }
        // Set player inventory Ring Slot

}
