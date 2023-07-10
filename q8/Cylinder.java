public class Cylinder extends Circle2 {
    protected double height;

    public Cylinder() {
    }

    public Cylinder(double x , double y , double radius ,double height ) {
        super(x,y,radius);
        this.height = height;
        double base = super.area;
        // 2 * area_of_base(circle) + side area
        area = (2 * base) + (2 * Math.PI * radius * height);
        // area_of_base(circle) * height
        volume = base * height;
    }

    @Override
    public void display() {
        System.out.println("height : " + height);
        super.display();
    }

    @Override
    public double calcArea() {
        return this.area;
    }

    @Override
    public double calcVolume() {
        return this.volume;
    }
}
