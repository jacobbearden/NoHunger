package com.aefonix.nohunger;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHunger extends JavaPlugin implements Listener {
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
  }

  @Override
  public void onDisable() {}

  @EventHandler
  public void onFoodLevelChange(FoodLevelChangeEvent event) {
    if (event.getEntityType() == EntityType.PLAYER) {
      event.setCancelled(true);
    }
  }
}
