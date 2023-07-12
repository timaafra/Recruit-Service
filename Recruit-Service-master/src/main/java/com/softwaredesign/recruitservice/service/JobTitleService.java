package com.softwaredesign.recruitservice.service;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.JobTitle;

public interface JobTitleService extends GenericService<JobTitle, Long> {
    void createJobTitle(JobTitle jobTitle);
}
