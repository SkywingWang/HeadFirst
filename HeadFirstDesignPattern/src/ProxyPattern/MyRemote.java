package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by SkywingWang on 17/2/13.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
