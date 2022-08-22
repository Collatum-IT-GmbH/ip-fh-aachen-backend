package com.collatum.ipfhaachen.dto;

public class PersonDto {

    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private AddressDto address;

    public PersonDto() {
        this.dateOfBirth = null;
        this.familyName = null;
        this.givenName = null;
        this.address = new AddressDto();
    }

    public PersonDto(
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            AddressDto _address
    ) {
        this.dateOfBirth = _dateOfBirth;
        this.familyName = _familyName;
        this.givenName = _givenName;
        this.address = _address;
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
