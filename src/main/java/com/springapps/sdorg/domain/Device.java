package com.springapps.sdorg.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Device implements Serializable {
    @Id
    private String serialNumber;
    private String deviceName;
    private String macAddress;
    private Long rfid;
    @Enumerated
    private EDeviceType deviceType;
    private Date registrationDate;
    @Enumerated
    private ECheckingStatus checkingStatus;
    private String details;
    private String devicePictures;
    @Enumerated
    private EUserCheckingStatus userCheckingStatus;
    @OneToOne
    private GPS gps;
    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "device")
    private Set<Complaint> complaints = new HashSet<>();
    @ManyToOne
    private Campus campus;
    @ManyToOne
    private Lecturer lecturer;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Staff staff;

}
