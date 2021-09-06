package com.springapps.sdorg.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class Person implements Serializable {

    @Column(name = "person_id")
    private UUID person_id;
    private String firstName;
    private String lastName;
    private String userName;
    @Enumerated(value = EnumType.STRING)
    private EGender Gender;
    private String email;
    private String phone;
    private String profilePicture;
    @Enumerated(value = EnumType.STRING)
    private EUserType userType;
    @Enumerated(value = EnumType.STRING)
    private EAccountStatus accountStatus;

    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "owner")
    private Set<Device> devices = new HashSet<>();
}
