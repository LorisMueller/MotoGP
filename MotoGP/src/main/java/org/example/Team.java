package org.example;

import java.util.Arrays;

public class Team {
    private String name;
    private String country;
    private String type;
    private Motorcycle[] motos;
    private Driver driver_1;
    private Driver driver_2;

    public Team(String name, String country, String type) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.motos = new Motorcycle[]{
                new Motorcycle("Yamaha", "YZR-M1", "99"),
                new Motorcycle("Ducati", "Desmosedici GP9", "3"),
                new Motorcycle("Yamaha", "YZR-E2", "44"),
                new Motorcycle("Ducati", "Desmosedici2 GP7", "101")
        };
    }

    //set Driver (to set drivers into a team)
    public void setDriver(Driver driver_1, Driver driver_2){

        this.driver_1 = driver_1;
        this.driver_2 = driver_2;

        driver_1.setMotorcycles(motos[0], motos[1]);
        driver_2.setMotorcycles(motos[2], motos[3]);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", motos=" + Arrays.toString(motos) +
                ", driver_1=" + driver_1 +
                ", driver_2=" + driver_2 +
                '}';
    }
}
