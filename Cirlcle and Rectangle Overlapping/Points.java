public class Points {
    private float x;
    private float y;
    private float radius;

    public Points(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Points(float x, float y , float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
}
