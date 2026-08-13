package fams.Component_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @Column(name = "owner_id")
    private String ownerID;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "contactNumber")
    private String contactNumber;

}
