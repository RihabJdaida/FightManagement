package com.ipssas.reservation;

import com.ipssas.factory.IPerson;
import com.ipssas.factory.Person;
import com.ipssas.flight.Flight;
import com.sun.istack.internal.NotNull;

public class Passenger extends Person implements IPerson {

    private Reservation reservation;

    public Passenger() {
    }

    protected Passenger(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }


    @Override
    public void makeReservation(Reservation reservation, @NotNull Passenger passenger, Flight flight) {

    }
}
