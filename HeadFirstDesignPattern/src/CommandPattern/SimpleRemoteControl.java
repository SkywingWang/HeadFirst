package CommandPattern;

/**
 * Created by SkywingWang on 17/2/4.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
