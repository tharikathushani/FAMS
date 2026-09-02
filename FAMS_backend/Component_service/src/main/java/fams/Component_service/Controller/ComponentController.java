package fams.Component_service.Controller;

import fams.Component_service.DTO.CmponentTypeDto;
import fams.Component_service.DTO.ComponentDto;
import fams.Component_service.DTO.ComponentStatusDto;
import fams.Component_service.DTO.FuelTypeDto;
import fams.Component_service.Service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/component")
@CrossOrigin
public class ComponentController {

    @Autowired
    private ComponentService componentService;

    @PostMapping("/save_component")
    public ResponseEntity<String> saveComponent(@RequestBody ComponentDto componentDto){
        String saveComponent = componentService.saveComponent(componentDto);
        return new ResponseEntity<>(saveComponent, HttpStatus.CREATED);
    }

    @PostMapping("/save_component_type")
    public ResponseEntity<String> saveComponentType(@RequestBody CmponentTypeDto cmponentTypeDto){
        String saveComponentType = componentService.saveComponentType(cmponentTypeDto);
        return new ResponseEntity<>(saveComponentType, HttpStatus.CREATED);
    }

    @PostMapping("/save_component_status")
    public ResponseEntity<String> saveComponentStatus(@RequestBody ComponentStatusDto componentStatusDto){
        String saveComponentSataus = componentService.saveComponentStatus(componentStatusDto);
        return new ResponseEntity<>(saveComponentSataus, HttpStatus.CREATED);
    }

    @PostMapping("/save_fuel_type")
    public ResponseEntity<String> saveFuelType(@RequestBody FuelTypeDto fuelTypeDto ){
        String savefuelType = componentService.savefuelType(fuelTypeDto);
        return new ResponseEntity<>(savefuelType, HttpStatus.CREATED);
    }
}


