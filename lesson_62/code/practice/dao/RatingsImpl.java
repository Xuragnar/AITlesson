package practice.dao;

import practice.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RatingsImpl implements Ratings {

    Collection<Review> reviews;

    public RatingsImpl() {
        reviews = new ArrayList<>();
    }

    @Override
    public boolean add(Review review) {
        return reviews.add(review);
    }

    @Override
    public boolean remove(Long id) {
        return reviews.removeIf(review -> review.getId() == id);
    }

    @Override
    public boolean update(Long id, int newRating) {
        for (Review review : reviews) {
            if (review.getId() == id) {
                review.setRating(newRating);
            }
            return true;
        }
        return false;
    }

    @Override
    public Iterable<Review> getReviewsByProduct(String product) {
 /*      List<Review> productReviews = new ArrayList<>();
        for (Review review : reviews) {
            if (review.getProduct().equalsIgnoreCase(product)) {
                productReviews.add(review);
            }
        }
        return productReviews;
     */
        return reviews.stream()
                .filter(review -> review.getProduct().equals(product))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Review> getReviewsByAuthor(String author) {
        return reviews.stream()
                .filter(review -> review.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
   /* public double getAvgRatingByProduct(String product) {
        Iterable<Review> productReviews = getReviewsByProduct(product);
        int totalRating = 0;
        int totalReviews = 0;
        for (Review review : productReviews) {
            totalRating += review.getRating();
            totalReviews++;
        }
        return totalReviews > 0 ? (double) totalRating / totalReviews : 0;*/
    public double getAvgRatingByProduct(String product) {
        return reviews.stream()
                .mapToInt(Review::getRating)
                .average()
                .orElse(0);
    }


    @Override
    public Iterable<Review> getReviewWithMaxLikes() {

        int max = reviews.stream()
                .mapToInt(Review::getLikes)
                .max()
                .orElse(0);
        return reviews.stream()
                .filter(review -> review.getLikes()==max)
                .collect(Collectors.toList());

    }
}
