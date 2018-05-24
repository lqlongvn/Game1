import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;
    public int velocityX;
    public int velocityY;
    private Random random = new Random();

    public Enemy(BufferedImage image, int x, int y, int width, int height, int velocityX, int velocityY) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }



    public void run() {
        this.x += this.velocityX;
        this.y += this.velocityY;
        if (this.x >= 1024) {
            this.x = 0;
            this.y = random.nextInt(600);
        } else if (this.y >= 600) {
            this.y = 0;
            this.x = random.nextInt(1024);
        } else if (this.x <= 0) {
            this.x = 1024;
            this.y = random.nextInt(600);
        } else if (this.y <= 0) {
            this.x = 600;
            this.y = random.nextInt(600);
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }
}
