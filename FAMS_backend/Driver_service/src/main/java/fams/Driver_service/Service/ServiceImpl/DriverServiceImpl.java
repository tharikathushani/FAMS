package fams.Driver_service.Service.ServiceImpl;

import fams.Driver_service.Dto.DriverDto;
import fams.Driver_service.Dto.SkilDto;
import fams.Driver_service.Entity.Driver;
import fams.Driver_service.Entity.DriverSkill;
import fams.Driver_service.Entity.Skill;
import fams.Driver_service.Repository.DriverRepo;
import fams.Driver_service.Repository.DriverSkillRepo;
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

    @Autowired
    private DriverSkillRepo driverSkillRepo;

    @Override
    public String saveComponent(DriverDto driverDto) {
        Driver driver = new Driver();
        String driverId = generateDriverId();
        driver.setDriverId(driverId); //driverid
        driver.setDriverName(driverDto.getDriverName());
        driver.setAddress(driverDto.getAddress());
        driver.setContactNum(driverDto.getContactNum());
        driver.setLicenceNumber(driverDto.getLicenceNumber());


        for (String skillId : driverDto.getSkillIds()) {

            Skill skill = skillRepo.findById(skillId)
                    .orElseThrow(() ->
                            new RuntimeException("Skill not found: " + skillId));

            DriverSkill driverSkill = new DriverSkill();

            driverSkill.setDriverSkillId(generateDriverSkillId());
            driverSkill.setDriver(driver);
            driverSkill.setSkill(skill);

            driver.getDriverSkills().add(driverSkill);
        }
        // 3. Save Driver + DriverSkills
        driverRepo.save(driver);

        return driverId + " Driver added successfully";
    }

    private String generateDriverSkillId() {
        long count = driverSkillRepo.count()+1;
        return String.format("DSk%03d",count);
    }

    @Override
    public String saveSkill(SkilDto skilDto) {
        Skill skill = modelMapper.map(skilDto, Skill.class);
        String SkillId = generateSkillId();
        skill.setSkillId(SkillId);
        skillRepo.save(skill);
        return "success";
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
