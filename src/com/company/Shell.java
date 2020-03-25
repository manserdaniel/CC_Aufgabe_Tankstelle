package com.company;

public class Shell implements IGasstation {

    Fuel[] fuel = {
            Fuel.DIESEL,
            Fuel.ELECTRICITY};

    Location location = Location.BREGENZ;

    String name = "Shell";

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean checkFuel(Fuel fuelCar) {
        for (Fuel fuel : fuel) {
            if (fuelCar == fuel) {
                return true;
            }
        }
        return false;
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
