package lk.ijse.gdse.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "registration")

public class Registration implements SuperEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long registrationId;

        @ManyToOne
        @JoinColumn(name = "Patient_Id")
        private Patient patient;

        @ManyToOne
        @JoinColumn(name = "Programme_Id")
        private Therapy_Programme therapyProgramme;

        private LocalDate registrationDate;


}
