package com.axity.dinosaurpark.model;

public class CarnivoreDinosaur extends Dinosaur {
    public CarnivoreDinosaur(int id, String name) { super(id, name); }

    @Override
    public String getDiet() { return "Carne"; }
}