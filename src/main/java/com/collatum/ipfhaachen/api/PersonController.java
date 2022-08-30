package com.collatum.ipfhaachen.api;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import com.collatum.ipfhaachen.business.exception.UserAlreadyExistsException;
import com.collatum.ipfhaachen.business.exception.UserNotFoundException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.collatum.ipfhaachen.business.service.PersonService;
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final @NonNull PersonService personService;

    @PostMapping("/person/createPerson")
    public ResponseEntity<PersonDto> createPerson(
            @RequestBody PersonDto personDto
    ) throws UserAlreadyExistsException {
        PersonDto insertedPerson = this.personService.createPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(insertedPerson);
    }

    @GetMapping("/person/getPersonById")
    public ResponseEntity<PersonDto> getPersonById(
            @RequestParam(name = "id") String id
    ) throws UserNotFoundException {
        PersonDto requestedPerson = this.personService.getPerson(new ObjectId(id));
        return ResponseEntity.status(HttpStatus.OK).body(requestedPerson);
    }

    @DeleteMapping("/person/deletePerson")
    public ResponseEntity<Boolean> deletePerson(
            @RequestParam(name = "id") String id
    ) throws UserNotFoundException {
        this.personService.deletePerson(new ObjectId(id));
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @PutMapping("/person/updatePerson")
    public ResponseEntity<PersonDto> updatePerson(
            @RequestBody PersonDto personDto
    ) throws UserNotFoundException {
        PersonDto updatedPerson = this.personService.updatePerson(personDto);
        return ResponseEntity.status(HttpStatus.OK).body(updatedPerson);
    }
}
