package fams.Driver_service.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private String driverName;
    private String licenceNumber;
    private String address;
    private String contactNum;
    private Date licenceExpDate;
}
