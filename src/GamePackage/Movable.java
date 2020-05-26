package GamePackage;

public interface Movable {
    boolean moveLeft(int distance);
    boolean moveRight(int distance);
    boolean moveUp(int distance);
    boolean moveDown(int distance);
    void    waiting();
}
