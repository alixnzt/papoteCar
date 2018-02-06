package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {

    @Id
    private String id;

    private String LastName;

    private String firstName;

    //private List<Car> garage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /*public List<Car> getGarage() {
        return garage;
    }

    public void setGarage(List<Car> garage) {
        this.garage = garage;
    }*/

    public User(String id, String lastName, String firstName) {
        this.id = id;
        LastName = lastName;
        this.firstName = firstName;
    }
}
