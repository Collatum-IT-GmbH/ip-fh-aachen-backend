package com.collatum.ipfhaachen.controller;

import com.collatum.ipfhaachen.dto.PersonDto;
import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.collatum.ipfhaachen.service.PersonService;
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService _personService) {
        this.personService = _personService;
    }

    @PostMapping("/person")
    public ResponseEntity<PersonDto> createPerson(
            @RequestBody PersonDto personDto
    ) {
        PersonDto insertedPerson = this.personService.createPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(insertedPerson);
    }
}
