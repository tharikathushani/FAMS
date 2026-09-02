package fams.Component_service.Repository;

import fams.Component_service.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface OwnerRepo extends JpaRepository<Owner, String> {

}
