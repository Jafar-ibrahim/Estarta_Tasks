public class Distance {
    private int feet;
    private int inches;

    public Distance(){
        this.feet = 6;
        this.inches = 1;
    }
    public Distance(int feet, int inches){
        // in case the inches are more than 12 they'll be added to the feet variable
        this.feet = feet + inches/12;
        this.inches = inches % 12;
    }

    public Distance AddDistance(Distance dist2){
        // in case the inches are more than 12 they'll be added to the feet variable
        int inchSum = this.inches + dist2.inches;
        int feetSum = (this.feet + dist2.feet) + inchSum/12;
        inchSum %= 12;
        // the result could be stored in the current Distance object, but I chose to return the result
        return new Distance(feetSum,inchSum);
    }

    public boolean isGreater(Distance dist2){
        if (this.feet != dist2.feet)
            return this.feet > dist2.feet;
        else
            return this.inches > dist2.inches;
    }

    @Override
    public String toString() {
        return "feet = " + feet +
                "  , inches = " + inches;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(15,13);
        System.out.println(d1);
        Distance d3 = d1.AddDistance(new Distance(2,5));
        System.out.println(d3);
        System.out.println(d3.isGreater(d1));
    }
}
