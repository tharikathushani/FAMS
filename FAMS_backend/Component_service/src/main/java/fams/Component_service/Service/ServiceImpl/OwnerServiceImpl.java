package fams.Component_service.Service.ServiceImpl;

import fams.Component_service.DTO.OwnerDto;
import fams.Component_service.DTO.OwnerTypeDto;
import fams.Component_service.Entity.Owner;
import fams.Component_service.Entity.OwnerType;
import fams.Component_service.Repository.OwnerRepo;
import fams.Component_service.Repository.OwnerTypeRepo;
import fams.Component_service.Service.ownerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements ownerService {

    @Autowired
    private OwnerRepo ownerRepo;

    @Autowired
    private OwnerTypeRepo ownerTypeRepo;

    @Autowired
    private ModelMapper modelmapper;

    @Override
    public String saveOwner(OwnerDto ownerDto) {

        Owner owner = modelmapper.map(ownerDto, Owner.class);
        String ownerId = generateOwnerId();
        owner.setOwnerID(ownerId);
        ownerRepo.save(owner);
        return ownerId + " Owner added successfully";
    }

    @Override
    public String saveOwnerType(OwnerTypeDto ownerTypeDto) {
        OwnerType ownerType = modelmapper.map(ownerTypeDto, OwnerType.class);
        String ownerTypeId = (generateOwnerTypeId());
        ownerType.setOwnerTypeId(ownerTypeId);
        ownerTypeRepo.save(ownerType);
        return "success";
    }

    private String generateOwnerTypeId() {
        long count = ownerRepo.count() + 1;
        return String.format("OWNTy%03d", count);
    }

    private String generateOwnerId() {

        long count = ownerRepo.count() + 1;
        return String.format("OWN%03d", count);
    }


}
