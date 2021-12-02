package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
    @Id
    private String id;
    private double  cost;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Passport(String id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public Passport() {
    }
}
