package com.collatum.ipfhaachen.persistence;


import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends MongoRepository<PersonEntity, String> {
    PersonEntity findByEmail(String email);
}
