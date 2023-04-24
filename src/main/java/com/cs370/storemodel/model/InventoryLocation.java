package com.cs370.storemodel.model;

public class InventoryLocation extends StoreLocation {

    private Long shelfId;

    public InventoryLocation(Long storeId, Long aisleId, Long shelfId) {
        super(storeId, aisleId);
        this.shelfId = shelfId;
    }

    public Long getShelfId() {
        return shelfId;
    }

    public void setShelfId(Long shelfId) {
        this.shelfId = shelfId;
    }

    @Override
    public String toString() {
        return "InventoryLocation{" +
                "storeLocation='" + super.toString() + '\'' +
                ", shelfId='" + shelfId + '\'' +
                '}';
    }
}
