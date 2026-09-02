package fams.Driver_service.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "driver_skill")
public class DriverSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="driver_id", nullable=false)
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

}
