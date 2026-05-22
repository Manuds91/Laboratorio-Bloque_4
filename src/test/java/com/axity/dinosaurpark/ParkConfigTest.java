package com.axity.dinosaurpark;

import com.axity.dinosaurpark.config.ParkConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkConfigTest {
    @Test
    void testSingletonInstance() {
        ParkConfig config1 = ParkConfig.getInstance();
        ParkConfig config2 = ParkConfig.getInstance();
        assertSame(config1, config2, "El Singleton debería devolver la misma instancia");
    }
    @Test
    void testReadProperty() {
        ParkConfig config = ParkConfig.getInstance();
        int tourists = config.getInt("tourists");
        assertEquals(50, tourists, "Debería leer 50 turistas del archivo properties");
    }
}