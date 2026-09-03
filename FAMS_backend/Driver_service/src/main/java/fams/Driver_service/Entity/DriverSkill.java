package fams.Driver_service.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "driver_skill")
public class DriverSkill {

    @Id
    @Column(name = "driver_skill_id")
    private Long driverSkillId;

    @ManyToOne
    @JoinColumn(name="driver_id", nullable=false)
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

}
