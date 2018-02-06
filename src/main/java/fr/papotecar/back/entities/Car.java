package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

public class Car {

    @Id
    private String id;

    private String brand;

    private String model;

    private String registration;

    private Integer nbPlaces;

    private Integer nbPlacesLibre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Integer getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(Integer nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public Integer getNbPlacesLibre() {
        return nbPlacesLibre;
    }

    public void setNbPlacesLibre(Integer nbPlacesLibre) {
        this.nbPlacesLibre = nbPlacesLibre;
    }

    public Car(String id, String brand, String model, String registration, Integer nbPlaces, Integer nbPlacesLibre) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registration = registration;
        this.nbPlaces = nbPlaces;
        this.nbPlacesLibre = nbPlacesLibre;
    }

    public String toString() {
        return this.brand + this.model + " - " + this.nbPlaces;
    }
}
