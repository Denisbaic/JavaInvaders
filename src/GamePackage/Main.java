package GamePackage;
import GameStructures.Field.GameField;
import GameStructures.Actor.GameObject;
import GameStructures.IntPair;
import GameStructures.Actor.Stone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameObject> GameObjects = new ArrayList<GameObject>();
        GameObjects.add(new Stone(new IntPair(1,1)));
        Game.getGameInstance().gameField = new GameField(10,10, GameObjects);
        Game.getGameInstance().Run();

    }
}
