package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.model.TouristStatus;

public class ArrivalZone implements ParkZone {
    private double ticketPrice;

    public ArrivalZone(double price) { this.ticketPrice = price; }

    @Override
    public String getName() { return "Entrada del Parque"; }

    @Override
    public void simulateActivity(Tourist tourist) {
        System.out.println(tourist.getName() + " está comprando su boleto...");
        tourist.spend(ticketPrice); // El turista gasta dinero
        tourist.setStatus(TouristStatus.IN_PARK); // Cambia su estado
        System.out.println("¡Boleto vendido! " + tourist.getName() + " ahora está dentro del parque.");
    }
}