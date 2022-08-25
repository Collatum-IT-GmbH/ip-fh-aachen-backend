package com.collatum.ipfhaachen.persistence;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
