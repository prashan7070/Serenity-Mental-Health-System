package lk.ijse.gdse.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "User")
public class User implements SuperEntity {

    @Id
    @Column(name = "User_Id")
    private String id;

    private String name;
    private String username;
    private String password;
    private String email;
    private String role;


}
