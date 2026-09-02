package fams.Component_service.Repository;

import fams.Component_service.Entity.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepo extends JpaRepository<FuelType,String> {
}
