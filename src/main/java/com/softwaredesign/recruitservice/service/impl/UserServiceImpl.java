package com.softwaredesign.recruitservice.service.impl;

import com.softwaredesign.recruitservice.exception.AlreadyExist;
import com.softwaredesign.recruitservice.exception.NotFoundException;
import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.repository.UserRepository;
import com.softwaredesign.recruitservice.service.UserService;

import java.util.Objects;

public class UserServiceImpl  extends GenericServiceImpl<User,Long, UserRepository> implements UserService {


    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public void CreateUser(User user){
        User user1=repository.findByNationalCode(user.getNationalCode());
        if (Objects.nonNull(user1))
            throw new AlreadyExist("User is Already existed!");
        repository.save(user);
    }
    @Override
    public void delete(User user){
            User user1=repository.findUserByIdAndaAndActive(user.getId(), user.getActive());
            if(Objects.isNull(user1))
                throw  new NotFoundException();
            repository.delete(user1);
    }


    @Override
    public void update(User user){
        User user1=repository.findUserByIdAndaAndActive(user.getId(),user.getActive());
        if(Objects.isNull(user1))
            throw  new NotFoundException();
        repository.save(user);
    }

    @Override
    public User getUserByAccount(Account account) {
       return repository.findByAccount(account);
    }
}
