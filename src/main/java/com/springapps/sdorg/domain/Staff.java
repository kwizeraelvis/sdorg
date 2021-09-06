package com.springapps.sdorg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Staff extends Person{
    @Id
    @AttributeOverride(name = "person_id", column = @Column(name = "person_id"))
    private UUID staff_no;
    private String password;
}
