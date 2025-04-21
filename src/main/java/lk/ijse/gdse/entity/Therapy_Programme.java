package lk.ijse.gdse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Therapy_Programme")

public class Therapy_Programme {

    @Id
    @Column(name = "Programme_Id")

    private String id;
    private String programmeName;
    private int duration;
    private double fee;
    private String description;



}
