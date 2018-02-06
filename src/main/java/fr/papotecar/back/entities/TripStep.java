package fr.papotecar.back.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class TripStep {
    @Id
    private String id;

    private Date startDate;

    private Date endDate;
}
