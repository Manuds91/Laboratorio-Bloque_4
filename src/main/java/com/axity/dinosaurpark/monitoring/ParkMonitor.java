package com.axity.dinosaurpark.monitoring;

public class ParkMonitor {

    //  estado actual de los habitantes
    public void showGeneralStatus(int activeTourists, int dinosaursInEnclosure, double energyLevel) {
        System.out.println("\n========================================");
        System.out.println("       ESTADO ACTUAL DEL PARQUE");
        System.out.println("========================================");
        System.out.println("Turistas en el parque: " + activeTourists);
        System.out.println("Dinosaurios controlados: " + dinosaursInEnclosure);
        System.out.println("Nivel de Energía: " + energyLevel + "%");
        System.out.println("========================================\n");
    }

    // reporte financiero final
    public void showFinancialReport(double totalIncome, double totalExpenses) {
        double balance = totalIncome - totalExpenses;
        System.out.println("\n****************************************");
        System.out.println("      REPORTE FINANCIERO FINAL");
        System.out.println("****************************************");
        System.out.println("Ingresos Totales:  $" + totalIncome);
        System.out.println("Gastos Operativos: $" + totalExpenses);
        System.out.println("----------------------------------------");
        System.out.println("BALANCE FINAL:     $" + balance);
        if (balance < 0) {
            System.out.println("ESTADO: El parque está operando en PÉRDIDA.");
        } else {
            System.out.println("ESTADO: El parque es RENTABLE.");
        }
        System.out.println("****************************************\n");
    }
}