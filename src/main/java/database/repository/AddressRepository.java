package database.repository;

import database.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    Set<Address> findAllBy();
    Set<Address> findAllByCityAndState(String city, String state);

}
