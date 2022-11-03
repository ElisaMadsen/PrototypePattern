package com.example.prototypepattern;

public class ElectricVehicle extends Vehicle{
    private String color;
    private int km;
    public ElectricVehicle(String color) { this.color = color; }
    public ElectricVehicle() {}
    @Override
    public Vehicle clone() {
        ElectricVehicle electricVehicleClone = new ElectricVehicle(this.color);
        electricVehicleClone.setKm(this.km);
        return electricVehicleClone;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {this.color = color;    }
    public int getKm() {  return km;    }
    public void setKm(int km) {this.km = km; }
}
