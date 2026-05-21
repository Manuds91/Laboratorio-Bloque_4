package com.axity.dinosaurpark;

import com.axity.dinosaurpark.model.CarnivoreDinosaur;
import com.axity.dinosaurpark.model.Dinosaur;
import com.axity.dinosaurpark.model.Tourist;

public class Main {

    // quitamos el 1 para que vuelva a ser el punto de arranque oficial
    public static void main(String[] args) {
        Tourist t = new Tourist(1, "Grace");
        Dinosaur d = new CarnivoreDinosaur(1, "T-Rex");

        System.out.println("Turista: " + t.getName() + " Estado: " + t.getStatus());
        System.out.println("Dino: " + d.getName() + " Come: " + d.getDiet());
    }

}