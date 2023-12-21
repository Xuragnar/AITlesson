package practice;

import practice.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class RatingsAppl {
    public static void main(String[] args) {
        Collection<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1,"Author 1","Product 4","comment 1"));
        reviews.add(new Review(2,"Author 2","Product 3","comment 2"));
        reviews.add(new Review(3,"Author 3","Product 2","comment 3"));
        reviews.add(new Review(4,"Author 4","Product 1","comment 4"));



    }

}
