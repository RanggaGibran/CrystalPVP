package commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class shopevent {

    public void shopEvent(InventoryClickEvent a) {
        if (a.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Crystal PVP Devastator")) {
            a.setCancelled(true);
            if (a.getCurrentItem() == null) {
                return;
            }
            if (a.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (a.getCurrentItem().getItemMeta().getDisplayName() == null) {
                return;
            }
            if (a.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Respawn Anchor")) {
                Player player = (Player) a.getWhoClicked();
                player.getInventory().addItem(a.getCurrentItem());
                player.updateInventory();
                player.playSound(player.getLocation(), org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
            }
        }
    }
}
