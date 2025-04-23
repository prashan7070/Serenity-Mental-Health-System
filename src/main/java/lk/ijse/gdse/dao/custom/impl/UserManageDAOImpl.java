package lk.ijse.gdse.dao.custom.impl;

import lk.ijse.gdse.bo.exception.NotFoundException;
import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.dao.custom.UserManageDAO;
import lk.ijse.gdse.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Optional;

public class UserManageDAOImpl implements UserManageDAO {

    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();


    @Override
    public Optional<User> checkUserLoginInfo(String username) {

        Session session = factoryConfiguration.getSession();
        User user = session.get(User.class,username);
        session.close();

        if (user==null){
            return Optional.empty();
        }

        return Optional.of(user);

    }


    @Override
    public String getLastId() {

        Session session = factoryConfiguration.getSession();

        String lastId = session.createQuery("SELECT u.id FROM User u ORDER BY u.id DESC", String.class).setMaxResults(1).uniqueResult();

        return lastId;

    }

}
