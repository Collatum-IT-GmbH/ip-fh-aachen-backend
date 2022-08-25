package com.collatum.ipfhaachen.service;

import com.collatum.ipfhaachen.dto.PersonDto;
import com.collatum.ipfhaachen.persistence.PersonRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public PersonService(PersonRepository _personRepository) {
        this.personRepository = _personRepository;
    }
    public PersonDto createPerson(PersonDto personDto) {
        logger.debug("Storing new Person entry in Database");

        PersonEntity insertedPersonEntity = personRepository.insert(new PersonEntity(personDto));


        return PersonDto.fromEntity(insertedPersonEntity);
    }
}
