package com.example.prototypepattern;

public class BenzinVehicle extends Vehicle {

    private String color;
    private int km;
    public BenzinVehicle(String color) {  this.color = color;    }
    public BenzinVehicle() {    }

    @Override
    public Vehicle clone() {
        BenzinVehicle benzinVehicle = new BenzinVehicle(this.color);
        benzinVehicle.setKm(this.km);
        return benzinVehicle;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getKm() { return km;}
    public void setKm(int km) {this.km = km; }
}
