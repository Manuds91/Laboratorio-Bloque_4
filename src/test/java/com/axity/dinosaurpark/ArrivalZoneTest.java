package com.axity.dinosaurpark;

import com.axity.dinosaurpark.config.ParkConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrivalZoneTest {
    @Test
    void testZoneName() {
        com.axity.dinosaurpark.zone.ArrivalZone zone = new com.axity.dinosaurpark.zone.ArrivalZone(25.0);
        assertEquals("Entrada del Parque", zone.getName());
    }
}