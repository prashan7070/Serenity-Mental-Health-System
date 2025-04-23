package lk.ijse.gdse.dao;

import lk.ijse.gdse.entity.SuperEntity;

import java.util.Optional;

public interface CrudDAO<T extends SuperEntity,ID> extends SuperDAO {


        String getLastId();




}
