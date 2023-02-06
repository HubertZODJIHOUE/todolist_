package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Items {
    private String nameOfItem;
    private String contenuOfItem ;
    private Date dateOfCreation;

    private LocalTime timeOfCreation;
    public Items(String nameOfItem, String contenuOfItem) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        this.nameOfItem = nameOfItem;
        this.contenuOfItem = contenuOfItem;
        this.timeOfCreation = localTime;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public String getContenuOfItem() {
        return contenuOfItem;
    }

    public void setContenuOfItem(String contenuOfItem) {
        this.contenuOfItem = contenuOfItem;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalTime getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(LocalTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public boolean contenuIsValid () {
        return this.contenuOfItem != null && this.contenuOfItem.length() <= 1000;
    }

}