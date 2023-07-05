
// made it an inner class just to submit it as one java file
enum ChocolateType {
    MILK_CHOCOLATE(2),
    DARK_CHOCOLATE(3.5),
    WHITE_CHOCOLATE(5);

    public final double price;

    private ChocolateType(double price){
        this.price = price;
    }
}


public class ChocolateFactory {
    // note : I modified the class a little , so it may seem different
    // from what is asked in the task description , but I think that this is
    // more suitable when using enums as a member variable


    // I couldn't find a use for a price variable here , so I'll keep it commented
    //double total;
    ChocolateType type;
    int quantity;

    public ChocolateFactory(ChocolateType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return this.type.price * this.quantity;
    }

    // overloaded static version of the same function , just in case you want
    // to calculate the price of a quantity of any type on the go.
    public static double getTotalPrice(ChocolateType type , int quantity){
        return type.price * quantity;
    }

    public static void main(String[] args) {
        ChocolateFactory factory = new ChocolateFactory(ChocolateType.DARK_CHOCOLATE,501);
        System.out.println(factory.getTotalPrice());
        System.out.println("-------------------");
        System.out.println(getTotalPrice(ChocolateType.WHITE_CHOCOLATE,127));
    }

}
