package com.springapps.sdorg.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Campus implements Serializable {
    @Id
    @Column(name = "campusId")
    private String campus_id;
    private String campusName;
    private String details;
    private String location;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "campus")
    @Builder.Default
    private Set<Complaint> complaints = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "campus")
    @Builder.Default
    private Set<Device> devices = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "campus")
    @Builder.Default
    private Set<CheckPoint> checkPoints = new HashSet<>();
}
