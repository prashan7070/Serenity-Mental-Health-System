package lk.ijse.gdse.bo.custom.impl;

import lk.ijse.gdse.bo.custom.LoginBO;
import lk.ijse.gdse.dao.DaoFactory;
import lk.ijse.gdse.dao.DaoTypes;
import lk.ijse.gdse.dao.custom.UserManageDAO;
import lk.ijse.gdse.dto.UserDTO;
import lk.ijse.gdse.entity.User;

import java.util.Optional;

public class LoginBOImpl implements LoginBO {

    UserManageDAO userManageDAO = DaoFactory.getInstance().getDAO(DaoTypes.USER);



    @Override
    public Optional<UserDTO> validateLogin(String username, String password) {


        Optional<User> optionalUser = userManageDAO.checkUserLoginInfo(username);

        if (optionalUser.isPresent()){

            User user = optionalUser.get();
            if (user.getPassword().equals(password)){
                return Optional.of(new UserDTO(user.getId(),user.getName(),user.getUsername(),user.getPassword(),user.getEmail(),user.getRole()));
            }

        }

         return Optional.empty();


    }


}
