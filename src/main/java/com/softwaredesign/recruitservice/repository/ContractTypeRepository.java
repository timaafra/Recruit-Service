package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.ContractType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository extends CrudRepository<ContractType, Integer> {

    ContractType findContractTypeById(Long id);
}
