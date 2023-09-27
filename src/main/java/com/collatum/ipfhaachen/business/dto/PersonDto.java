package com.collatum.ipfhaachen.business.dto;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import com.collatum.ipfhaachen.utils.models.Address;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class PersonDto {
    private String id;
    private final @NonNull String dateOfBirth;
    private final @NonNull String firstName;
    private final @NonNull String lastName;
    private final @NonNull String email;
    private final @NonNull Address address;

    public PersonDto(
            PersonEntity personEntity
    ) {
        this.id = personEntity.getId().toString();
        this.dateOfBirth = personEntity.getDateOfBirth();
        this.firstName = personEntity.getFirstName();
        this.lastName = personEntity.getLastName();
        this.email = personEntity.getEmail();
        this.address = personEntity.getAddress();
    }
}
