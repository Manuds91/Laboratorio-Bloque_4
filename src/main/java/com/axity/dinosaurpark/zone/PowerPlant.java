package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.persistence.ExpenseRecord;
import com.axity.dinosaurpark.persistence.PersistenceManager;

public class PowerPlant implements ParkZone {
    @Override
    public String getName() { return "Planta de Energía"; }

    @Override
    public void simulateActivity(Tourist tourist, PersistenceManager pm) {
        // La planta no atiende turistas, pero cada vez que se "usa", genera un gasto de luz
        double costoEnergia = 100.0;
        pm.saveExpense(new ExpenseRecord("Consumo de Electricidad", costoEnergia, "2023-10-27"));
        System.out.println("Gasto de energía: $" + costoEnergia);
    }
}