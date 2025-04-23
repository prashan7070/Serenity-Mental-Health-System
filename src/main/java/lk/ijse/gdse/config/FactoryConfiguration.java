package lk.ijse.gdse.config;

import lk.ijse.gdse.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;

    private FactoryConfiguration(){

        Configuration configuration =  new Configuration();

        Properties properties = new Properties();
        try (InputStream inputStream = FactoryConfiguration.class.getClassLoader().getResourceAsStream("hibernate.properties")) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("hibernate.properties file not found in the classpath");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        configuration.setProperties(properties)
                .addAnnotatedClass(Patient.class)
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
