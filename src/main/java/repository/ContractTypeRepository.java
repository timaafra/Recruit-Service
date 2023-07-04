package repository;

import com.softwaredesign.recruitservice.ContractType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository extends CrudRepository<ContractType, Integer> {

    ContractType findContractTypeById(Integer id);
}
