package lk.ijse.gdse.dao;

import lk.ijse.gdse.dao.custom.impl.PatientDAOImpl;
import lk.ijse.gdse.dao.custom.impl.UserManageDAOImpl;

public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory(){

    }

    public static DaoFactory getInstance(){
        return daoFactory==null? ( daoFactory = new DaoFactory() ): daoFactory;
    }

    @SuppressWarnings("unchecked")

    public <T extends SuperDAO>T getDAO(DaoTypes daoTypes){

        return switch (daoTypes){

            case USER -> (T)new UserManageDAOImpl();
            case PATIENT -> (T)new PatientDAOImpl();
            default ->null;
        };

    }



}
