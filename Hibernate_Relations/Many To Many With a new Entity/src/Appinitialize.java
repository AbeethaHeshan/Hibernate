import entity.Lecturer;
import entity.Subject;
import entity.Subject_Lecturer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Appinitialize {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("L002","Amal");
        Subject subject = new Subject("S003","PHP");

        Subject_Lecturer subject_lecturer = new Subject_Lecturer();


        //Additional Columns to the associate table
        subject_lecturer.setDate("2021/12/3");
        subject_lecturer.setDuration("8 am to 1 pm");

        subject_lecturer.setLecturer(lecturer);
        subject_lecturer.setSubject(subject);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(subject_lecturer);


        transaction.commit();
        session.close();




    }
}
