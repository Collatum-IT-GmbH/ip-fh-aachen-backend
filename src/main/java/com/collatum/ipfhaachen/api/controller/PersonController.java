package com.collatum.ipfhaachen.api.controller;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import com.collatum.ipfhaachen.business.exceptions.UserAlreadyExistsException;
import com.collatum.ipfhaachen.business.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDto> createPerson(
            @RequestBody PersonDto person
    ) throws UserAlreadyExistsException {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.personService.createPerson(person));
    }
}
