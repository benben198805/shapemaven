public class Rectangle {
    private long width;
    private long height;

    public Rectangle(long width, long height) {
        this.width = width;
        this.height = height;
    }

    public long getArea() {
        return this.width * this.height;
    }

    public long getPerimeter() {
        return 2 * (this.width + this.height);
    }


}
