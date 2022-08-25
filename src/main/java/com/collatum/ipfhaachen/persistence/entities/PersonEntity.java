package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.dto.AddressDto;
import com.collatum.ipfhaachen.dto.PersonDto;

import org.bson.types.ObjectId;

import java.time.LocalTime;

public class PersonEntity {

    //attributes
    private LocalTime createdAt;
    private ObjectId id;
    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private String email;
    private AddressDto address;

    //constructors
    public PersonEntity() {
        this.id = null;
        this.dateOfBirth = null;
        this.familyName = null;
        this.givenName = null;
        this.email = null;
        this.address = new AddressDto();
    }

    public PersonEntity(
            ObjectId _id,
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            String _email,
            AddressDto _address
    ) {
        this.createdAt = LocalTime.now();
        this.id = _id;
        this.dateOfBirth = _dateOfBirth;
        this.familyName = _familyName;
        this.givenName = _givenName;
        this.email = _email;
        this.address = _address;
    }

    public PersonEntity(
            PersonDto personDto
    ) {
        this.createdAt = LocalTime.now();
        this.dateOfBirth = personDto.getDateOfBirth();
        this.familyName = personDto.getFamilyName();
        this.givenName = personDto.getGivenName();;
        this.email = personDto.getEmail();
        this.address = personDto.getAddress();
    }

    //setter

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setDateOfBirth(String _dateOfBirth) {
        this.dateOfBirth = _dateOfBirth;
    }

    public void setFamilyName(String _familyName) {
        this.familyName = _familyName;
    }

    public void setGivenName(String _givenName) {
        this.givenName = _givenName;
    }

    public void setAddress(AddressDto _address) {
        this.address = _address;
    }


    //getter
    public ObjectId getId() {
        return id;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public AddressDto getAddress() {
        return this.address;
    }

    public LocalTime getCreatedAt() { return this.createdAt; }
}
