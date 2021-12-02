package entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "subject")
public class Subject {
    @Id
    private String s_Id;
    private String subjectName;
    @ManyToMany
    private List<Lecturer> lecturers = new ArrayList<>();

    public Subject(String s_Id, String subjectName, List<Lecturer> lecturers) {
        this.s_Id = s_Id;
        this.subjectName = subjectName;
        this.setLecturers(lecturers);
    }





    public String getS_Id() {
        return s_Id;
    }

    public void setS_Id(String s_Id) {
        this.s_Id = s_Id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String s_Id, String subjectName) {
        this.s_Id = s_Id;
        this.subjectName = subjectName;
    }

    public Subject() {
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
