package tev.tabsortingtest;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin {
    List<Player> nickedplayers = new ArrayList<>();
    @Override
    public void onEnable() {
        // Plugin startup logic
        new BukkitRunnable() {
            @Override
            public void run() {
            sorting.sorting();
            }
        }.runTaskTimerAsynchronously(this,2, 200);
        this.getCommand("mdit").setExecutor(new addToList());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
