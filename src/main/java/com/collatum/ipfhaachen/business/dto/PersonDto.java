package com.collatum.ipfhaachen.business.dto;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import lombok.*;

@ToString
@Getter
@RequiredArgsConstructor
public class PersonDto {

    //attributes
    private final @NonNull String dateOfBirth;
    private final @NonNull String familyName;
    private final @NonNull String givenName;
    private final @NonNull String email;
    private final @NonNull AddressDto address;

    //constructors

    public PersonDto(
            PersonEntity personEntity
    ) {
        this.dateOfBirth = personEntity.getDateOfBirth();
        this.familyName = personEntity.getFamilyName();
        this.givenName = personEntity.getGivenName();
        this.email = personEntity.getEmail();
        this.address = personEntity.getAddress();
    }
}
