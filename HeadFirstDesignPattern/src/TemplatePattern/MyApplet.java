package TemplatePattern;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class MyApplet extends Applet {
    String message;
    public void init(){
        message = "Hello world,I'm alive!";
        repaint();
    }
    public void start(){
        message = "Now I'm starting up";
        repaint();
    }
    public void stop(){
        message = "Oh,now I'm being stopped...";
        repaint();
    }
    public void destroy(){

    }
    public void paint(Graphics g){
        g.drawString(message,5,15);
    }
}
