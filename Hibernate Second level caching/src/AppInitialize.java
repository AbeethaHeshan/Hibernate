import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitialize {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Amal");
        customer.setAddress("Panadura");

        Session s1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = s1.beginTransaction();


        Customer c1 = s1.get(Customer.class, "C001");
        System.out.println(c1);

        Customer c2 = s1.get(Customer.class, "C001");
        System.out.println(c2);

        transaction.commit();
        s1.close();

        Session s2 = FactoryConfiguration.getInstance().getSession();
        Transaction t2 = s2.beginTransaction();

        Customer c3 = s2.get(Customer.class, "C001");
        System.out.println(c3);

        t2.commit();
        s1.close();

    }
}
