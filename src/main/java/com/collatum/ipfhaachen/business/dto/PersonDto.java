package com.collatum.ipfhaachen.business.dto;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import com.collatum.ipfhaachen.utils.models.Address;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;

@ToString
@Getter
@RequiredArgsConstructor
public class PersonDto {
    private String id;
    private final @NonNull String dateOfBirth;
    private final @NonNull String familyName;
    private final @NonNull String givenName;
    private final @NonNull String email;
    private final @NonNull Address address;

    public PersonDto(
            PersonEntity personEntity
    ) {
        this.id = personEntity.getId().toString();
        this.dateOfBirth = personEntity.getDateOfBirth();
        this.familyName = personEntity.getFamilyName();
        this.givenName = personEntity.getGivenName();
        this.email = personEntity.getEmail();
        this.address = personEntity.getAddress();
    }
}
