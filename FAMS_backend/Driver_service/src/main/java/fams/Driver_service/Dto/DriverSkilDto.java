package fams.Driver_service.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverSkilDto {

    private Long driverSkillId;
    private String driverId;
    private String skillId;
}
