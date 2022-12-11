package com.foxdev.captureplugin.Wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class WandKrijg implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player p = (Player) sender;

        ItemStack Wand = new ItemStack(Material.FEATHER);


        ItemMeta WandMeta = Wand.getItemMeta();

        WandMeta.setDisplayName(ChatColor.BLUE + "Empire Wand");

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Left Click = Lightning");

        lore.add(ChatColor.RED + "Right Click = FireBall");

        WandMeta.setLore(lore);


        Wand.setItemMeta(WandMeta);



        p.getInventory().addItem(Wand);

        return false;
    }
}
