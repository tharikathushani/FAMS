package fams.Consumble_Management_Service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumable_type")
public class ConsumableType {

    @Id
    @Column(name = "type_id")
    private String typeId;   // CST001

    @Column(name = "type_name", nullable = false)
    private String typeName;
}
