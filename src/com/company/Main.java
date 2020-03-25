package com.company;

public class Main {

    public static void main(String[] args) {
        OMV omv = new OMV();
        Agip agip = new Agip();
        Shell shell = new Shell();
        TeslaFastCharger teslaFastCharger = new TeslaFastCharger();

        Car tesla = new Car(Fuel.ELECTRICITY);
        Car laFerrari = new Car(Fuel.SUPER95);

        IGasstation[] gasstations = new IGasstation[4];
        gasstations[0] = omv;
        gasstations[1] = agip;
        gasstations[2] = shell;
        gasstations[3] = teslaFastCharger;


        for (int i = 0; i < gasstations.length; i++) {
            if (tesla.refuel(gasstations[i], 50, Location.DORNBIRN)) {
                System.out.println("Dein Tesla wurde aufgeladen!");
                break;
            }
        }

        for (int i = 0; i < gasstations.length; i++) {
            if (laFerrari.checkLocation(gasstations[i], Location.BREGENZ)) {
                if (laFerrari.refuel(gasstations[i], 80, Location.BREGENZ)) {
                    System.out.println("Dein Ferrari wurde voll getankt!");
                    break;
                } else {
                    System.out.println(gasstations[i] + " ist nicht in Bregenz!");
                }
            }
        }
    }
}