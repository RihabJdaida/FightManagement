package com.ipssas.flight;

import com.ipssas.enums.FlightStatus;
import com.ipssas.enums.ReservationStatus;
import com.ipssas.factory.IPerson;
import com.ipssas.factory.Person;
import com.ipssas.reservation.Passenger;
import com.ipssas.reservation.Reservation;
import com.sun.istack.internal.NotNull;

public class Client extends Person implements IPerson {

    private int phoneNumber;
    private int faxNumber;

    public Client() {
    }

    public Client(String name, String lastName, int phoneNumber, int faxNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFaxNumber() {
        return faxNumber;
    }

    protected void setFaxNumber(int faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void cancelReservation(Reservation reservation){
        reservation.setReservationStatus(ReservationStatus.CANCELED);
    }
    @Override
    public void makeReservation(Reservation reservation, @NotNull Passenger passenger, Flight flight) {
        if (flight.getFlightStatus() == FlightStatus.OPEN) {
            if (flight.getNumberOfPassengers() >= flight.getAirplaneMaxCapacity()) {
                flight.setFlightStatus(FlightStatus.CLOSED);
            } else {
                reservation.setFlight(flight);
                passenger.setReservation(reservation);
                flight.setNumberOfPassengers(flight.getNumberOfPassengers() + 1);
            }
        }
    }
}

