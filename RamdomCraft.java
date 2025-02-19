package com.example.randomcraft;

import org.bukkit.plugin.java.JavaPlugin;

public class RandomCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RandomCraft Plugin activé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("RandomCraft Plugin désactivé !");
    }
}
