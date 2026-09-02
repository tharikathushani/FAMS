package fams.Driver_service.Controller;

import fams.Driver_service.Dto.DriverDto;
import fams.Driver_service.Dto.SkilDto;
import fams.Driver_service.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/save_driver")
    public ResponseEntity<String> saveDriver(@RequestBody DriverDto driverDto) {
        String saveDriver = driverService.saveComponent(driverDto);
        return new ResponseEntity<>(saveDriver, HttpStatus.CREATED);
    }

    @PostMapping("/save_skill")
    public ResponseEntity<String> saveSkill(@RequestBody SkilDto skilDto) {
        String saveSkill = driverService.saveSkill(skilDto);
        return new ResponseEntity<>(saveSkill, HttpStatus.CREATED);
    }


}



