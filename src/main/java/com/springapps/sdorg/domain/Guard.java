package com.springapps.sdorg.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Guard extends Person {
    @Id
    @AttributeOverride(name = "person_id", column = @Column(name = "person_id"))
    private UUID service_number;
}
