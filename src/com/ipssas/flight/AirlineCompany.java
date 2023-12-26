package com.ipssas.flight;

import com.ipssas.enums.FlightStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class AirlineCompany {
    private String name;

    public AirlineCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight makeFlight (int number, LocalDate startDate, LocalTime startHour, LocalDate arrivalDate, LocalTime arrivalHour, int airplaneCapacity){
        return new Flight(number,
                startDate,
                startHour,
                arrivalDate,
                arrivalHour,
                airplaneCapacity);
    }
    public void closeFlight(Flight flight){
        flight.setFlightStatus(FlightStatus.CLOSED);
    }
}