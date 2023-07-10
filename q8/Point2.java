public class Point2 extends Shape{
    protected double x;
    protected double y;

    public Point2() {
    }

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void display(){
        System.out.println("Point : (" + x + "," + y + ")");
        super.display();
    }
    @Override
    public double calcArea() {
        return 0;
    }
    @Override
    public double calcVolume() {
        return 0;
    }
}
