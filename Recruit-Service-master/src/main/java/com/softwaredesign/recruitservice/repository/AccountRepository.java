package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository  extends GenericRepository<Account,Long> {

    Account findAccountByUserName(String userName);
    Account findAccountById(Long id);


}
