package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

public class City {

    @Id
    private String id;

    private String name;

    private Integer postalCode;

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

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public City(String id, String name, Integer postalCode) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
    }
}
