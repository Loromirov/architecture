package Rewards.Armor;

import Abstractions.IGameItem;
import Abstractions.ItemGeneratore;

public class ArmorGenerator extends ItemGeneratore {

    @Override
    public IGameItem createItem() {
        return new ArmorRewards();
    }
    
}
