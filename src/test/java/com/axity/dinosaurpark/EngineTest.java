package com.axity.dinosaurpark;

import com.axity.dinosaurpark.persistence.PersistenceManager;
import com.axity.dinosaurpark.simulation.SimulationEngine;
import com.axity.dinosaurpark.zone.ArrivalZone;
import com.axity.dinosaurpark.model.Tourist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EngineTest {
    @Test
    void testEngineRun() {
        PersistenceManager pm = new PersistenceManager();
        SimulationEngine engine = new SimulationEngine(pm);
        engine.addZone(new ArrivalZone(25.0));
        engine.addTourist(new Tourist(1, "Test"));
        assertDoesNotThrow(() -> engine.runSimulation(1));
    }
}