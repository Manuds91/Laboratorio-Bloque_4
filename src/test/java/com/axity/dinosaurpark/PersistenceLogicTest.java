package com.axity.dinosaurpark;

import com.axity.dinosaurpark.persistence.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersistenceLogicTest {
    @Test
    void testFileWriting() {
        PersistenceManager pm = new PersistenceManager();
        assertDoesNotThrow(() -> {
            pm.saveRevenue(new RevenueRecord("Test", 10.0, "2023-01-01"));
            pm.saveExpense(new ExpenseRecord("Test Gasto", 5.0, "2023-01-01"));
            pm.logEvent("Test Evento");
        });
    }
}