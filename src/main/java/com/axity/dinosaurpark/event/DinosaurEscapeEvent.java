package com.axity.dinosaurpark.event;

import com.axity.dinosaurpark.persistence.PersistenceManager;

public class DinosaurEscapeEvent implements SimulationEvent {
    @Override
    public String getName() { return "¡SE ESCAPÓ UN DINOSAURIO!"; }

    @Override
    public void execute(PersistenceManager pm) {
        String desc = "ALERTA: Un Velociraptor escapó de su jaula.";
        System.out.println("[EVENTO] " + desc);
        pm.logEvent(getName() + ": " + desc);
    }
}