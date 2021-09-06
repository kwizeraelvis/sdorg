package com.springapps.sdorg.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class GPS implements Serializable {
    @Id
    private UUID gps_id;
    private String latitude;
    private String longitude;
    @OneToOne
    private Device device;
}
