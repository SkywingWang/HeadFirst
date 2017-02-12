package CommandPattern;

/**
 * Created by SkywingWang on 17/2/4.
 */
public class MacroCommand implements Command{
    Command[] commands;
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    public void execute(){
        for(int i = 0;i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
