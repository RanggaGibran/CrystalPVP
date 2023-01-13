package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {
        // Give player item and refresh gui
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_RED + "Crystal PVP Devastator")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Netherite Sword")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Netherite Helmet")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Netherite Chestplate")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Netherite Leggings")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Netherite Boots")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Close")) {
                Player player = (Player) e.getWhoClicked();
                player.closeInventory();
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Next Page")) {
                Player player = (Player) e.getWhoClicked();
                player.closeInventory();
                player.openInventory(shop.shopGUI(player));
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "XP 100")) {
                Player player = (Player) e.getWhoClicked();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                // Add exp to player 100
                player.giveExpLevels(100);
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                player.updateInventory();
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Lapis Lazuli")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Public KIT")) {
                Player player = (Player) e.getWhoClicked();
                player.getInventory().addItem(e.getCurrentItem());
                player.updateInventory();
            }

        }
    }
}
