import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {

    BufferedImage starImage;
    public int positionXStar = 400;
    public int positionYStar = 300;

    BufferedImage circleImage;
    public int positionXCircle = 500;
    public int positionYCircle = 0;

    BufferedImage playerImage;
    public int positionXPlayer = 300;
    public int positionYPlayer = 200;


    public GameCanvas() {
        this.setSize(1024,600);
        //this.setVisible(true);
        try {
            this.starImage = ImageIO.read(new File("resources-rocket-master/resources/images/star.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.circleImage =ImageIO.read(new File("resources-rocket-master/resources/images/circle.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.playerImage =ImageIO.read(new File("resources-rocket-master/resources/images/circle.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0,0,1024,600);

        g.drawImage(this.starImage,this.positionXStar,this.positionYStar,5,5,null);
        g.drawImage(this.circleImage,this.positionXCircle,this.positionYCircle,10,10,null);
        g.drawImage(this.playerImage,this.positionXPlayer,this.positionYPlayer,10,10,null);

    }
}
