package com.axity.dinosaurpark.model;

public class HerbivoreDinosaur extends Dinosaur {
    public HerbivoreDinosaur(int id, String name) { super(id, name); }

    @Override
    public String getDiet() { return "Plantas"; }
}