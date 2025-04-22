module lk.ijse.gdse.serenity_mental_health_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;
    requires lombok;

    opens lk.ijse.gdse.entity to org.hibernate.orm.core;
    opens lk.ijse.gdse.config to jakarta.persistence;

    opens lk.ijse.gdse.dto.tm to javafx.base;
    opens lk.ijse.gdse.controller to javafx.fxml;
    opens lk.ijse.gdse to javafx.fxml;
    opens lk.ijse.gdse.dto to javafx.base;

    exports lk.ijse.gdse;


    /*

    opens lk.ijse.gdse.dto.tm to javafx.base;
    opens lk.ijse.gdse.entity to org.hibernate.orm.core;
    opens lk.ijse.gdse.config to jakarta.persistence;
    opens lk.ijse.gdse.controller to javafx.fxml;
    opens lk.ijse.gdse to javafx.fxml;
    exports lk.ijse.gdse;
    opens lk.ijse.gdse.dto to javafx.base;




    */



}