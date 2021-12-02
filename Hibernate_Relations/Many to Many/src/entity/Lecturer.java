package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "lecturer")
public class Lecturer {
     @Id
     private String l_Id;
     private String l_name;
     @ManyToMany(mappedBy = "lecturers")
     private List <Subject> subjects = new ArrayList<>();


    public Lecturer(String l_Id, String l_name, List<Subject> subjects) {
        this.l_Id = l_Id;
        this.l_name = l_name;
        this.subjects = subjects;
    }



    public String getL_Id() {
        return l_Id;
    }

    public void setL_Id(String l_Id) {
        this.l_Id = l_Id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Lecturer(String l_Id, String l_name) {
        this.l_Id = l_Id;
        this.l_name = l_name;
    }

    public Lecturer() {
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "l_Id='" + l_Id + '\'' +
                ", l_name='" + l_name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
