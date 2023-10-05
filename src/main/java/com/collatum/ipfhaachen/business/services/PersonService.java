package com.collatum.ipfhaachen.business.services;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import com.collatum.ipfhaachen.business.exceptions.UserAlreadyExistsException;
import com.collatum.ipfhaachen.persistence.PersonsRepository;
import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final @NonNull PersonsRepository personsRepository;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional
    public PersonDto createPerson(PersonDto person) throws UserAlreadyExistsException {
        logger.info("Checking if new Person already exists in database with email:" + person.getEmail());
        PersonEntity existingPerson = this.personsRepository.findByEmail(person.getEmail());
        if(existingPerson != null) {
            throw new UserAlreadyExistsException("Given user already exists.");
        }

        logger.info("Storing new Person in database");
        PersonEntity insertedPerson = this.personsRepository.insert(new PersonEntity(person));
        return new PersonDto(insertedPerson);
    }
}
