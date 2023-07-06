package com.softwaredesign.recruitservice.service.impl;


import com.softwaredesign.recruitservice.exception.NotFoundException;
import com.softwaredesign.recruitservice.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class GenericServiceImpl<T, ID, R extends org.springframework.data.jpa.repository.JpaRepository> implements GenericService<T, ID> {
    protected R repository;




    public GenericServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return (T) repository.save(entity);
    }

    @Override
    public T getById(ID id) throws Throwable {
        return (T) repository.findById(id).orElseThrow(

                () -> new NotFoundException()
        );
    }

    @Override
    public List<T> getAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public void deleteById(ID id)  {
        repository.deleteById(id);

    }

    @Override
    public void update(T entity)  {
        repository.save(entity);

    }


}

