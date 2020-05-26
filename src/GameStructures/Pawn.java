package GameStructures;

import GameStructures.Controllers.Controller;

public abstract class Pawn extends GameObject {
    Controller Pawn;
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
