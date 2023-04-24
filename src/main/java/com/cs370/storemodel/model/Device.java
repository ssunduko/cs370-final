package com.cs370.storemodel.model;

/**
 * Abstract class representing Device in the Store
 *
 * @author Sergey L. Sundukovskiy
 * @version 1.0
 * @since 2021-09-27
 */
public abstract class Device {

    private Long id;
    private String name;
    private StoreLocation storeLocation;
    private String type;

    /**
     * Constructor for the Device class
     *
     * @param id
     * @param name
     * @param storeLocation
     * @param type
     */
    public Device(Long id, String name, StoreLocation storeLocation, String type) {
        this.id = id;
        this.name = name;
        this.storeLocation = storeLocation;
        this.type = type;
    }

    /**
     * Getter method for the Device id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for the Device id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for the Device name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the Device name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the Store location
     *
     * @return
     */
    public StoreLocation getStoreLocation() {
        return storeLocation;
    }

    /**
     * Setter method for the Store location
     *
     * @param storeLocation
     */
    public void setStoreLocation(StoreLocation storeLocation) {
        this.storeLocation = storeLocation;
    }

    /**
     * Getter method for the Device type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for the Device type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Abstract method that gets implemented by Sensor or Appliance devices
     *
     * @param event
     */
    public abstract void processEvent(String event);

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", storeLocation=" + storeLocation +
                ", type='" + type + '\'' +
                '}';
    }
}
