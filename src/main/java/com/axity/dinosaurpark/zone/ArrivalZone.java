package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.model.TouristStatus;
import com.axity.dinosaurpark.persistence.PersistenceManager;

public class ArrivalZone implements ParkZone {
    private double ticketPrice;

    public ArrivalZone(double price) { this.ticketPrice = price; }

    @Override
    public String getName() { return "Entrada del Parque"; }

    @Override
    public void simulateActivity(Tourist tourist, PersistenceManager pm) {
        // Logica de negocio
        tourist.spend(ticketPrice);
        tourist.setStatus(TouristStatus.IN_PARK);

        // PERSISTENCIA
        pm.saveRevenue(new com.axity.dinosaurpark.persistence.RevenueRecord(
                "Boleto: " + tourist.getName(),
                ticketPrice,
                "2023-10-27"
        ));

        System.out.println("[Backend] Boleto vendido a " + tourist.getName());
    }}