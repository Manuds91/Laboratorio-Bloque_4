package com.axity.dinosaurpark.event;

import com.axity.dinosaurpark.persistence.PersistenceManager;

public class PowerOutageEvent implements SimulationEvent {
    @Override
    public String getName() { return "APAGÓN MASIVO"; }

    @Override
    public void execute(PersistenceManager pm) {
        String desc = "Las vallas eléctricas han fallado.";
        System.out.println("[EVENTO] " + desc);
        pm.logEvent(getName() + ": " + desc);
    }
}