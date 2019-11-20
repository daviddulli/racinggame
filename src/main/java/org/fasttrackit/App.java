package org.fasttrackit;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        Engine car2Engine = new Engine();
        car2Engine.manufacturer = "Bavaria Motors";
        car2Engine.capacity = 2;


        Car carReference = new Car(carEngine);
        carReference.name = "Dacia";
        carReference.color = "Red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount = 2;
        carReference.traveledDistance = 50;



        System.out.println("Engine details...");
        System.out.println("Manufacturer " + carReference.engine.manufacturer);
        System.out.println("Capacity " + carReference.engine.capacity);

        Car carReference2 = new Car(car2Engine);
        carReference2.name = "BMW";
        carReference2.mileage = 14;
        carReference2.color = null;


        //concatenare - concatenation
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.running);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.traveledDistance);

        System.out.println("Second car name: " + carReference2.name);
        System.out.println(carReference2.mileage);
        System.out.println(carReference2.maxSpeed);
        System.out.println(carReference2.fuelLevel);
        System.out.println(carReference2.running);
        System.out.println(carReference2.doorCount);
        System.out.println(carReference2.traveledDistance);

        double accelerationDistance = carReference.accelerate(60, 1);
        System.out.println("Acceleration distance: " + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);
        System.out.println("Total traveled distance after repair: " + carReference.traveledDistance);




        carReference2.name = "Audi";
        System.out.println(carReference2.name);

        Car car3 = carReference2;
        car3.name = "VW";
        System.out.println(car3.name);
        System.out.println(carReference2.name);

//        System.out.println("Modulo example: ");
//        System.out.println(4 % 2 == 0);
//        System.out.println(4 % 3);



    }

}
