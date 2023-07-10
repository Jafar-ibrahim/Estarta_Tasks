public abstract class Shape {

    protected double area;
    protected double volume;

    public void display(){
        System.out.println("area : " + area +"\n" + "volume : " + volume);
    }
    public abstract double calcArea();
    public abstract double calcVolume();

}
