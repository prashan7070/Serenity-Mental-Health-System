package lk.ijse.gdse.config;

import lk.ijse.gdse.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){

        Configuration configuration =  new Configuration().configure();

        configuration.addAnnotatedClass(Patient.class)
                .addAnnotatedClass(Therapy_Programme.class)
                .addAnnotatedClass(Registration.class)
                .addAnnotatedClass(Payment.class)
                .addAnnotatedClass(Therapist.class)
                .addAnnotatedClass(Therapy_Details.class)
                .addAnnotatedClass(Therapy_Session.class)
                .addAnnotatedClass(User.class);


        sessionFactory = configuration.buildSessionFactory();

    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ? new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }


}
