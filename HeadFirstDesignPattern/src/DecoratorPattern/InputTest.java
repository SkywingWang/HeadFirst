package DecoratorPattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by SkywingWang on 17/1/26.
 */
public class InputTest {
    public static void main(String [] args) throws IOException{
        int c;
        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperties());
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
