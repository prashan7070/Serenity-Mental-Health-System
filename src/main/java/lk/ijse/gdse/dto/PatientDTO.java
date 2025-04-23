package lk.ijse.gdse.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PatientDTO {

    private String id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String medicalHistory;


}
