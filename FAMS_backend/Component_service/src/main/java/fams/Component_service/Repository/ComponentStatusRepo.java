package fams.Component_service.Repository;

import fams.Component_service.Entity.ComponentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentStatusRepo extends JpaRepository<ComponentStatus,String> {
}
