package fams.Driver_service.Service;

import fams.Driver_service.Dto.DriverDto;
import fams.Driver_service.Dto.SkilDto;

public interface DriverService {
    String saveComponent(DriverDto driverDto);

    String saveSkill(SkilDto skilDto);
}
