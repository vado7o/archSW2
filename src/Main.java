import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldGenerator());
        fabricList.add(new DiamondGenerator());
        fabricList.add(new SilverGenerator());
        fabricList.add(new BronzeGenerator());

        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(4);
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }

    }
}