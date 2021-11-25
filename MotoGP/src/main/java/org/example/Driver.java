package org.example;

import java.util.Date;

public class Driver {

    private String name;
    private String firstname;
    private String birthday;
    Motorcycle moto_1;
    Motorcycle moto_2;

    public Driver(String name, String firstname, String birthday) {
        this.name = name;
        this.firstname = firstname;
        this.birthday = birthday;
    }

    public void setMotorcycles(Motorcycle moto_1, Motorcycle moto_2){
        this.moto_1 = moto_1;
        this.moto_2 = moto_2;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }


}
