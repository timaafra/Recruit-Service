package com.softwaredesign.recruitservice.service;

import java.util.List;

public interface GenericService<T, ID> {


    T save(T entity);

    T getById (ID id) throws Throwable;

    List<T> getAll();

    void deleteById(ID id) ;



    void update(T entity);




}
