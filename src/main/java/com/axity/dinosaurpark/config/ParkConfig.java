package com.axity.dinosaurpark.config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParkConfig {

    private static ParkConfig instance;
    private Properties properties;

    private ParkConfig() {
        properties = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("park.properties")) {
            if (input == null) {
                System.out.println("Lo siento, no pude encontrar park.properties");
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static ParkConfig getInstance() {
        if (instance == null) {
            instance = new ParkConfig();
        }
        return instance;
    }

    public String getString(String key) {
        return properties.getProperty(key);
    }

    public int getInt(String key) {
        return Integer.parseInt(properties.getProperty(key, "0"));
    }

    public double getDouble(String key) {
        return Double.parseDouble(properties.getProperty(key, "0.0"));
    }
}