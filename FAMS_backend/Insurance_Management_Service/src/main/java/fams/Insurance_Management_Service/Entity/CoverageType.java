package fams.Insurance_Management_Service.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "insurance_coverage")

public class CoverageType {
    @Id
    @Column(name = "coverage_type_id")
    private String coverageTypeId;

    @Column(name = "coverage_Type_name")
    private String coverageName;

    @OneToMany(mappedBy = "coverageType")
    private List<Insurance> insurances;

}
