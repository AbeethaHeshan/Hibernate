package util;

import entity.Owner;
import entity.Pet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() throws IOException {
        Properties properties = new Properties();
        properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("./hibernate.properties"));
        Configuration configuration = new Configuration().setProperties(properties)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class);
        sessionFactory = configuration.buildSessionFactory();
    }
     public  static FactoryConfiguration getInstance() throws IOException {
          return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
     }

     public Session getSession(){
        return sessionFactory.openSession();
     }

}
