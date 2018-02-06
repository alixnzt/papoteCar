package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

public class Step {
    @Id
    private String id;

    private City startCity;

    private City stepCity;

    private User passenger;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public City getStartCity() {
        return startCity;
    }

    public void setStartCity(City startCity) {
        this.startCity = startCity;
    }

    public City getStepCity() {
        return stepCity;
    }

    public void setStepCity(City stepCity) {
        this.stepCity = stepCity;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }

    public Step(String id, City startCity, City stepCity, User passenger) {
        this.id = id;
        this.startCity = startCity;
        this.stepCity = stepCity;
        this.passenger = passenger;
    }
}
