package fams.Consumble_Management_Service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumable_status")
public class ConsumbleStatus {
    @Id
    @Column(name = "Status_id")
    private String statusId;

    @Column(name = "Status_name", nullable = false)
    private String statusName;

}
