package com.collatum.ipfhaachen.controller;

import com.collatum.ipfhaachen.dto.PersonDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<PersonDto> createPerson() {
        return ResponseEntity.status(HttpStatus.OK).body(new PersonDto());
    }
}
