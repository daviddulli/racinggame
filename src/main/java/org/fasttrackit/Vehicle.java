package org.fasttrackit;

public class Vehicle {


    //class variable
    static int totalCount;

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public Vehicle() {

        totalCount++;

    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelarating with " + speed + " for " + durationInHours + " h." );


        //distance is local variable (declared inside a method)
        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
        //traveledDistance += distance;
        System.out.println("Total travelled distance: " + traveledDistance);

        double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;

    }
}
