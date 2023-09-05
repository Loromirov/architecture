package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Abstractions.ItemGeneratore;
import Rewards.Armor.ArmorGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Weapon.WeaponGenerator;

public class Core {

    // Логика игры
    public void run(){
        List<ItemGeneratore> generatorList = new ArrayList<>();

        generatorList.add(new GoldGenerator());
        generatorList.add(new WeaponGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new ArmorGenerator());

        Random random = new Random();
        int randIndex = random.nextInt(3);
        ItemGeneratore myGeneratore = generatorList.get(randIndex);
        System.out.println(myGeneratore.openReward());
    }
}
