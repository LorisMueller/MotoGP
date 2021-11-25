package org.example;


import java.sql.SQLOutput;

public class MotoGP {

    public static void main(String[] args){


        System.out.println("MotoGP Implementation (Teams, Fahrer, Motorräder)");

        //Implementation Drivers
        Driver[] drivers = new Driver[]{
                new Driver("Rossi", "Valentino", "17/02/1979"),
                new Driver("Miller", "Jack", "18/01/1995"),
                new Driver("Quartararo", "Fabio", "20/04/1999"),
                new Driver("Marquez", "Alex", "23/04/1996")
        };

        Team TeamA = new Team (
                "Petronas Yamaha SRT","Malaysia","Werksteam"
        );

        Team TeamB = new Team(
                "Monster Energy Yamaha","Japan","Werksteam"
        );

        //Team to Driver
        TeamA.setDriver(drivers[0], drivers[1]);
        TeamB.setDriver(drivers[2], drivers[3]);

        System.out.println("2 Teams with 2 Drivers: ");
        System.out.println("First Team " + TeamA.toString());
        System.out.println("Second Team " + TeamB.toString());


    }

}
