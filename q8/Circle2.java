public class Circle2 extends Point2 {
    protected double radius;

    public Circle2() {
    }

    public Circle2(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void display(){
        super.display();
    }
    @Override
    public double calcArea(){
        return this.area;
    }

}
