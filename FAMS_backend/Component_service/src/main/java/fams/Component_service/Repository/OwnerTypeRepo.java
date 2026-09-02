package fams.Component_service.Repository;

import fams.Component_service.Entity.OwnerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerTypeRepo extends JpaRepository<OwnerType, String> {

}
