package fams.Component_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "componentType")
@Data
public class ComponentType {
    @Id
    @Column(name = "component_type_id")
    private String typeId;

    @Column(name = "type_name")
    private String typeName;

}
