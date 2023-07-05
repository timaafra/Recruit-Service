package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserById(Long id);
}
