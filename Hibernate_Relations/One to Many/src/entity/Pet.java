package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "pet")
public class Pet {
    @Id
    @Column(name = "petId")
    private
    String id;
    @Column(name = "petName")
    private
    String name;
    @ManyToOne
    private Owner owner;

    public Pet(String id, String name, Owner owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pet() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
