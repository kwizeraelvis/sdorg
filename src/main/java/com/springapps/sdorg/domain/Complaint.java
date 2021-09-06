package com.springapps.sdorg.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Complaint implements Serializable {
    @Id
    @Column(name = "complaintId")
    private String complaint_id;
    @Lob
    private String comment;
    @CreationTimestamp
    private Timestamp createdOn;
    private Date resolvedOn;
    @Enumerated(value = EnumType.STRING)
    private EComplaintStatus complaintStatus;
    private String serialNumber;
    @ManyToOne
    private Device device;
    @ManyToOne
    private Campus campus;



}
