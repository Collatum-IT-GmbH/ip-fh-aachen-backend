package com.collatum.ipfhaachen.utils.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public record Address(
        @NonNull String zip,
        @NonNull String city,
        @NonNull String street,
        @NonNull String houseNumber
) { }
