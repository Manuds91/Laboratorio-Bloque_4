package com.axity.dinosaurpark;

import com.axity.dinosaurpark.zone.ArrivalZone;
import com.axity.dinosaurpark.zone.CentralHub;
import com.axity.dinosaurpark.zone.PowerPlant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZoneTest {

    @Test
    void testZoneNames() {
        ArrivalZone arrival = new ArrivalZone(25.0);
        CentralHub hub = new CentralHub();
        PowerPlant plant = new PowerPlant();

        assertEquals("Entrada del Parque", arrival.getName());
        assertEquals("Centro de Visitantes (Souvenirs)", hub.getName());
        assertEquals("Planta de Energía", plant.getName());
    }
}