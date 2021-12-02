package util;


import entity.Lecturer;
import entity.Subject;
import entity.Subject_Lecturer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryConfiguration {
      private static FactoryConfiguration factoryConfiguration;
      private SessionFactory sessionFactory;

      private FactoryConfiguration(){
          Configuration configuration = new Configuration().configure()
                  .addAnnotatedClass(Lecturer.class)
                  .addAnnotatedClass(Subject.class)
                  .addAnnotatedClass(Subject_Lecturer.class);
          sessionFactory = configuration.buildSessionFactory();

      }

      public static FactoryConfiguration getInstance(){
          return factoryConfiguration == null ? factoryConfiguration= new FactoryConfiguration() : factoryConfiguration;
      }

      public Session getSession(){
           return sessionFactory.openSession();
      }
}
