package com.company;

public interface IGasstation {
    boolean checkFuel(Fuel fuelCar);
    int refuel(int toRefill);
    boolean checkLocation(Location location);
}
