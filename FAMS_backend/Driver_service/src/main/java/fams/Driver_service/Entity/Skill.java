package fams.Driver_service.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "skill")
public class Skill {

    @Id
    @Column(name = "skill_id")
    private String skillId;

    @Column(name ="skill_name")
    private String skillName;

    @Column(name = "daily_rate")
    private  double dailyRate;

    @OneToMany(mappedBy = "skill")
    private Set<DriverSkill> driverSkills = new HashSet<>();


}
