package com.collatum.ipfhaachen.controller;

import com.collatum.ipfhaachen.dto.HouseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {

    @PostMapping("/house")
    public ResponseEntity<HouseDto> createHouse() {
        return ResponseEntity.status(HttpStatus.OK).body(new HouseDto());
    }
}
