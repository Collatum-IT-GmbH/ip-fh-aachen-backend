package com.collatum.ipfhaachen.persistence.entities;

import com.collatum.ipfhaachen.business.dto.PersonDto;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@ToString
@Setter
@NoArgsConstructor
@Document(collection = "persons")
public class PersonEntity {
    //attributes
    private @Id ObjectId id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private Address address;

    public PersonEntity(PersonDto personDto) {
        if(personDto.getId() != null) {
            this.id = new ObjectId(personDto.getId());
        }
        this.firstName = personDto.getFirstName();
        this.lastName = personDto.getLastName();
        this.dateOfBirth = personDto.getDateOfBirth();
        this.email = personDto.getEmail();
        this.address = personDto.getAddress();
    }
}
