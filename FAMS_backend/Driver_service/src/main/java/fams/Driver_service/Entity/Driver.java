package fams.Driver_service.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "driver_id")
    private String driverId;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "licence_no")
    private String licenceNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_number")
    private String contactNum;

    @Column(name = "licence_number")
    private Date licenceExpDate;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private Set<DriverSkill> driverSkills = new HashSet<>();

}
