package com.collatum.ipfhaachen.business.dto;

import com.collatum.ipfhaachen.persistence.entities.PersonEntity;
import com.collatum.ipfhaachen.utils.models.Address;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@ToString
@Getter
@RequiredArgsConstructor
public class PersonDto {
    private @Id ObjectId id;
    private final @NonNull String dateOfBirth;
    private final @NonNull String familyName;
    private final @NonNull String givenName;
    private final @NonNull String email;
    private final @NonNull Address address;

    public PersonDto(
            PersonEntity personEntity
    ) {
        this.id = personEntity.getId();
        this.dateOfBirth = personEntity.getDateOfBirth();
        this.familyName = personEntity.getFamilyName();
        this.givenName = personEntity.getGivenName();
        this.email = personEntity.getEmail();
        this.address = personEntity.getAddress();
    }
}
