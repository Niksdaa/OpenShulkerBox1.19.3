package me.niksda.openshulkerbox;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;
    private boolean openWhileSneaking;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new OpenShulkerBoxListener(), this);
        loadConfig();
    }

    private void loadConfig() {
        saveDefaultConfig();
        openWhileSneaking = getConfig().getBoolean("open-while-sneaking", false);
    }

    public static Main getInstance() {
        return instance;
    }

    public boolean openWhileSneaking() {
        return openWhileSneaking;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
