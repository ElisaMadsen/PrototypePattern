package com.example.prototypepattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestVehicle {

    @Test
    public void prototypeTest(){
        String color = "red";
        int km = 500;
        int km2 = 1000;
        ElectricVehicle electricVehicle = new ElectricVehicle(color);
        electricVehicle.setKm(km);
        ElectricVehicle electricVehicleCopy = (ElectricVehicle) electricVehicle.clone();
        electricVehicleCopy.setKm(km2);

        assertNotEquals(electricVehicle.getKm(), electricVehicleCopy.getKm());
        assertEquals(km2, electricVehicleCopy.getKm());
        assertEquals(electricVehicle.getColor(), electricVehicleCopy.getColor());
    }
}
