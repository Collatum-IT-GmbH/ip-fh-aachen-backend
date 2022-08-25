package com.collatum.ipfhaachen.api;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import com.collatum.ipfhaachen.business.exception.UserAlreadyExistsException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.collatum.ipfhaachen.business.service.PersonService;
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final @NonNull PersonService personService;

    @PostMapping("/person/create")
    public ResponseEntity<PersonDto> createPerson(
            @RequestBody PersonDto personDto
    ) throws UserAlreadyExistsException {
        PersonDto insertedPerson = this.personService.createPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(insertedPerson);
    }
}
