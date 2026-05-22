package com.axity.dinosaurpark;import com.axity.dinosaurpark.config.ParkConfig;import com.axity.dinosaurpark.model.Tourist;import com.axity.dinosaurpark.persistence.PersistenceManager;import com.axity.dinosaurpark.simulation.SimulationEngine;import com.axity.dinosaurpark.zone.*;public class Main {

    public static void main(String[] args) {

        // 1. Inicializar herramientas base

        ParkConfig config = ParkConfig.getInstance();

        PersistenceManager pm = new PersistenceManager();

        SimulationEngine engine = new SimulationEngine(pm);



        // 2. Crear Zonas

        engine.addZone(new ArrivalZone(config.getDouble("arrival.ticketPrice")));
        engine.addZone(new CentralHub());
        engine.addZone(new PowerPlant());


        // 3. Crear Turistas (basado en la configuración de la fase 2)

        int cantidadTuristas = config.getInt("tourists");

        for (int i = 1; i <= cantidadTuristas; i++) {

            engine.addTourist(new Tourist(i, "Visitante_" + i));

        }



        // 4. ¡ARRANCAR MOTOR! (Simularemos 5 pasos de tiempo)

        engine.runSimulation(5);

    }

}