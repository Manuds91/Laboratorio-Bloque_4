package com.axity.dinosaurpark;

import com.axity.dinosaurpark.monitoring.ParkMonitor;
import com.axity.dinosaurpark.persistence.ExpenseRecord;
import com.axity.dinosaurpark.persistence.RevenueRecord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonitoringAndPersistenceTest {

    @Test
    void testMonitorMethods() {
        ParkMonitor monitor = new ParkMonitor();
        assertNotNull(monitor);

        monitor.showGeneralStatus(50, 20, 98.0);
        monitor.showFinancialReport(1500.0, 500.0);
        monitor.showFinancialReport(200.0, 800.0); // Probamos también el escenario de pérdida
    }

    @Test
    void testPersistenceRecords() {
        RevenueRecord revenue = new RevenueRecord("Entrada", 25.0, "2026-05-21");
        ExpenseRecord expense = new ExpenseRecord("Mantenimiento", 100.0, "2026-05-21");

        assertEquals("Entrada", revenue.type());
        assertEquals(25.0, revenue.amount());
        assertEquals("Mantenimiento", expense.description());
        assertEquals(100.0, expense.amount());
    }
}