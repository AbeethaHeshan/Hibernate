package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "owner")
public class Owner {
    @Id
    @Column(name = "ownerId")
    private String id;
    @Column(name ="ownerName")
    private String name;
    @OneToMany(mappedBy = "owner")
    List<Pet> petList = new ArrayList<>();


    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public Owner(String id, String name, List<Pet> petList) {
        this.id = id;
        this.name = name;
        this.petList = petList;
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

    public Owner(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Owner() {
    }
}
