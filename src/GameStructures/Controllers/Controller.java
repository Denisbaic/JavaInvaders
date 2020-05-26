package GameStructures.Controllers;

import GamePackage.Game;
import GameStructures.Actor.Pawn;

public abstract class Controller {
    public Pawn controlledPawn;

    abstract  void InputCommand();


}
