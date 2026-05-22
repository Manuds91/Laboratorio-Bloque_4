package com.axity.dinosaurpark;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.model.TouristStatus;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TouristTest {
    @Test
    void testSpendMoney() {
        Tourist t = new Tourist(1, "Alan");
        t.spend(50.0);
        t.spend(25.0);
        assertEquals(75.0, t.getMoneySpent(), "El dinero gastado debería ser 75.0");
    }

    @Test
    void testStatusChange() {
        Tourist t = new Tourist(1, "Alan");
        assertEquals(TouristStatus.WAITING, t.getStatus());
        t.setStatus(TouristStatus.IN_PARK);
        assertEquals(TouristStatus.IN_PARK, t.getStatus());
    }
}