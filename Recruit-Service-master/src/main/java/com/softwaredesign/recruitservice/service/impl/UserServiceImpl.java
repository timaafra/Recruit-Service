package com.softwaredesign.recruitservice.service.impl;

import com.softwaredesign.recruitservice.exception.AlreadyExist;
import com.softwaredesign.recruitservice.exception.NotFoundException;
import com.softwaredesign.recruitservice.model.Account;
import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.model.enums.SalaryType;
import com.softwaredesign.recruitservice.model.enums.Score;
import com.softwaredesign.recruitservice.repository.UserRepository;
import com.softwaredesign.recruitservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends GenericServiceImpl<User, Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public void CreateUser(User user) {
        User user1 = repository.findByNationalCode(user.getNationalCode());
        if (Objects.nonNull(user1))
            throw new AlreadyExist("User is Already existed!");
        repository.save(user);
    }

    @Override
    public void delete(User user) {
        User user1 = repository.findUserByIdAndActiveIsTrue(user.getId());
        if (Objects.isNull(user1))
            throw new NotFoundException();
        repository.delete(user1);
    }


    @Override
    public User update(User user) {
        User user1 = repository.findUserByIdAndActiveIsTrue(user.getId());
        if (Objects.isNull(user1))
            throw new NotFoundException();
        repository.save(user);
        return user;
    }

    @Override
    public User getUserByAccountId(Long ID) {
        return repository.findByAccount(ID);
    }



  private Long calculateHour(LocalTime entryTime, LocalTime exitTime) {

        Duration duration = Duration.between(entryTime, exitTime);
        Long hours = duration.toHours();

        return hours;
    }

    @Override
    public Double calculateSalary(User user) {

        Long hours = calculateHour(user.getEntryHour(), user.getExitHour());

        if (user.getJob().getSalaryType().equals(SalaryType.SALARIED)) {
            user.getRating().setScore(Rate(hours));
            if (user.getRating().getScore().equals(Score.EXCELLENT))
                return user.getJob().getSalaryPerHour() * hours + 50;
            if (user.getRating().getScore().equals(Score.BAD))
                return user.getJob().getSalaryPerHour() * hours - 50;
            else
                return user.getJob().getSalaryPerHour() * hours;
        } else
            return user.getJob().getSalaryPerHour() * hours;
    }


   private Score Rate(Long hours) {
       if (hours > 10)
           return Score.EXCELLENT;
       if (hours == 10)
           return Score.OK;
       else
           return Score.BAD;

   }


    @Override
    public User getByNameAndLastName(String name,String lastName){
       return repository.findByNameAndLastName(name,lastName);
    }


}


