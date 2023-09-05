package Rewards.Silver;

import Abstractions.IGameItem;
import Abstractions.ItemGeneratore;

public class SilverGenerator extends ItemGeneratore {

    @Override
    public IGameItem createItem() {
        return new SilverRewards();
    }
    
}
