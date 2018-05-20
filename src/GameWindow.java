import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame {
    GameCanvas gameCanvas;
    long lastTime = 0;

    public GameWindow(){
        this.setSize(1024,600);// set kích thước cửa sổ Window
        //this.setVisible(true);

        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE);
                System.out.println("key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
               if (e.getKeyCode() == KeyEvent.VK_LEFT){gameCanvas.positionXPlayer -=3;}
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){gameCanvas.positionXPlayer +=3;}

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE);
                System.out.println("key Released");
            }
        });
        this.setVisible(true);
    }

    public void gameLoop(){
        while (true) {
            long currentTime = System.nanoTime(); // unix time từ 0.0 1/1/1970 đến thời điểm hiện tại
            if (currentTime- lastTime >= 17_000_000){
                this.gameCanvas.positionXStar -=3;
                this.gameCanvas.positionYCircle +=2;
                this.gameCanvas.repaint();
                this.lastTime = currentTime;
            }



        }

    }
}
