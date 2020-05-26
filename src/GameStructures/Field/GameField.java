package GameStructures.Field;

import GameStructures.Actor.GameObject;
import GameStructures.IntPair;

import java.util.List;

public class GameField {

    GameObject[][] field;

    public GameField(int width, int height, List<GameObject> GameObjects){
        field = new GameObject[width][height];
        for (GameObject gameObj: GameObjects) {
            field[gameObj.coord.getX()][gameObj.coord.getY()] = gameObj;
        }
    }

    public void MoveCellContent(IntPair point, IntPair newPoint){
        GameObject Temp = field[point.getX()][point.getY()];
        if(Temp!=null){
            //Temp.coord = newPoint;
            
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
