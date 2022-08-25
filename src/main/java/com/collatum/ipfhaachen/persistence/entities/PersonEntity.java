package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.business.dto.AddressDto;
import com.collatum.ipfhaachen.business.dto.PersonDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class PersonEntity {

    //attributes
    private @Id ObjectId id;
    private LocalTime createdAt;
    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private String email;
    private AddressDto address;

    //constructors
    public PersonEntity(
            ObjectId _id,
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            String _email,
            AddressDto _address
    ) {
        this.createdAt = LocalTime.now();
        this.id = _id;
        this.dateOfBirth = _dateOfBirth;
        this.familyName = _familyName;
        this.givenName = _givenName;
        this.email = _email;
        this.address = _address;
    }

    public PersonEntity(
            PersonDto personDto
    ) {
        this.dateOfBirth = personDto.getDateOfBirth();
        this.familyName = personDto.getFamilyName();
        this.givenName = personDto.getGivenName();;
        this.email = personDto.getEmail();
        this.address = personDto.getAddress();
    }
}
