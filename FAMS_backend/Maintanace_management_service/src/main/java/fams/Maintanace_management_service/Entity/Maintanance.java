package fams.Maintanace_management_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.naming.Name;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "maintanance")

public class Maintanance {
    @Id
    @Column(name = "maintanance_id")
    private String maintanaceId;

    @Column(name = "maintanace_date")
    private LocalDate maintananceDate;

    @Column(name = "discription")
    private LocalDate discription;

    @Column(name = "cost")
    private LocalDate cost;

    @Column(name = "next_due date")
    private LocalDate next_due_date;

}
