package fams.Component_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="componentStatus")

public class ComponentStatus {
    @Id
    @Column(name = "status_id")
    private String statusID;

    @Column(name = "status_name")
    private String statusName;
}
