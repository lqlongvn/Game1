public class Vector2D {
    public float x;
    public float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
        this.x = 0;
        this.x = 0;
    }

    public Vector2D set(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vector2D set(Vector2D vecter2D) {
        return this.set(vecter2D.x, vecter2D.y);
    }

    public Vector2D addUp(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vector2D addUp(Vector2D vecter2D) {
        return this.addUp(vecter2D.x, vecter2D.y);
    }


    public Vector2D add(float x, float y) {
        return new Vector2D(this.x + x, this.y + y);
    }

    public Vector2D add(Vector2D vecter2D) {
        return this.add(vecter2D.x, vecter2D.y);
    }

    public Vector2D subtractBy(float x, float y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vector2D subtractBy(Vector2D vecter2D) {
        return this.subtractBy(vecter2D.x, vecter2D.y);
    }

    public Vector2D subtract(float x, float y) {
        return new Vector2D(this.x - x, this.y - y);
    }

    public Vector2D subtract(Vector2D vecter2D) {
        return this.subtract(vecter2D.x, vecter2D.y);
    }


    public Vector2D multiply(float number) {
        this.x *= number;
        this.y *= number;
        return  this;
    }


    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector2D copy() {
        return new Vector2D(x, y);
    }

    public Vector2D normalize() {
        float length = this.length();
        return new Vector2D(x / length, y / length);
    }


    public Vector2D rotate(double angle) {
        double radian = Math.toRadians(angle);
        double cs = Math.cos(radian);
        double sn = Math.sin(radian);
        return new Vector2D((float) (x * cs - y * sn), (float) (x * sn + y * cs));
    }
}
