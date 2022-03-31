package Assignment3;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCircle extends JFrame{
    Circle circle = new Circle(100,100,10);
    public static void main(String[] args) {
        new TestCircle().launch();
    }
    public void launch(){
        setLocation(200, 200);
        setSize(200,200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        addKeyListener(new KeyMonitor());
    }
    class KeyMonitor extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch(key){
                case KeyEvent.VK_UP://下面需要你补充
                    circle.move(circle.getCenter().x,circle.getCenter().y+1);
                    System.out.println("向上移动后，输出circle位置: x="+circle.getCenter().x+",y="+circle.getCenter().y);
                    break;
                case KeyEvent.VK_DOWN://下面需要你补充
                    circle.move(circle.getCenter().x,circle.getCenter().y-1);
                    System.out.println("向下移动后，输出circle位置: x="+circle.getCenter().x+",y="+circle.getCenter().y);
                    break;
                case KeyEvent.VK_LEFT://下面需要你补充
                    circle.move(circle.getCenter().x-1,circle.getCenter().y);
                    System.out.println("向左移动后，输出circle位置: x="+circle.getCenter().x+",y="+circle.getCenter().y);
                    break;
                case KeyEvent.VK_RIGHT://下面需要你补充
                    circle.move(circle.getCenter().x+1,circle.getCenter().y);
                    System.out.println("向移动后，输出circle位置: x="+circle.getCenter().x+",y="+circle.getCenter().y);
                    break;
                case KeyEvent.VK_PAGE_UP://radius加1
                    circle.setRadius(circle.getRadius()+1);
                    System.out.println("radius= " + circle.getRadius());
                    break;
                case KeyEvent.VK_PAGE_DOWN://radius减1
                    if(circle.getRadius()>1)
                        circle.setRadius(circle.getRadius()-1);
                    System.out.println("radius= " + circle.getRadius());
                    break;
            }
        }
    }
}

