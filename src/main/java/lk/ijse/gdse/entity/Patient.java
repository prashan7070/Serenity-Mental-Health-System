package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Patient")

public class Patient implements SuperEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Patient_Id")

        private String id;
        private String name;
        private int age;
        private String address;
        private String phone;
        private String email;
        private String medicalHistory;


}
