package lk.ijse.gdse.dao.custom.impl;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.dao.custom.PatientDAO;
import lk.ijse.gdse.entity.Patient;
import org.hibernate.Session;

import java.util.Optional;

public class PatientDAOImpl implements PatientDAO{

    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();

    @Override
    public String getLastId() {

        Session session = factoryConfiguration.getSession();

        String lastId = session.createQuery("SELECT p.id FROM Patient p ORDER BY p.id DESC",String.class).setMaxResults(1).uniqueResult();

        return lastId;


    }
}
