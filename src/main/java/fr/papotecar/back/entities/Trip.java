package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.HashMap;

public class Trip {

    @Id
    private String id;

    private City startCity;

    private City endCity;

    private Car car;

    private ArrayList<City> etapes;

    private ArrayList<Step> voyages;


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

    public City getEndCity() {
        return endCity;
    }

    public void setEndCity(City endCity) {
        this.endCity = endCity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Trip(String id, City startCity, City endCity, Car car) {
        this.id = id;
        this.startCity = startCity;
        this.endCity = endCity;
        this.car = car;
    }

    public void addCity(City cityStep) {
        this.etapes.add(cityStep);
    }

    public void addStep(Step step){
        this.voyages.add(step);
    }


    public String toString() {
        String res = " ";
        res = res + "Trajet de " + this.startCity.getName() + " à " + this.endCity.getName();
        res = res + "\nVéhicule " + this.car.getBrand() + " " + this.car.getModel() + " -- nb places : " + this.car.getNbPlaces();
        res = res + "\n----------Déroulement du parcours----------\n";
        res = res + "Départ : " + this.startCity.getName() + "\n";
        res = res + "Avant étape, Place Libre : " + car.getNbPlaces() + "/" + car.getNbPlaces();
        for (City c : this.etapes) {
            res = res + c + "\n";
            res = res + "--------------";
            res = res + "Avant étape, Place Libre" + car.getNbPlacesLibre() + "/" + car.getNbPlaces();
            for (Step step : this.voyages) {
                if (step.getStepCity().getName().compareTo(c.getName()) == 0) {
                    res = res + "Descente :" + step.getPassenger().getFirstName();
                    car.setNbPlacesLibre(car.getNbPlaces()+1);
                }
                if (step.getStartCity().getName().compareTo(c.getName()) == 0) {
                    res = res + "Après étape, Place Libre" + car.getNbPlacesLibre() + "/" + car.getNbPlaces();
                    car.setNbPlacesLibre(car.getNbPlaces()+1);
                }
            }
            res = res + "Arrivée" + this.endCity;
            res = res + "Après étape, Place Libre" + car.getNbPlacesLibre() + "/" + car.getNbPlaces();
        }
        return res;
    }
}
