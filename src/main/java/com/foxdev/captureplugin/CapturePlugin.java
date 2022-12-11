package com.foxdev.captureplugin;

import com.foxdev.captureplugin.Wands.WandFire;
import com.foxdev.captureplugin.Wands.WandKrijg;
import com.foxdev.captureplugin.Wands.WandLightning;
import org.bukkit.plugin.java.JavaPlugin;

public final class CapturePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("foxwand").setExecutor(new WandKrijg());
        getServer().getPluginManager().registerEvents(new WandFire(), this);
        getServer().getPluginManager().registerEvents(new WandLightning(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
