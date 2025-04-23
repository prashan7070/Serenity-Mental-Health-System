package lk.ijse.gdse.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "payment")

public class Payment implements SuperEntity{

    @Id
    private String paymentId;

    private String paymentMethod;

    @Column(name = "registered_date")
    private String registeredDate;

    @Column(name = "Registration_Fee")
    private double amount;

    @Column(name = "Session_Fee")
    private double sessionFee;

    @Column(name = "payment_date")
    private LocalDate paymentDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "programme_id")
    private Therapy_Programme therapyProgramme;


    @ManyToOne
    @JoinColumn(name = "session_Id")
    private Therapy_Session therapySessions;


}
