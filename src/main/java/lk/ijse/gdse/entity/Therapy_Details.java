package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Therapy_Details")

public class Therapy_Details implements SuperEntity{

    @ManyToOne
    @JoinColumn(name = "Programme_Id")
    private Therapy_Programme therapyProgramme;

    @ManyToOne
    @JoinColumn(name = "therapist_Id")
    private Therapist therapist;

    private LocalDate assignedDate;
    private String role;
    private int hoursPerWeek;


}
