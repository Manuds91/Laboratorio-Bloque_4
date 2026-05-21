package com.axity.dinosaurpark.model;

public class Tourist {
    private int id;
    private String name;
    private TouristStatus status;
    private double moneySpent;

    public Tourist(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = TouristStatus.WAITING;
        this.moneySpent = 0.0;
    }
    public void spend(double amount) { this.moneySpent += amount; }
    public TouristStatus getStatus() { return status; }
    public void setStatus(TouristStatus status) { this.status = status; }
    public String getName() { return name; }
    public double getMoneySpent() { return moneySpent; }
}