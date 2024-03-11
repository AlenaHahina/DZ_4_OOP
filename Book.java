package DZ_4_OOP;
// Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T для ее названия.
// Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. 
// Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
// Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и
// выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.



public class Book<T> {
    private final T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                '}';
    }
}