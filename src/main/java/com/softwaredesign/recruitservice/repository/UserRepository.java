package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.ContractType;
import com.softwaredesign.recruitservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  GenericRepository<User,Long>{

    User findUserById(Long id);


    User findByNationalCode(String nationalCode);




    User findByAccount(Account account);
}
