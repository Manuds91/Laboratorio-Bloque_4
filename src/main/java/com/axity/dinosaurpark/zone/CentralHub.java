package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.persistence.PersistenceManager;

public class CentralHub implements ParkZone {
    @Override
    public String getName() { return "Centro de Visitantes (Souvenirs)"; }

    @Override
    public void simulateActivity(Tourist tourist, PersistenceManager pm) {
        double price = 15.0;
        tourist.spend(price);


        pm.saveRevenue(new com.axity.dinosaurpark.persistence.RevenueRecord(
                "Souvenir: " + tourist.getName(),
                price,
                "2023-10-27"
        ));

        System.out.println("[Backend] Souvenir vendido a " + tourist.getName());
    }}