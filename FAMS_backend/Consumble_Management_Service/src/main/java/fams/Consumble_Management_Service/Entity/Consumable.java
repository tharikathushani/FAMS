package fams.Consumble_Management_Service.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "consumable")
public class Consumable {

    @Id
    @Column(name = "consumable_id")
    private String consumableId;   // CON001

    @Column(name = "serial_number", unique = true, nullable = false)
    private String serialNumber;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "installed_position")
    private String installedPosition;

    @Column(name = "install_date")
    private LocalDate installDate;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private ConsumableType consumableType;

    @ManyToOne
    @JoinColumn(name = "status_id" , nullable = false)
    private ConsumbleStatus consumbleStatus;


}



