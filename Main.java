package DZ_4_OOP;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Library<String, Integer> library = new Library<>();
        

        library.addBook(new Book<>("Dead souls"), 1);
        Thread.sleep(111);
        library.addBook(new Book<>("War and Peace"), 2);
        Thread.sleep(111);
        library.addBook(new Book<>("Crime and punishment"), 3);
        Thread.sleep(111);
        library.addBook(new Book<>("The Master and Margarita"), 4);
        Thread.sleep(111);
        

        library.provideBook("The Master and Margarita");
        Thread.sleep(111);
        
        library.provideBook("Crime and punishment");
        Thread.sleep(111);
        

        library.showProvidedBooksAndCards();
    }
}
