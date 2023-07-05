package com.softwaredesign.recruitservice.repository;

import com.softwaredesign.recruitservice.model.ContractType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository  extends GenericRepository<ContractType,Long> {

    ContractType findContractTypeById(Long id);
}
