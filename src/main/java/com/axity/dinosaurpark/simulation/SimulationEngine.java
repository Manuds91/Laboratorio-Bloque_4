package com.axity.dinosaurpark.simulation;

import com.axity.dinosaurpark.event.*;
import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.persistence.PersistenceManager;
import com.axity.dinosaurpark.zone.ParkZone;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationEngine {
    private double totalIncome = 0;
    private double totalExpenses = 0;
    private double currentEnergy = 100.0;
    private PersistenceManager pm;
    private List<Tourist> tourists;
    private List<ParkZone> zones;
    private List<SimulationEvent> possibleEvents;
    private Random random;

    public SimulationEngine(PersistenceManager pm) {
        this.pm = pm;
        this.tourists = new ArrayList<>();
        this.zones = new ArrayList<>();
        this.possibleEvents = new ArrayList<>();
        this.random = new Random();

        //eventos
        possibleEvents.add(new DinosaurEscapeEvent());
        possibleEvents.add(new PowerOutageEvent());
    }

     // agregar zonas
    public void addZone(ParkZone zone) {
        zones.add(zone);
    }

    //gregar turistas
    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
    }

    //bucle de simulacion
    public void runSimulation(int totalSteps) {
        System.out.println("=== INICIANDO OPERACIONES EN EL PARQUE ===");

        for (int i = 1; i <= totalSteps; i++) {
            System.out.println("\n--- PASO DE SIMULACIÓN " + i + " ---");

            //  turistas por las zonas
            for (Tourist t : tourists) {
                int zoneIdx = random.nextInt(zones.size());
                ParkZone currentZone = zones.get(zoneIdx);

                //guardamos el dinero
                double moneyBefore = t.getMoneySpent();

                currentZone.simulateActivity(t, pm);

                //calcula cuanto gasto en esa zona y lo se suma a ingresos
                double spentInZone = t.getMoneySpent() - moneyBefore;
                totalIncome += spentInZone;

                //si la zona es la planta de energía, restamos energía y suma gastos
                if (currentZone instanceof com.axity.dinosaurpark.zone.PowerPlant) {
                    totalExpenses += 100.0;
                    currentEnergy -= 2.0;
                }
            }

            //probabilidad de que ocurra un evento aleatorio
            if (random.nextDouble() < 0.20) {
                int eventIdx = random.nextInt(possibleEvents.size());
                possibleEvents.get(eventIdx).execute(pm);
            }
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        com.axity.dinosaurpark.monitoring.ParkMonitor monitor = new com.axity.dinosaurpark.monitoring.ParkMonitor();

        int dinosCount = 20;

        monitor.showGeneralStatus(tourists.size(), dinosCount, currentEnergy);
        monitor.showFinancialReport(totalIncome, totalExpenses);
        System.out.println("\n=== SIMULACION COMPLETADA ===");
    }
}