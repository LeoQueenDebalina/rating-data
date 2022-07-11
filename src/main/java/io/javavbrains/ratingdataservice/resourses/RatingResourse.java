package io.javavbrains.ratingdataservice.resourses;

import io.javavbrains.ratingdataservice.models.Rating;
import io.javavbrains.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class RatingResourse {
    @GetMapping("/ratingsdata/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
        return new Rating(movieId, 4);

    }
       @GetMapping("/ratingsdata/users/{userId}")
        public UserRating getUserRating(@PathVariable String userId){
           List<Rating> ratings = Arrays.asList(
                    new Rating("1234", 4),
                    new Rating("5678", 3)
            );
           UserRating userRating = new UserRating();
           userRating.setUserRating(ratings);
           return userRating;
 }
}
