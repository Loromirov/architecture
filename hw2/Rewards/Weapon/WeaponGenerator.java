package Rewards.Weapon;

import Abstractions.IGameItem;
import Abstractions.ItemGeneratore;

public class WeaponGenerator extends ItemGeneratore {

    @Override
    public IGameItem createItem() {
        return new WeaponRewards();
    }
    
}
