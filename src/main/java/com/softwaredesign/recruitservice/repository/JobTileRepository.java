package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.JobTitle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTileRepository extends CrudRepository<JobTitle, Long> {

    JobTitle findJobTitleById(Long id);

}
