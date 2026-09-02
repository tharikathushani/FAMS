package fams.Component_service.Repository;

import fams.Component_service.Entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ComponentRepo extends JpaRepository<Component,String> {
}
