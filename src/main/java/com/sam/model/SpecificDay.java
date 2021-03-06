package com.sam.model;

import java.time.LocalDate;

public class SpecificDay {

    private int personId;
    private LocalDate date;
    private boolean isFree;

    public SpecificDay(){}

    public SpecificDay(int personId, LocalDate date, boolean isFree) {
        this.personId = personId;
        this.date = date;
        this.isFree = isFree;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
