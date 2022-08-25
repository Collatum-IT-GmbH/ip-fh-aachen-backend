package com.collatum.ipfhaachen.dto;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;

public class PersonDto {

    //attributes
    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private String email;
    private AddressDto address;

    //constructors
    public PersonDto() {
        this.dateOfBirth = null;
        this.familyName = null;
        this.givenName = null;
        this.email = null;
        this.address = new AddressDto();
    }

    public PersonDto(
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            String _email,
            AddressDto _address
    ) {
        this.dateOfBirth = _dateOfBirth;
        this.familyName = _familyName;
        this.givenName = _givenName;
        this.email = _email;
        this.address = _address;
    }

    public PersonDto(
            PersonEntity personEntity
    ) {
        this.dateOfBirth = personEntity.getDateOfBirth();
        this.familyName = personEntity.getFamilyName();
        this.givenName = personEntity.getGivenName();
        this.email = personEntity.getEmail();
        this.address = personEntity.getAddress();
    }

    public static PersonDto fromEntity(PersonEntity personEntity) {
        return new PersonDto(
                personEntity
        );
    }

    //setter
    public void setDateOfBirth(String _dateOfBirth) { this.dateOfBirth = _dateOfBirth; }

    public void setFamilyName(String _familyName) {
        this.familyName = _familyName;
    }

    public void setGivenName(String _givenName) {
        this.givenName = _givenName;
    }

    public void setEmail(String _email) { this.email = _email; }

    public void setAddress(AddressDto _address) {
        this.address = _address;
    }


    //getter
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getEmail() { return this.email; }
    public AddressDto getAddress() {
        return this.address;
    }
}
