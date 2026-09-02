package fams.Component_service.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "owner_type")
public class OwnerType {
    @Id
    @Column(name = "owner_type_id")
    private String ownerTypeId;

    @Column(name = "owner_type_name")
    private String ownerTypeName;


}
