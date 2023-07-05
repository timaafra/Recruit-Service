package com.softwaredesign.recruitservice.service.impl;

import com.softwaredesign.recruitservice.exception.AlreadyExist;
import com.softwaredesign.recruitservice.exception.InvalidPasswordException;
import com.softwaredesign.recruitservice.exception.NotFoundException;
import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.repository.AccountRepository;
import com.softwaredesign.recruitservice.service.AccountService;

import java.util.Objects;

public class AccountServiceImpl extends GenericServiceImpl<Account, Long, AccountRepository> implements AccountService {

    private UserServiceImpl userService;

    public AccountServiceImpl(AccountRepository repository) {
        super(repository);
    }

    @Override

    public User Login(String userName, String password) {
        Account account = repository.findAccountByUserName(userName);
        if (account.Validation(password)) {
            return userService.getUserByAccount(account);
        } else
            throw new InvalidPasswordException();
    }

@Override
    public Account CreateAccount(String userName,String Password) {
        Account account1=repository.findAccountByUserName(userName);
        if (Objects.nonNull(account1))
            throw new AlreadyExist("Account is Already Existed");
        account1.setUserName(userName);
        account1.setPassword(Password);
       return repository.save(account1);

    }
    @Override

    public void delete (Account account){
        Account account1=repository.findAccountById(account.getId());
        if(Objects.isNull(account1))
            throw  new NotFoundException();
        repository.delete(account1);

    }

    @Override
    public void update(Account account){
        Account account1=repository.findAccountById(account.getId());
        if(Objects.isNull(account1))
            throw  new NotFoundException();
        repository.save(account);
    }



}
