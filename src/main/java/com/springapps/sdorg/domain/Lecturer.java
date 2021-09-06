package com.springapps.sdorg.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Lecturer extends Person{
    @Id
    @AttributeOverride(name = "person_id", column = @Column(name = "person_id"))
    private UUID staff_no;
    private String password;


}
