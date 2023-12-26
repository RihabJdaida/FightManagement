package com.ipssas.flight;

import com.ipssas.enums.FlightStatus;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private int number;
    private LocalDate startDate;
    private LocalTime startHour;
    private LocalDate arrivalDate;
    private LocalTime arrivalHour;
    private int numberOfPassengers;
    private final int airplaneMaxCapacity;
    private FlightStatus flightStatus = FlightStatus.OPEN;
    public Airport departureAirport;
    public Airport arrivalAirport;
    public ArrayList<LayoverInformation> layoverInformationList;

    public Flight(int number, LocalDate startDate, LocalTime startHour, LocalDate arrivalDate, LocalTime arrivalHour, int airplaneMaxCapacity) {
        this.number = number;
        this.startDate = startDate;
        this.startHour = startHour;
        this.arrivalDate = arrivalDate;
        this.arrivalHour = arrivalHour;
        this.airplaneMaxCapacity = airplaneMaxCapacity;

    }

    public int getNumber() {
        return number;
    }

    protected void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    protected void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartHour() {
        return startHour;
    }

    protected void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    protected void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalHour() {
        return arrivalHour;
    }

    protected void setArrivalHour(LocalTime arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getAirplaneMaxCapacity() {
        return airplaneMaxCapacity;
    }

    public Duration getDuration() {
        Duration duration;
        duration = Duration.between(startDate.atTime(startHour),arrivalDate.atTime(arrivalHour));
        return duration;
    }

    public void departure() {
        System.out.println(departureAirport.getName());
    }

    public void arrival() {
        System.out.println(arrivalAirport.getName());
    }

    public void getLayoverInfo() {
        for (LayoverInformation layoverInformation : layoverInformationList) {
            System.out.println(layoverInformation.toString());
        }
    }

}

