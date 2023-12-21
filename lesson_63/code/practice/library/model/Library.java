package practice.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;
    public Library(){
        init();
    }
    private void init(){
        books=new ArrayList<>();
        books.add(new Book("Джордж Оруэлл","1984",2021));
        books.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997));
        books.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 1954));
        books.add(new Book("George Orwell", "1984", 1949));
        books.add(new Book("Harper Lee", "To Kill a Mockingbird", 1960));
        books.add(new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925));
        books.add(new Book("Leo Tolstoy", "War and Peace", 1869));


        readers=new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2


        readers.get(0).getBooks().add(books.get(0));
        readers.get(1).getBooks().add(books.get(0));
        readers.get(1).getBooks().add(books.get(1));
        readers.get(1).getBooks().add(books.get(4));
        readers.get(2).getBooks().add(books.get(0));
        readers.get(2).getBooks().add(books.get(2));



    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
