package ProxyPattern;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by SkywingWang on 17/2/13.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello(){
        return "Server says, 'Hey'";
    }
    public static void main(String[] args){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}