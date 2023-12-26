package com.ipssas.reservation;

import com.ipssas.enums.ReservationStatus;
import com.ipssas.flight.Flight;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    private LocalDate date;
    private int number;
    private Flight flight;
    private ReservationStatus reservationStatus ;
    public Reservation(LocalDate date, int number) {
        this.date = date;
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}

