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
public class LuckyBlockLoot {
    
    @Getter Rare rare;
    
    @Getter LuckyBlockLootRealisation lbr;
    
    public static interface LuckyBlockLootRealisation{
        /*
        * @param p - Игрок сломавший блок
        * @param loc - Координаты блока
        */
        public void action(Player p, Location loc);
    }
}
