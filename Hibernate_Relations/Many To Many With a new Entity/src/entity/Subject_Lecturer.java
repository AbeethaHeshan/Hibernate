package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Subject_Lecturer implements Serializable {

    @Id
    @GeneratedValue
    private Long  id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lec_Id")
    private Lecturer lecturer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_Id")
    private Subject subject;

    // additional fields
    private String duration;
    private String date;

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public Subject_Lecturer() {
    }


    public Subject_Lecturer( Lecturer lecturer, Subject subject, String duration, String date) {

        this.lecturer = lecturer;
        this.subject = subject;
        this.duration = duration;
        this.date = date;
    }
}
