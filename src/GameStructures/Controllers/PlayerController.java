package GameStructures.Controllers;

import GamePackage.Game;

import java.util.Scanner;

public class PlayerController extends Controller {
    Scanner scanner;
    void InputCommand(){
        String command = scanner.next();
        ExecuteCommand(command);
    }
    void ExecuteCommand(String command) {
        switch (command){
            case  "up": controlledPawn.moveUp(controlledPawn.getSpeed());
            case  "down": controlledPawn.moveDown(controlledPawn.getSpeed());
            case  "right": controlledPawn.moveRight(controlledPawn.getSpeed());
            case  "left": controlledPawn.moveLeft(controlledPawn.getSpeed());
            case  "restart": Game.getGameInstance().Restart();
            case  "exit": Game.getGameInstance().Exit();
        }
    }
}
