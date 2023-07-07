package com.softwaredesign.recruitservice.service;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.model.enums.Score;
import com.softwaredesign.recruitservice.repository.UserRepository;

import java.time.LocalTime;

public interface UserService extends GenericService<User, Long> {

    void CreateUser(User user);

    void delete(User user);

    User getUserByAccount(Account account);

    Double calculateSalary(User user);

    User getByNameAndLastName(String name, String lastName);
}
