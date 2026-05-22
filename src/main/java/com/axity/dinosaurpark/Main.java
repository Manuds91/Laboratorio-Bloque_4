package com.axity.dinosaurpark;

import com.axity.dinosaurpark.event.SimulationEvent;
import com.axity.dinosaurpark.event.DinosaurEscapeEvent;
import com.axity.dinosaurpark.event.PowerOutageEvent;

import com.axity.dinosaurpark.persistence.PersistenceManager;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PersistenceManager pm = new PersistenceManager();
        Random random = new Random();

        SimulationEvent[] eventosPosibles = {
                new DinosaurEscapeEvent(),
                new PowerOutageEvent()
        };

        System.out.println("---  INICIANDO MONITOREO ---");

        int indiceAleatorio = random.nextInt(eventosPosibles.length);
        SimulationEvent eventoOcurrido = eventosPosibles[indiceAleatorio];

        System.out.println("\n>Alerta de seguridad:");
        eventoOcurrido.execute(pm);

        System.out.println("\n--- EL EVENTO HA SIDO REGISTRADO EN EVENTOS.CSV ---");
    }

}