package com.collatum.ipfhaachen.persistence;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends MongoRepository<PersonEntity, String> {
    PersonEntity findByEmail(String email);
    PersonEntity findById(ObjectId id);
}
