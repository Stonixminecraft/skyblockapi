package ru.Sonicxd2.SkyBlock.LuckyBlock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Sonicxd2
 */
@AllArgsConstructor
public abstract class LuckyBlockLoot {
    
    @Getter Rare rare;
    
    
    /**
    * @param p Игрок сломавший блок
    * @param loc Координаты блока
    */
    public abstract void action(Player p, Location loc);
}
