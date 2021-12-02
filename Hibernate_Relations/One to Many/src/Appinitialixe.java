import entity.Owner;
import entity.Pet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;

public class Appinitialixe {
    public static void main(String[] args) throws IOException {


        Owner owner = new Owner();
        owner.setId("O001");
        owner.setName("Amal");

        Pet   pet1 = new Pet();
        pet1.setId("P001");
        pet1.setName("Cat");

        Pet pet2 = new Pet();
        pet2.setId("P002");
        pet2.setName("Dog");


        owner.getPetList().add(pet1);
        owner.getPetList().add(pet2);

        pet1.setOwner(owner);
        pet2.setOwner(owner);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

            session.save(owner);
            session.save(pet1);
            session.save(pet2);

        transaction.commit();
        session.close();
    }
}
