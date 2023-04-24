package com.cs370.storemodel.model;

/**
 * Sensor class implementation representing Sensor Device in the Store
 *
 * @author Sergey L. Sundukovskiy
 * @version 1.0
 * @since 2021-09-27
 */
public class Sensor extends Device {

    /**
     * Constructor for Sensor class
     *
     * @param id
     * @param name
     * @param storeLocation
     * @param type
     */
    public Sensor(Long id, String name, StoreLocation storeLocation, String type) {
        super(id, name, storeLocation, type);
    }

    @Override
    /**
     * Sensor specific event processing
     */
    public void processEvent(String event) {
        System.out.println("<<< " + "Processing Event : " + event);
    }
}