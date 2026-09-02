package fams.Insurance_Management_Service.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "insurance")

public class Insurance {
    @Id
    @Column(name = "insurance")
    private String insuranceId;

    @ManyToOne
    @JoinColumn(name = "insurance_company_id")
    private InsuranceCompany insuranceCompany;

    @ManyToOne
    @JoinColumn(name = "coverage_type_id")
    private CoverageType coverageType;

    @Column(name = "policy_number")
    private String policyNum;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "expire_date")
    private Date expireDate;

    @Column(name = "Amount")
    private double amount;



}
