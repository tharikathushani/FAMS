package fams.Component_service.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "Component")
public class Component {

    @Id
    @Column(name = "component" ,nullable = false)
    private String componentId;

    @Column(name = "component_code" ,nullable = false)
    private String componentCode;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "brand",nullable = false)
    private String brand;

    @Column (name = "model",nullable = false)
    private String Brand;

    @Column(name = "registration_number", unique = true)
    private String regNumber;

    @Column (name = "chassie_number" ,unique = true)
    private String chassisNum;

    @Column(name = "manufacure_year")
    private int manufactureYear;

    @Column (name = "engine_number",unique = true)
    private String engineNumb;

    @Column(name = "number_plate",unique = true)
    private String numberPlate;

    @Column(name = "current_miledge",nullable = false)
    private int currentMileage;

    @Column(name = "colour",nullable = false)
    private String colour;

//relationships

    @ManyToOne
    @JoinColumn(name="status_id", nullable=false)
    private ComponentStatus componentStatus;

    @ManyToOne
    @JoinColumn(name="component_type_id", nullable=false)
    private ComponentType componentType;

    @ManyToOne
    @JoinColumn(name="fuel_type_id", nullable=false)
    private FuelType fuelType;

    @ManyToOne
    @JoinColumn(name="owner_id", nullable=false)
    private Owner owner;

    @ManyToOne
    @JoinColumn(name="owner_type_id", nullable=false)
    private OwnerType ownerType;

}

//private component code
//purchase date ,brand,model,registration number,chassie number,
// manufacture year,engine number, component number plate,current miledge,colour
