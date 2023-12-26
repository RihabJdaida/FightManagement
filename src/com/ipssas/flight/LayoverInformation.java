package com.ipssas.flight;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class LayoverInformation {
    private Airport airport;
    private LocalDate departureHour;
    private LocalDate arrivalHour;
    private Flight flight;

    public LayoverInformation(Airport airport, LocalDate departureHour, LocalDate arrivalHour,Flight flight) {
        this.airport = airport;
        this.departureHour = departureHour;
        this.arrivalHour = arrivalHour;
        this.flight = flight ;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public LocalDate getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(LocalDate departureHour) {
        this.departureHour = departureHour;
    }

    public LocalDate getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(LocalDate arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public Duration getDuration() {
        Duration duration;
        duration = Duration.between(departureHour, arrivalHour);
        return duration;
    }

    @Override
    public String toString() {
        return "LayoverInformation{" +
                "airport=" + airport +
                ", departureHour=" + departureHour +
                ", arrivalHour=" + arrivalHour +
                '}';
    }
}