package com.softwaredesign.recruitservice.service;

import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.repository.AccountRepository;
import com.softwaredesign.recruitservice.service.impl.GenericServiceImpl;
import org.hibernate.dialect.LobMergeStrategy;

public interface AccountService extends GenericService<Account, Long> {


    User Login(String userName, String password);

    Account CreateAccount(String userName, String Password);


    boolean delete(Long id);
}
