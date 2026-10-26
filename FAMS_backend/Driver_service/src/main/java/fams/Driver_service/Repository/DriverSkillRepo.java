package fams.Driver_service.Repository;

import fams.Driver_service.Entity.DriverSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverSkillRepo extends JpaRepository<DriverSkill,String> {
}
