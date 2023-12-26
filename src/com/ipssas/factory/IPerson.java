package com.ipssas.factory;

import com.ipssas.flight.Flight;
import com.ipssas.reservation.Passenger;
import com.ipssas.reservation.Reservation;
import com.sun.istack.internal.NotNull;

public interface IPerson {
    void makeReservation(Reservation reservation, @NotNull Passenger passenger, Flight flight);
}
