package com.axity.dinosaurpark;

import com.axity.dinosaurpark.event.*;
import com.axity.dinosaurpark.persistence.PersistenceManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventStrategyTest {
    @Test
    void testEventsExecution() {
        PersistenceManager pm = new PersistenceManager();
        SimulationEvent escape = new DinosaurEscapeEvent();
        SimulationEvent power = new PowerOutageEvent();
        assertEquals("¡SE ESCAPÓ UN DINOSAURIO!", escape.getName());
        assertEquals("APAGÓN MASIVO", power.getName());
        assertDoesNotThrow(() -> escape.execute(pm));
        assertDoesNotThrow(() -> power.execute(pm));
    }
}