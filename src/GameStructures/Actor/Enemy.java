package GameStructures.Actor;

import GameStructures.Controllers.AIController;
import GameStructures.IntPair;

public class Enemy extends Pawn {
    public Enemy(int lifes, GameObject owner, IntPair coord, int ReloadRate) {
        super(lifes, null, coord, 'Ⓗ');
        PawnController = new AIController(ReloadRate);
        PawnController.controlledPawn = this;
    }

    @Override
    public boolean moveLeft(int distance) {
        return false;
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
