package GameStructures;

import GamePackage.Movable;

public abstract class GameObject implements Movable {
    int lifes;
    GameObject owner;
    public IntPair coord;
    char symbol;

    public GameObject(int lifes, GameObject owner, IntPair coord, char symbol) {
        this.lifes = lifes;
        this.owner = owner;
        this.coord = coord;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
