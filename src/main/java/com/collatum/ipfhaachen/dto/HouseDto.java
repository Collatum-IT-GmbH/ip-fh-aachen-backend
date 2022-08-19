package com.collatum.ipfhaachen.dto;

public class HouseDto {
    private AddressDto address;

    public HouseDto(AddressDto address) {
        this.address = address;
    }

    public HouseDto() {
        this.address = new AddressDto();
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
