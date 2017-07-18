package ru.Sonicxd2.SkyBlock.Addon;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Sonicxd2
 */
public interface Addon {
    
    /**
    * @param jp Плагин SkyBlock
    * @return Загружен ли аддон?
    */
    public boolean onEnable(JavaPlugin jp);
    
    /**
    * @param jp Плагин SkyBlock
    */
    public void onDisable(JavaPlugin jp);
}
