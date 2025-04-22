package lk.ijse.gdse.dto.tm;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PatientTM {

    private Long id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String medicalHistory;

}
