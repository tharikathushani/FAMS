package fams.Insurance_Management_Service.Entity;

import ch.qos.logback.core.model.NamedModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "insurance_company")
public class InsuranceCompany {
    @Id
    @Column(name = "insurance_company_id")
    private String companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "email")
    private String companyEmail;

    @OneToMany(mappedBy = "insuranceCompany")
    private List<Insurance> insurances;

}
