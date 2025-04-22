package lk.ijse.gdse.bo.custom;

import lk.ijse.gdse.bo.SuperBO;
import lk.ijse.gdse.bo.custom.impl.LoginBOImpl;
import lk.ijse.gdse.bo.custom.impl.PatientBOImpl;
import lk.ijse.gdse.bo.custom.impl.UserManageBOImpl;
import lk.ijse.gdse.dao.DaoFactory;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        return boFactory==null ? ( boFactory = new BOFactory()): boFactory;
    }

    @SuppressWarnings("unchecked")

    public <T extends SuperBO>T getBO(BOTypes boTypes){
        return switch (boTypes){

            case USER -> (T)new UserManageBOImpl();
            case PATIENT -> (T)new PatientBOImpl();
            case LOGIN -> (T)new LoginBOImpl();
            default -> null;

        };
    }


}
