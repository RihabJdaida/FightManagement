package com.ipssas.flight;

import com.ipssas.factory.IPerson;
import com.ipssas.factory.PersonCreator;
import com.ipssas.flight.*;
import com.ipssas.reservation.Passenger;
import com.ipssas.reservation.Reservation;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class FlightManagement {
    public static void main(String[] args) throws Exception {

        AirlineCompany airlineCompany = new AirlineCompany("American Airlines");

        LocalDate startDate = LocalDate.of(2019, 4, 11);
        LocalDate arrivalDate = LocalDate.of(2019, 4, 16);

        LocalTime startHour = LocalTime.of(18, 0);
        LocalTime arrivalHour = LocalTime.of(8, 0);

        Flight flight = airlineCompany.makeFlight(785, startDate, startHour, arrivalDate, arrivalHour, 250);

        Airport departureAirport = new Airport("JFK", new City("New York"));
        Airport arrivalAirport = new Airport("LAX", new City("Los Angeles"));
        flight.departureAirport = departureAirport;
        flight.arrivalAirport = arrivalAirport;

        Airport layoverAirportOne = new Airport("ATL", new City("Atlanta"));
        Airport layoverAirportTwo = new Airport("DEN", new City("Denver"));

        ArrayList<LayoverInformation> layoverInformationArrayList = new ArrayList<>();
        layoverInformationArrayList.add(new LayoverInformation(layoverAirportOne, LocalDate.of(2019, 4, 12), LocalDate.of(2019, 4, 13),flight));
        layoverInformationArrayList.add(new LayoverInformation(layoverAirportTwo, LocalDate.of(2019, 4, 14), LocalDate.of(2019, 4, 15),flight));

        IPerson client = PersonCreator.createPerson("com.ipssas.flight.Client.class");
        IPerson passenger = PersonCreator.createPerson("com.ipssas.reservation.Passenger.class");
        Client client1 = (Client) client;
        client1.setName("Rihab");
        client1.setLastName("jdaida");
        client1.setPhoneNumber(29780110);
        client1.setFaxNumber(74115970);
        client.makeReservation(new Reservation(LocalDate.of(2019, 4, 10), 21122003), (Passenger) passenger, flight);

    }
}
