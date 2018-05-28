import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.awt.image.BufferedImage;

public class Player {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;
    private List<Vector2D> verties;
    private Polygon polygon;

    public Player(BufferedImage image, int x, int y, int width, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.verties = Arrays.asList (
                new Vector2D(),
                new Vector2D(0,16),
                new Vector2D(20,8)
        );
        this.polygon = new Polygon();


    }

    public void render(Graphics graphics) {
        //graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
        graphics.setColor(Color.RED);
        this.polygon.reset();
        this.verties.forEach(vertex->polygon.addPoint((int) vertex.x,(int) vertex.y));
        graphics.drawPolygon(this.polygon);
    }


}
