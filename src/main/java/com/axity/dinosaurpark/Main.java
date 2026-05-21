package com.axity.dinosaurpark;

// Imports de la configuración y modelos
import com.axity.dinosaurpark.config.ParkConfig;
import com.axity.dinosaurpark.model.Tourist;

// Imports de las zonas que acabas de crear
import com.axity.dinosaurpark.zone.ArrivalZone;
import com.axity.dinosaurpark.zone.CentralHub;
import com.axity.dinosaurpark.zone.ParkZone;
public class Main {

public static void main(String[] args) {

    double precioBoleto = ParkConfig.getInstance().getDouble("arrival.ticketPrice");

    Tourist t = new Tourist(101, "Malcolm");
    ParkZone entrada = new ArrivalZone(precioBoleto);
    ParkZone tienda = new CentralHub();

    System.out.println("--- INICIO DE SIMULACIÓN DE ZONAS ---");
    entrada.simulateActivity(t);
    System.out.println("-------------------------------------");
    tienda.simulateActivity(t);

    System.out.println("\nResumen de " + t.getName() + ":");
    System.out.println("Estado final: " + t.getStatus());
    System.out.println("Total gastado: $" + t.getMoneySpent());
}
}