package Rewards.Gold;

import Abstractions.IGameItem;
import Abstractions.ItemGeneratore;

public class GoldGenerator extends ItemGeneratore {

    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
    
}
