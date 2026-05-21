package com.axity.dinosaurpark;

import com.axity.dinosaurpark.config.ParkConfig;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la configuración
        ParkConfig config = ParkConfig.getInstance();

        // Probamos leyendo los datos que pusiste en el archivo park.properties
        System.out.println("--- PRUEBA DE CONFIGURACIÓN ---");
        System.out.println("Turistas configurados: " + config.getInt("tourists"));
        System.out.println("Precio boleto: $" + config.getDouble("arrival.ticketPrice"));
    }
}