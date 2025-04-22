package lk.ijse.gdse.bo.custom;


import lk.ijse.gdse.bo.SuperBO;
import lk.ijse.gdse.dao.SuperDAO;
import lk.ijse.gdse.dto.UserDTO;

import java.util.Optional;

public interface LoginBO extends SuperBO {


    Optional<UserDTO> validateLogin(String username , String password);



}
