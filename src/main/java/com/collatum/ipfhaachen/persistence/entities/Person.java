package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.dto.AddressDto;
import org.bson.types.ObjectId;

public class Person {
    private ObjectId id;
    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private AddressDto address;

    public Person() {
        this.id = null;
        this.dateOfBirth = null;
        this.familyName = null;
        this.givenName = null;
        this.address = new AddressDto();
    }

    public Person(
            ObjectId _id,
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            AddressDto _address
    ) {
        this.id = _id;
        this.dateOfBirth = _dateOfBirth;
        this.familyName = _familyName;
        this.givenName = _givenName;
        this.address = _address;
    }


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
}
