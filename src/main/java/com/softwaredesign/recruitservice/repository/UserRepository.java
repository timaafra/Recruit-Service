package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends  GenericRepository<User,Long>{

    User findUserByIdAndActiveIsTrue(Long id);


    User findByNationalCode(String nationalCode);

    User findByAccount(Account account);

    User findByNameAndLastName (String name,String lastName);
}
