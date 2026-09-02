package fams.Component_service.Controller;

import fams.Component_service.DTO.OwnerDto;
import fams.Component_service.DTO.OwnerTypeDto;
import fams.Component_service.Service.ComponentService;
import fams.Component_service.Service.ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/owner")
@CrossOrigin
public class OwnerController {

    @Autowired
    private ownerService ownerService;

    @PostMapping("Save_owner")
    public ResponseEntity<String> saveOwner(@RequestBody OwnerDto ownerDto) {
        String response = ownerService.saveOwner(ownerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("Save_ownerType")
    public ResponseEntity<String> saveOwnertype(@RequestBody OwnerTypeDto ownerTypeDto) {
        String response = ownerService.saveOwnerType(ownerTypeDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }




}
