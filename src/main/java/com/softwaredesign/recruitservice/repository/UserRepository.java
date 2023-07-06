package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  GenericRepository<User,Long>{

    User findUserByIdAndaAndActive(Long id,boolean active);


    User findByNationalCode(String nationalCode);




    User findByAccount(Account account);
}
