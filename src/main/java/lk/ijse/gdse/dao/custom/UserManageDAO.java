package lk.ijse.gdse.dao.custom;

import lk.ijse.gdse.dao.CrudDAO;
import lk.ijse.gdse.entity.User;

import java.util.Optional;

public interface UserManageDAO extends CrudDAO<User,String> {

        Optional<User> checkUserLoginInfo(String username);


}
