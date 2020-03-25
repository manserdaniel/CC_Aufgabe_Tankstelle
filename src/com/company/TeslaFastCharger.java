package com.company;

public class TeslaFastCharger implements IGasstation{

    Fuel fuel = Fuel.ELECTRICITY;
    String name = "Tesla Fast Charger";

    Location location = Location.BREGENZ;


    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean checkFuel(Fuel fuelCar) {
        return fuelCar == fuel;
    }

    @Override
    public int refuel(int toRefill) {
        return toRefill;
    }

    @Override
    public boolean checkLocation(Location location) {
        if (location == this.location) {
            return true;
        }
        return false;
    }
}
