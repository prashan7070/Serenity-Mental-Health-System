package lk.ijse.gdse.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Therapy_Session")

public class Therapy_Session implements SuperEntity{

    @Id
    @Column(name = "session_Id")
    private String sessionId;

    @OneToMany(mappedBy = "therapySessions")
    private List<Payment> payments;

    @ManyToOne
    @JoinColumn(name = "Patient_Id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "therapist_Id")
    private Therapist therapist;

    @Column(name = "start_date")
    private LocalDate date;

    @Column(name = "start_time")
    private LocalTime time;

    private int duration;

    @Column(name = "session_fee")
    private double fee;

    private String status;


}



