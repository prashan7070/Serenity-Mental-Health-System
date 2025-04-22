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
@Table(name = "therapist")

public class Therapist implements SuperEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "therapist_Id")
        private Long id;

        private String name;
        private String age;
        private String specialization;

        @Column(name = "phone_number")
        private String phoneNumber;
        private String email;

        @OneToMany(mappedBy = "therapist")
        private List<Therapy_Details> therapyDetails;

        @OneToMany(mappedBy = "therapist")
        private List<Therapy_Session> therapySessions;


}
