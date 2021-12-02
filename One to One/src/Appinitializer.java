import entity.Passport;
import entity.Person;
import org.hibernate.PersistentObjectException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Appinitializer {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId("P001");
        person.setName("Amal");


        Passport passport = new Passport();
        passport.setId("pass01");
        passport.setCost(20000);
        person.setPassport(passport);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


         session.save(person);
         session.save(passport);



        transaction.commit();
        session.close();
    }
}
