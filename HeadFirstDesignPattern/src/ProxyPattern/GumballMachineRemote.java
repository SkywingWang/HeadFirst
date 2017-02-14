package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by SkywingWang on 17/2/14.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
