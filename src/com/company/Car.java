package com.company;

public class Car {

    Fuel fuel;

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }


    public boolean refuel(IGasstation gasstation, int toRefuel, Location location) {

            if (gasstation.checkFuel(fuel)) {

                System.out.println("Es wurden " + gasstation.refuel(toRefuel) + " " + fuel.name() + " bei " + gasstation + " getankt!");
                return true;
            }

        return false;
    }
    public boolean checkLocation(IGasstation gasstation, Location location) {
        if (gasstation.checkLocation(location)) {
            return true;
        } else {
            return false;
        }
    }
}
