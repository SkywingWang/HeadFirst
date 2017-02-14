package StatePattern;

/**
 * Created by SkywingWang on 17/2/13.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
