package CompoundPattern;

/**
 * Created by SkywingWang on 17/2/14.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    public void quack(){
        goose.honk();
    }
}