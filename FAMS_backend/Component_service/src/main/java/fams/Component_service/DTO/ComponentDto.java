package fams.Component_service.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponentDto {

    private String componentCode;
    private LocalDate purchaseDate;
    private String brand;
    private String model;
    private String regNumber;
    private String chassisNum;
    private int manufactureYear;
    private String engineNumb;
    private String numberPlate;
    private int currentMileage;
    private String colour;
    private String statusId;
    private String componentTypeId;
    private String fuelTypeId;
    private String ownerId;
    private String ownerTypeId;

}
