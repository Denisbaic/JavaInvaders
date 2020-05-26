package GameStructures.Field;

import GameStructures.GameObject;

import java.util.List;

public class GameField {

    GameObject[][] field;

    public GameField(int width, int height, List<GameObject> GameObjects){
        field = new GameObject[width][height];
        for (GameObject gameObj: GameObjects) {
            field[gameObj.coord.getX()][gameObj.coord.getY()] = gameObj;
        }
    }
    public void show(){
        for (GameObject[] gameObjects : field) {
            System.out.println();
            for (GameObject gameObject : gameObjects) {
                if (gameObject == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(gameObject.getSymbol());
                }
            }
        }
    }
}
