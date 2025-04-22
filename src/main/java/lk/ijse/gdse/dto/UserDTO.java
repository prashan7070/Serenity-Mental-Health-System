package lk.ijse.gdse.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserDTO {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String role;


}
