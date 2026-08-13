package fams.Component_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fuelType")
public class FuelType {
    @Id
    @Column(name = "fuel_type_id")
    private String fuelTypeId;

    @Column(name = "fuel_type_name")
    private String fuelTypeName;


}
