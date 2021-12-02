import entity.Lecturer;
import entity.Subject;
import entity.Subject_Lecturer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Appinitialize {
    public static void main(String[] args) {
      /*  User user = new User("tommy", "ymmot", "tommy@gmail.com");
        Group group = new Group("Coders");

        UserGroup userGroup = new UserGroup();
        userGroup.setGroup(group);
        userGroup.setUser(user);
        userGroup.setActivated(true);
        userGroup.setRegisteredDate(new Date());

        session.save(userGroup);*/



        Lecturer lecturer2 = new Lecturer("L002","Amal");
        Subject subject2 = new Subject("S001","PHPee");

        Subject_Lecturer subject_lecturer2 = new Subject_Lecturer();

        subject_lecturer2.setLecturer(lecturer2);
        subject_lecturer2.setSubject(subject2);

        //Additional Columns to the assosiate table
        subject_lecturer2.setDate("2021/12/3");
        subject_lecturer2.setDuration("8 am to 1 pm");




        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(subject_lecturer2);


        transaction.commit();
        session.close();


    }
}
