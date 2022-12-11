package com.foxdev.captureplugin.Wands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class WandFire implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        ItemStack Wand = new ItemStack(Material.FEATHER);
        Player p = e.getPlayer();
        ItemMeta WandMeta = Wand.getItemMeta();

        WandMeta.setDisplayName(ChatColor.BLUE + "Empire Wand");

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Left Click = Lightning");

        lore.add(ChatColor.RED + "Right Click = FireBall");

        WandMeta.setLore(lore);


        Wand.setItemMeta(WandMeta);

        Block block = p.getTargetBlock(null, 100);
        Location bl = block.getLocation();




        if(e.getAction() == Action.RIGHT_CLICK_AIR){
            if(p.getInventory().getItemInMainHand().equals(Wand));
            p.getWorld().createExplosion(bl, 4, false);
        }

    }
}
