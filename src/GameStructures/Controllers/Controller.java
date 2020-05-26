package GameStructures.Controllers;

import GameStructures.Pawn;

public abstract class Controller {
    Pawn controlledPawn;
    abstract void ExecuteCommand(String command);
}
