package fams.Driver_service.Service.ServiceImpl;

import fams.Driver_service.Dto.DriverDto;
import fams.Driver_service.Dto.SkilDto;
import fams.Driver_service.Entity.Driver;
import fams.Driver_service.Entity.Skill;
import fams.Driver_service.Repository.DriverRepo;
import fams.Driver_service.Repository.SkillRepo;
import fams.Driver_service.Service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private SkillRepo skillRepo;

    @Override
    public String saveComponent(DriverDto driverDto) {
        Driver driver = modelMapper.map(driverDto, Driver.class);
        String driverId = generateDriverId();
        driver.setDriverId(driverId);
        driverRepo.save(driver);

        return "Driver Added";
    }

    @Override
    public String saveSkill(SkilDto skilDto) {
        Skill skill = modelMapper.map(skilDto, Skill.class);
        String SkillId = generateSkillId();
        skill.setSkillId(SkillId);
        skillRepo.save(skill);
        return "succsess";
    }

    private String generateSkillId() {
        long count = skillRepo.count()+1;
        return String.format("SKI%03d",count);
    }

    private String generateDriverId() {
        long count = driverRepo.count()+1;
        return String.format("DRI%03d",count);
    }
}
