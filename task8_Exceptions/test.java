package task8_Exceptions;

public class test {
    public static void main(String[] args) {
        Book[] books = {new Book(1, "first book"),
                        new Book(2, "second book"),
                        new Book(3, "third book"),
                        new Book(4, "fourth book"),
                        new Book(5, "fifth book")};

        try{
            Book.findById(books,0);
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
