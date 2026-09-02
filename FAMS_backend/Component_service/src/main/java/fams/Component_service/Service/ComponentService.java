package fams.Component_service.Service;

import fams.Component_service.DTO.*;

public interface ComponentService {
    String saveComponent(ComponentDto departmentDto);

    String saveComponentType(CmponentTypeDto cmponentTypeDto);

    String saveComponentStatus(ComponentStatusDto componentStatusDto);

    String savefuelType(FuelTypeDto fuelTypeDto);
}
