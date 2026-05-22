package com.axity.dinosaurpark.zone;

import com.axity.dinosaurpark.model.Tourist;
import com.axity.dinosaurpark.persistence.PersistenceManager;

public interface ParkZone {
    String getName();
    void simulateActivity(Tourist tourist, PersistenceManager pm);
}