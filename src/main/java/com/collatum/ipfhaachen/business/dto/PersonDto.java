package com.collatum.ipfhaachen.business.dto;

import com.collatum.ipfhaachen.persistence.entities.Address;
import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class PersonDto {
    //attributes
    private final String id;
    private final @NonNull String firstName;
    private final @NonNull String lastName;
    private final @NonNull String dateOfBirth;
    private final @NonNull String email;
    private final @NonNull Address address;

    public PersonDto(PersonEntity person) {
        this.id = person.getId().toString();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.dateOfBirth = person.getDateOfBirth();
        this.email = person.getEmail();
        this.address = person.getAddress();
    }
}
