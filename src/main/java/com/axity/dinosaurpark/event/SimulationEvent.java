package com.axity.dinosaurpark.event;

import com.axity.dinosaurpark.persistence.PersistenceManager;

public interface SimulationEvent {
    String getName();
    void execute(PersistenceManager pm);
}