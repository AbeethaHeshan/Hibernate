package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Lecturer {
    @Id
    private String lec_Id;
    private String lec_Name;
    @OneToMany(mappedBy = "lecturer")
    private Set<Subject_Lecturer> subject_lecturers = new HashSet<Subject_Lecturer>();


    public String getLec_Name() {
        return lec_Name;
    }

    public void setLec_Name(String lec_Name) {
        this.lec_Name = lec_Name;
    }


    public Lecturer() {
    }

    public String getLec_Id() {
        return lec_Id;
    }

    public void setLec_Id(String lec_Id) {
        this.lec_Id = lec_Id;
    }

    public Lecturer(String lec_Id, String lec_Name) {
        this.lec_Id = lec_Id;
        this.lec_Name = lec_Name;
    }

    public Set<Subject_Lecturer> getSubject_lecturers() {
        return subject_lecturers;
    }

    public void setSubject_lecturers(Set<Subject_Lecturer> subject_lecturers) {
        this.subject_lecturers = subject_lecturers;
    }

    public Lecturer(String lec_Id, String lec_Name, Set<Subject_Lecturer> subject_lecturers) {
        this.lec_Id = lec_Id;
        this.lec_Name = lec_Name;
        this.subject_lecturers = subject_lecturers;
    }
}
