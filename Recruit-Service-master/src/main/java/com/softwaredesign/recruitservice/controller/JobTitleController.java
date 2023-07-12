package com.softwaredesign.recruitservice.controller;

import com.softwaredesign.recruitservice.model.JobTitle;
import com.softwaredesign.recruitservice.service.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job-titles")
public class JobTitleController {

    private final JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @PostMapping("/")
    public ResponseEntity<JobTitle> createJobTitle(@RequestBody JobTitle jobTitle) {
        jobTitleService.createJobTitle(jobTitle);
        return new ResponseEntity<>(jobTitle, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobTitle> getJobTitleById(@PathVariable("id") Long id) throws Throwable {
        JobTitle jobTitle = jobTitleService.getById(id);
        if (jobTitle != null) {
            return new ResponseEntity<>(jobTitle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/")
    public ResponseEntity<JobTitle> updateJobTitle(@RequestBody JobTitle jobTitle) {
        JobTitle updatedJobTitle = jobTitleService.update(jobTitle);
        return new ResponseEntity<>(updatedJobTitle, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobTitle(@PathVariable("id") Long id) {
        jobTitleService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
