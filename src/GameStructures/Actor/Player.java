package GameStructures.Actor;

import GamePackage.Game;
import GameStructures.Controllers.PlayerController;
import GameStructures.IntPair;

public class Player extends Pawn {

    public Player(int lifes, IntPair coord) {
        super(lifes, null, coord, 'Ⓐ');
        PawnController = new PlayerController();
        PawnController.controlledPawn = this;
    }

    @Override
    public boolean moveLeft(int distance) {
        return Game.getGameInstance().gameField;
    }

    @Override
    public boolean moveRight(int distance) {
        return false;
    }

    @Override
    public boolean moveUp(int distance) {
        return false;
    }

    @Override
    public boolean moveDown(int distance) {
        return false;
    }

    @Override
    public void waiting() {

    }
}
