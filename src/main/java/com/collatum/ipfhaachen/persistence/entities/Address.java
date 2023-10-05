package com.collatum.ipfhaachen.persistence.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Address {
    //attributes
    private final @NonNull String zip;
    private final @NonNull String city;
    private final @NonNull String street;
    private final @NonNull String houseNumber;

}
