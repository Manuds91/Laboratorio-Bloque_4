package com.axity.dinosaurpark.model;

public abstract class Dinosaur {
    private int id;
    private String name;
    private DinosaurStatus status;

    public Dinosaur(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = DinosaurStatus.IN_ENCLOSURE;
    }

    public abstract String getDiet();
    public DinosaurStatus getStatus() { return status; }
    public void setStatus(DinosaurStatus status) { this.status = status; }
    public String getName() { return name; }
}