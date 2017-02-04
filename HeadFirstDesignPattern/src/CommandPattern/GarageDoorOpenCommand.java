package CommandPattern;

/**
 * Created by SkywingWang on 17/2/4.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public void garageDoorOnCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOn();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {

    }
}
