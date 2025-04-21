package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Therapy_Programme")

public class Therapy_Programme implements SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Programme_Id")
    private Long programmeId;

    private String programmeName;
    private int duration;
    private double fee;
    private String description;

    @OneToMany(mappedBy = "therapyProgramme")
    private List<Registration> registrations;

    @OneToMany(mappedBy = "therapyProgramme")
    private List<Therapy_Details> therapyDetails;



}
