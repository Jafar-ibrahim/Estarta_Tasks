package task8_Exceptions;

public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void findById(Book[] books , int id) throws BookNotFoundException{
        for (Book b: books){
            if(b.id == id){
                System.out.println("Found");
                return;
            }
        }
        throw new BookNotFoundException("Book with the given id is not present");

    }
}
