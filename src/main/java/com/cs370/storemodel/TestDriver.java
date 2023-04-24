package com.cs370.storemodel;

import com.cs370.storemodel.service.StoreModelService;


public class TestDriver {
    public static void main(String[] args) {

        StoreModelService storeModelService = StoreModelService.getInstance();
        storeModelService.processCommandFile(args[0]);
    }
}
