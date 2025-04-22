package lk.ijse.gdse.dto.tm;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserTM {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String role;

}
