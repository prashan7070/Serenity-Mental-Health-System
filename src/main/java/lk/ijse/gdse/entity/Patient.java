package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Patient")

public class Patient implements SuperEntity{

        @Id
        @Column(name = "Patient_Id")
        private String id;
        private String name;
        private int age;
        private String address;
        private String phone;
        private String email;
        private String medicalHistory;

        @OneToMany(mappedBy = "patient")
        private List<Registration> registrations;

        @OneToMany(mappedBy = "patient")
        private List<Therapy_Session> therapySessions;


}
