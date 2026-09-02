package fams.Maintanace_management_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "maintananceType")
public class MaintananceType {
    @Id
    @Column(name = "maintanance_type")
    private String maintananceTypeId;

    @Column(name = "maintanance_Name")
    private String MaintananceName;
}
