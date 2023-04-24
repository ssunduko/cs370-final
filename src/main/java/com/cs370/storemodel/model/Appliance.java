package com.cs370.storemodel.model;

/**
 * Appliance class implementation representing Appliance Device in the Store
 *
 * @author Sergey L. Sundukovskiy
 * @version 1.0
 * @since 2021-09-27
 */
public class Appliance extends Device {

    /**
     * Constructor for Appliance class
     *
     * @param id
     * @param name
     * @param storeLocation
     * @param type
     */
    public Appliance(Long id, String name, StoreLocation storeLocation, String type) {
        super(id, name, storeLocation, type);
    }

    /**
     * Appliance specific event processing
     */
    @Override
    public void processEvent(String event) {
        System.out.println("Processing Event : " + event);
    }

    /**
     * This is a placeholder for the processing commands
     *
     * @param command
     */
    public void processCommand(String command) {
        System.out.println("<<< " + "Processing Command : " + command);
    }
}
