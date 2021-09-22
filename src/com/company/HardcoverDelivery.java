package com.company;

public class HardcoverDelivery extends OfflineDelivery {

    @Override
    void getDeliveryLocations() {
        System.out.println("Location is within only Hyderbad");
    }
}
