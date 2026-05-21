package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;

public interface ParkZone {
    String getName();
    void simulateActivity(Tourist tourist);
}