package fams.Driver_service.Repository;

import fams.Driver_service.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, String> {
}
