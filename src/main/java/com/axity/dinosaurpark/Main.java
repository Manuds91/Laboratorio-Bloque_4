package com.axity.dinosaurpark;import com.axity.dinosaurpark.config.ParkConfig;import com.axity.dinosaurpark.model.Tourist;import com.axity.dinosaurpark.persistence.PersistenceManager;import com.axity.dinosaurpark.simulation.SimulationEngine;import com.axity.dinosaurpark.zone.*;public class Main {

    public static void main(String[] args) {

        // Inicializar herramientas

        ParkConfig config = ParkConfig.getInstance();

        PersistenceManager pm = new PersistenceManager();

        SimulationEngine engine = new SimulationEngine(pm);



        // Crear Zonas

        engine.addZone(new ArrivalZone(config.getDouble("arrival.ticketPrice")));
        engine.addZone(new CentralHub());
        engine.addZone(new PowerPlant());


        //  Crear Turistas

        int cantidadTuristas = config.getInt("tourists");

        for (int i = 1; i <= cantidadTuristas; i++) {

            engine.addTourist(new Tourist(i, "Visitante_" + i));

        }



        // arrancar simulación

        engine.runSimulation(5);

    }

}