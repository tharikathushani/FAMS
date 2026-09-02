package fams.Component_service.Repository;

import fams.Component_service.Entity.ComponentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentTypeRepo extends JpaRepository<ComponentType, String> {

}
