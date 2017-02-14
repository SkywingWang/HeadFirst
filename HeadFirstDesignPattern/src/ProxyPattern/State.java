package ProxyPattern;

import java.io.Serializable;

/**
 * Created by SkywingWang on 17/2/13.
 */
public interface State extends Serializable{
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
