package GameStructures.Actor;

import GameStructures.Actor.GameObject;
import GameStructures.Controllers.Controller;
import GameStructures.IntPair;

public abstract class Pawn extends GameObject {
    Controller PawnController;
    int speed;

    public Pawn(int lifes, GameObject owner, IntPair coord, char symbol) {
        super(lifes, owner, coord, symbol);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
