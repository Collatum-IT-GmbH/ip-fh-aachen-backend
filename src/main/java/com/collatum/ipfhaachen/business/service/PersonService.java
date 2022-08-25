package com.collatum.ipfhaachen.business.service;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import com.collatum.ipfhaachen.business.exception.UserAlreadyExistsException;
import com.collatum.ipfhaachen.persistence.PersonRepository;
import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final @NonNull PersonRepository personRepository;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public PersonDto createPerson(PersonDto personDto) throws UserAlreadyExistsException {
        logger.debug("Checking if new Person exists in Database");
        PersonEntity personExists = personRepository.findByEmail(personDto.getEmail());
        if (personExists != null)
            throw new UserAlreadyExistsException("The given email already exists in the database.");

        logger.debug("Storing new Person in Database");
        PersonEntity insertedPersonEntity = personRepository.insert(new PersonEntity(personDto));
        return new PersonDto(insertedPersonEntity);
    }
}
