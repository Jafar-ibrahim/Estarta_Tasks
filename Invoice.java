public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity > 0 )
            this.quantity = quantity;
        if (price > 0 )
            this.price = price;
    }
    public double getInvoiceAmount(){
        return quantity * price ;
    } 
}
