package com.softwaredesign.recruitservice.service;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.repository.UserRepository;

public interface UserService extends GenericService<User, Long> {

    void CreateUser(User user);

    void delete(User user);

    User getUserByAccount(Account account);




}
