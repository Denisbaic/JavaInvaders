package GameStructures.Actor;

import GameStructures.IntPair;

public class Stone extends GameObject {

    public Stone(IntPair coord) {
        super(1, null, coord, '░');
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
