package com.springapps.sdorg.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CheckPoint implements Serializable {
    @Id
    private UUID checkpoint_id;
    private String checkpoint_name;
    private String location;
    private Date checkin_time;
    private String checkin_comment;
    private Date checkout_time;
    private String checkout_comment;
    private ECheckingStatus checkingStatus;
    @ManyToOne
    private Campus campus;
}
