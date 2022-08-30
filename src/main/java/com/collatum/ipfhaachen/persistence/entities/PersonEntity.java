package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.utils.models.Address;
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
    private LocalTime updatedAt;
    private String dateOfBirth;
    private String familyName;
    private String givenName;
    private String email;
    private Address address;

    //constructors
    public PersonEntity(
            ObjectId _id,
            String _dateOfBirth,
            String _familyName,
            String _givenName,
            String _email,
            Address _address
    ) {
        this.updatedAt = LocalTime.now();
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
        if(personDto.getId() != null) {
            this.id = new ObjectId(personDto.getId());
        }
        this.updatedAt = LocalTime.now();
        this.dateOfBirth = personDto.getDateOfBirth();
        this.familyName = personDto.getFamilyName();
        this.givenName = personDto.getGivenName();;
        this.email = personDto.getEmail();
        this.address = personDto.getAddress();
    }
}
