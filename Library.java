package DZ_4_OOP;

import java.util.ArrayList;

public class Library<T, K> {
    ArrayList<Book<T>> books = new ArrayList<>();
    ArrayList<LibraryCard<K, CardInfo<T>>> cards = new ArrayList<>();

    public ArrayList<Book<T>> getBooks() {
        return books;
    }

    public ArrayList<LibraryCard<K, CardInfo<T>>> getCards() { 
        return cards;
    }

    public void addBook(Book<T> book, K cardNum) { 
        books.add(book);
        CardInfo<T> initCardInfo = new CardInfo<>(book.getTitle());
        cards.add(new LibraryCard<>(cardNum, initCardInfo));
    }

    public void provideBook(T title) {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (card.getBookInfoLog().getLast().getTitle().equals(title))
                     {
                card.addInfo(new CardInfo<>(title));
            } 
        }
    }

    private Book<T> getBookByTitle(T title) {
        for (Book<T> book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void showProvidedBooksAndCards() {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            {
                System.out.println(getBookByTitle(card.getBookInfoLog().getLast().getTitle()) + " ---> " + card);
            }
        }
    }
}