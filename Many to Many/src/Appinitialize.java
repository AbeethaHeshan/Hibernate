import entity.Lecturer;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;

public class Appinitialize {
    public static void main(String[] args) throws IOException {
        Subject subject = new Subject();
        subject.setS_Id("S1");
        subject.setSubjectName("Java");

        Subject subject1 = new Subject();
        subject1.setS_Id("S2");
        subject1.setSubjectName("PHP");


        Lecturer lecturer = new Lecturer();
        lecturer.setL_Id("L1");
        lecturer.setL_name("Amal");

        subject.getLecturers().add(lecturer);
        subject1.getLecturers().add(lecturer);

        lecturer.getSubjects().add(subject);
        lecturer.getSubjects().add(subject1);

        
       Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

            session.save(subject);
            session.save(subject1);
            session.save(lecturer);

        transaction.commit();
        session.close();
    }
}
