package homework.dao;

public class Book  {
    protected int ISBN;
    protected String author;
    protected String nameOfBook;
    protected int yearOfPublication;

    public Book(int ISBN, String author, String title, int yearOfPublication) {
        this.ISBN = ISBN;
        this.author = author;
        this.nameOfBook = title;
        this.yearOfPublication = yearOfPublication;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
