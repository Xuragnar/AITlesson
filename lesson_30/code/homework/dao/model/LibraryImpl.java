package homework.dao.model;

import homework.dao.Book;
import homework.dao.Library;


public class LibraryImpl implements Library {
    // поля, которые описывают библиотеку
    private final Book[] books; // массив для хранения книг
    private int size; // текущее кол-во книг в библиотеке

    // конструктор
    public LibraryImpl(int capacity){
        books = new Book[capacity]; // capacity - максимальный размер библиотеке
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBook(book.getISBN()) != null) {
            return false;
        }
        books[size] = book;// новый элемент
        size++;
        return true;
    }

    @Override
    public Book removeBook(int id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == id) {
                Book victim = books[i];
                books[i] = books[size - 1];// на место найденного поставили последнего
                //существующего в массиве
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(int id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == id) {// нашелся элемент массива у которого совпал id
                return books[i];//вернули найденный элемент в массиве Book
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
