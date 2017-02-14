package ProxyPattern;

import java.rmi.Naming;

/**
 * Created by SkywingWang on 17/2/13.
 */
public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            MyRemote servvice = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = servvice.sayHello();
            System.out.println(s);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
