package com.collatum.ipfhaachen.dto;

public class AddressDto {
    private String zip;
    private String city;
    private String street;
    private String houseNumber;

    public AddressDto() {
        this.zip = null;
        this.city = null;
        this.street = null;
        this.houseNumber = null;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}