package fams.Component_service.Service.ServiceImpl;

import fams.Component_service.DTO.*;
import fams.Component_service.Entity.*;
import fams.Component_service.Repository.*;
import fams.Component_service.Service.ComponentService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentRepo componentRepo;

    @Autowired
    private ComponentTypeRepo componentTypeRepo;

    @Autowired
    private ComponentStatusRepo componentStatusRepo;

    @Autowired
    private ModelMapper modelmapper;

    @Autowired
    private FuelTypeRepo fuelTypeRepo;


    @Override
    public String saveComponent(ComponentDto componentDto) {

        Component component = modelmapper.map(componentDto,Component.class);

        String componentId = generateComponentId();
        component.setComponentId(componentId);

        componentRepo.save(component);

        return componentId + " Added component Successfully";
    }

    @Override
    public String saveComponentType(CmponentTypeDto cmponentTypeDto) {
        ComponentType componentType = modelmapper.map(cmponentTypeDto ,ComponentType.class);
        String componentTypeId = generateComponentTypeId();
        componentType.setTypeId(componentTypeId);
        componentTypeRepo.save(componentType);
        return componentTypeId + " Added successfullly ";
    }

    @Override
    public String saveComponentStatus(ComponentStatusDto componentStatusDto) {
        ComponentStatus componentStatus = modelmapper.map(componentStatusDto, ComponentStatus.class);
        String componentStatusId = generateComponentStatusId();
        componentStatus.setStatusID(componentStatusId);
        componentStatusRepo.save(componentStatus);
        return componentStatusId+" added";
    }

    @Override
    public String savefuelType(FuelTypeDto fuelTypeDto) {
        FuelType fuelType = modelmapper.map(fuelTypeDto , FuelType.class);
        String fueltypeId = generateFuelTypeId();
        fuelType.setFuelTypeId(fueltypeId);
        fuelTypeRepo.save(fuelType);

        return fuelType.getFuelTypeName()+" Added";
    }

    private String generateFuelTypeId() {
        long count = fuelTypeRepo.count() +1;
        return String.format("FUL%03d",count);
    }

    private String generateComponentStatusId() {
        long count = componentStatusRepo.count() +1;
        return String.format("CMS%03d",count);
    }

    private String generateComponentTypeId() {
        long Count = componentTypeRepo.count() +1;
        return String.format("CMT%03d",Count);
    }


    private String generateComponentId() {
        long count = componentRepo.count() + 1;
        return String.format("CMP%03d", count);
    }
}
