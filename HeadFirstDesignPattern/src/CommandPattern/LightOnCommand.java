package CommandPattern;

/**
 * Created by SkywingWang on 17/2/3.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
