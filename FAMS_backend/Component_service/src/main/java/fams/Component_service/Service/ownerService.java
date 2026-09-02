package fams.Component_service.Service;

import fams.Component_service.DTO.OwnerDto;
import fams.Component_service.DTO.OwnerTypeDto;

public interface ownerService {
    String saveOwner(OwnerDto ownerDto);

    String saveOwnerType(OwnerTypeDto ownerTypeDto);
}
