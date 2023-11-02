package homework.dao;

public interface Library {
    boolean addBook(Book book);

    Book removeBook(int id);

    Book findBook(int id);

    int quantity();

    void printBook();
}
