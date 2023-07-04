package repository;

import com.softwaredesign.recruitservice.JobTitle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTileRepository extends CrudRepository<JobTitle, Integer> {

    JobTitle findJobTitleById(Integer id);

}
