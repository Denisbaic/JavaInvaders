package GamePackage;

import GameStructures.Field.GameField;

public class Game {
    private static Game GameInstance;

    public GameField gameField;

    private Game(){

    }

    public static GamePackage.Game getGameInstance() {
        if(GameInstance == null){
            GameInstance = new Game();
        }
        return GameInstance;
    }

    public void Run(){
        gameField.show();

    }

    public  void Restart(){

    }
    public void Exit(){
        System.exit(0);
    }


}
