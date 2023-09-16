public class Rectangle implements IShape {
    private double length;
    private double width;
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
    
}
