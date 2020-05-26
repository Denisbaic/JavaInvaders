package GameStructures.Controllers;

public class AIController extends Controller {
    boolean MoveLeft;
    int Reload;
    int ReloadRate;

    public AIController(int reloadRate) {
        MoveLeft = false;
        ReloadRate = reloadRate;
        Reload = 0;
    }

    @Override
    void InputCommand() {
        if(MoveLeft){
            if(controlledPawn.moveLeft(controlledPawn.getSpeed())){
                if(ReloadRate>= Reload){
                    Reload++;
                }
                else{
                    //fire
                }
            }
            else {
                MoveLeft = false;
                controlledPawn.moveDown(controlledPawn.getSpeed());
            }
        }
        else {
            if(controlledPawn.moveLeft(controlledPawn.getSpeed())){

            }
            else {
                MoveLeft = true;
                controlledPawn.moveDown(controlledPawn.getSpeed());
            }
        }
    }
}
