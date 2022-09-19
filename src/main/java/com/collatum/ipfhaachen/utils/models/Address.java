package com.collatum.ipfhaachen.utils.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@RequiredArgsConstructor
public class Address {
    private final @NonNull String zip;
    private final @NonNull String city;
    private final @NonNull String street;
    private final @NonNull String houseNumber;
}
