import java.applet.Applet;
import java.awt.Graphics;

public class Main extends Applet{
    public static void main(String[] args){
       System.out.println("Hello World!!");
    }

    public void paint(Graphics g){
        g.drawString("Welcome in java Applet!!!", 380, 380);
    }
}