package simplefactoryCreational;

public class WoodenDoor implements Door {
    protected float width;
    protected float height;

    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
