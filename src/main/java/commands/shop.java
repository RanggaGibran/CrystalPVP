package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class shop implements CommandExecutor {
    public static Inventory shopGUI(Player player) {
        Inventory shop = org.bukkit.Bukkit.createInventory(null, 27, ChatColor.GREEN + "Crystal PVP Devastator");
        org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(org.bukkit.Material.RESPAWN_ANCHOR);
        org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Respawn Anchor");
        item.setItemMeta(meta);
        shop.setItem(0, item);
        // Create command to edit gui
        return shop;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.openInventory(shopGUI(player));
        }
        return true;
    }
    // Create command to edit shop gui
}

