import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy {
    private Random random = new Random();
    public BufferedImage image;
    public Vector2D position;
    public int width;
    public int height;
    public Vector2D velocity;
    public int speed;

    public Enemy(BufferedImage image, int x, int y, int width, int height, int speed) {
        this.image = image;
        this.position = new Vector2D(x, y);
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.velocity = new Vector2D();
    }

    public void moveForward(Vector2D positionPlayer) {
        this.updateVelocity(positionPlayer);
        this.run();
    }


    public void updateVelocity(Vector2D positionPlayer) {
        this.velocity.set(positionPlayer.subtract(this.position).normalize()).multiply(this.speed);
    }

    public void run() {
        this.position.addUp(this.velocity);
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, (int)this.position.x, (int)this.position.y, this.width, this.height, null);
    }
}
