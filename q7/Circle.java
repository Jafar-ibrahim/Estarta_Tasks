public class Circle extends Point {
    double radius;

    public Circle() {
        // it'll be initialized as 0 implicitly even if I didn't write this line
        // , but I wrote it for readability
        radius = 0;
    }

    public Circle(double radius , Point2 center) {
        super(center.x, center.y);
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  Math.PI * radius * radius;
    }

    public double getCircumference (){
        return 2 * Math.PI * radius ;
    }
}
