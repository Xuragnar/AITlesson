package homework.tests;

import homework.dao.Book;
import homework.dao.Library;
import homework.dao.model.LibraryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LibraryImplTest {
    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
       library=new LibraryImpl(4);
       book =new Book[4];
        book[0]=new Book(123456789, "Author", "Book", 2019);
        book[1]=new Book(345678901, "Author1", "Book1", 2020);
        book[2]=new Book(234567890, "Author2", "Book2", 2022);
        book[3]=new Book(456789012, "Author3", "Book3", 2023);


    }

    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(123456786, "Author5", "Book5", 1987); // создали новую книгу
        assertTrue(library.addBook( book1)); // добавили новую книгу
        assertEquals(5, library.quantity()); // теперь в библиотеке 5 книг
        // создаем еще одну новую
        Book book2 = new Book(123456787, "Author6", "Book6", 1999); // создали новую книгу
        assertFalse(library.addBook( book2)); // не можем превысить capacity
    }

    @Test
    void removeBook() {
        // удаляем книгу
        assertEquals(book[1] ,library.removeBook(345678901));
        assertEquals(3, library.quantity()); // книг стало на 1 меньше (4 - 1)
        assertNull(library.removeBook(345678901)); // дважды не можем удалить
        assertNull(library.findBook(345678901)); // не можем найти после удаления
    }

    @Test
    void findBook() {
        // ищем книгу по id
        assertEquals( book[1], library.findBook(123456789));
        // ищем несуществующую книгу
        assertNull(library.findBook(123456789));
    }

    @Test
    void quantity() {
        assertEquals(0,library.quantity());
    }

    @Test
    void printBook() {
        library.printBook();
    }
}