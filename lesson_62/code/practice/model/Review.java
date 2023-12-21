package practice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Review implements Comparable<LocalDateTime> {
    private String comment;
    private long id;
    private int rating;
    private String author;
    private String product;
    private int likes;
    public LocalDateTime date;

    public Review( int rating, String author, String product,String comment) {
        this.rating = rating;
        this.author = author;
        this.product = product;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getProduct() {
        return product;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating=" + rating +
                ", author='" + author + '\'' +
                ", product='" + product + '\'' +
                ", likes=" + likes +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int addLike() {
        return likes;
    }

    @Override
    public int compareTo(LocalDateTime o) {
        return o.compareTo(this.date);
    }
}