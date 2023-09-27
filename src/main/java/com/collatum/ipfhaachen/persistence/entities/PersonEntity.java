package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.utils.models.Address;
import com.collatum.ipfhaachen.business.dto.PersonDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "persons")
public class PersonEntity {

    //attributes
    private @Id ObjectId id;
    private LocalTime updatedAt;
    private String dateOfBirth;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;

    //constructors
    public PersonEntity(
            ObjectId id,
            String dateOfBirth,
            String firstName,
            String lastName,
            String email,
            Address address
    ) {
        this.updatedAt = LocalTime.now();
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public PersonEntity(
            PersonDto personDto
    ) {
        if(personDto.getId() != null) {
            this.id = new ObjectId(personDto.getId());
        }
        this.updatedAt = LocalTime.now();
        this.dateOfBirth = personDto.getDateOfBirth();
        this.firstName = personDto.getFirstName();
        this.lastName = personDto.getLastName();;
        this.email = personDto.getEmail();
        this.address = personDto.getAddress();
    }
}
