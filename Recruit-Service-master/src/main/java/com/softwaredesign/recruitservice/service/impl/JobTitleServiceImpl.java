package com.softwaredesign.recruitservice.service.impl;


import com.softwaredesign.recruitservice.exception.AlreadyExist;
import com.softwaredesign.recruitservice.model.JobTitle;
import com.softwaredesign.recruitservice.repository.JobTileRepository;
import com.softwaredesign.recruitservice.service.JobTitleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobTitleServiceImpl extends GenericServiceImpl<JobTitle, Long, JobTileRepository> implements JobTitleService {
    private final JobTileRepository jobTileRepository;
    @Override
    public void createJobTitle(JobTitle jobTitle) {
        JobTitle existingJobTitle = jobTileRepository.findByName(jobTitle.getName());
        if (existingJobTitle != null) {
            throw new AlreadyExist("Job title already exists!");
        }
        jobTileRepository.save(jobTitle);
    }



}
