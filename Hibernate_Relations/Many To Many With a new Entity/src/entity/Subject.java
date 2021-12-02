package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    private String sub_Id;
    private String sub_name;
    @OneToMany(mappedBy = "subject")
    private Set<Subject_Lecturer> subject_lecturers = new HashSet<Subject_Lecturer>();

    public String getSub_Id() {
        return sub_Id;
    }

    public void setSub_Id(String sub_Id) {
        this.sub_Id = sub_Id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public Subject(String sub_Id, String sub_name) {
        this.sub_Id = sub_Id;
        this.sub_name = sub_name;
    }

    public Subject() {
    }

    public Set<Subject_Lecturer> getSubject_lecturers() {
        return subject_lecturers;
    }

    public void setSubject_lecturers(Set<Subject_Lecturer> subject_lecturers) {
        this.subject_lecturers = subject_lecturers;
    }

    public Subject(String sub_Id, String sub_name, Set<Subject_Lecturer> subject_lecturers) {
        this.sub_Id = sub_Id;
        this.sub_name = sub_name;
        this.subject_lecturers = subject_lecturers;
    }
}
