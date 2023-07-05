package repository;

import com.softwaredesign.recruitservice.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Integer> {

    Rating findRatingById(Integer id);
}
