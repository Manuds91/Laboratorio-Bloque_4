package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

public class CentralHub implements ParkZone {
    @Override
    public String getName() { return "Centro de Visitantes (Souvenirs)"; }

    @Override
    public void simulateActivity(Tourist tourist) {
        double souvenirPrice = 15.0;
        System.out.println(tourist.getName() + " entró a la tienda de recuerdos.");
        tourist.spend(souvenirPrice);
        System.out.println(tourist.getName() + " compró una playera de dinosaurio por $" + souvenirPrice);
    }
}