package org.fasttrackit;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Welcome to the Racing Game!" );
        //method implementation taken from object's class, not from variable's class
        Game game = new Game();
        game.start();

//        Vehicle joker = new JokerVehicle();
//        joker.setName("Joker");
//        joker.setMileage(80);
//
//        joker.accelerate(60, 1);
//        System.out.println("Jokers total distance: " + joker.getTraveledDistance());
//
//        // variable's class determines what methodes can be invoked
//        //type casting
//        ((JokerVehicle) joker).fly();
//
//        Engine carEngine = new Engine();
//        carEngine.manufacturer = "Renault";
//        carEngine.capacity = 1.5;
//
//        Engine car2Engine = new Engine();
//        car2Engine.manufacturer = "Bavaria Motors";
//        car2Engine.capacity = 2;
//
//
//        Car carReference = new Car(carEngine);
//        carReference.setName("Dacia");
//        carReference.setColor("Red");
//        carReference.setMileage(9.8);
//        carReference.setFuelLevel(60);
//        carReference.setMaxSpeed(200);
//        carReference.setRunning(false);
//        carReference.setDoorCount(2);
//        carReference.setTraveledDistance(50);
//
//
//
//        System.out.println("Engine details...");
//        System.out.println("Manufacturer " + carReference.getEngine().manufacturer);
//        System.out.println("Capacity " + carReference.getEngine().capacity);
//
//        Car carReference2 = new Car(car2Engine);
//        carReference2.setName("BMW");
//        carReference2.setMileage(14);
//        carReference2.setColor(null);
//
//
//        //concatenare - concatenation
//        System.out.println("First car name: " + carReference.getName());
//        System.out.println(carReference.getColor());
//        System.out.println(carReference.getMileage());
//        System.out.println(carReference.getMaxSpeed());
//        System.out.println(carReference.getFuelLevel());
//        System.out.println(carReference.isRunning());
//        System.out.println(carReference.getDoorCount());
//        System.out.println(carReference.getTraveledDistance());
//
//        System.out.println("Second car name: " + carReference2.getName());
//        System.out.println(carReference2.getMileage());
//        System.out.println(carReference2.getMaxSpeed());
//        System.out.println(carReference2.getFuelLevel());
//        System.out.println(carReference2.isRunning());
//        System.out.println(carReference2.getDoorCount());
//        System.out.println(carReference2.getTraveledDistance());
//
//        double accelerationDistance = carReference.accelerate(60, 1);
//        System.out.println("Acceleration distance: " + accelerationDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repairVehicle(carReference);
//        System.out.println("Total traveled distance after repair: " + carReference.getTraveledDistance());
//
//
//
//
//        carReference2.setName("Audi");
//        System.out.println(carReference2.getName());
//
//        Car car3 = carReference2;
//        car3.setName("VW");
//        System.out.println(car3.getName());
//        System.out.println(carReference2.getName());
//
////        System.out.println("Modulo example: ");
////        System.out.println(4 % 2 == 0);
////        System.out.println(4 % 3);
//
//        System.out.println("Studying class variables(static variables)");
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalCount = 10;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.totalCount = 20;
//
//        Vehicle.totalCount = 30;
//
//        System.out.println("Total vehicle count from vehicle1: " + vehicle1.totalCount);
//        System.out.println("Total vehicle count from vehicle2: " + vehicle2.totalCount);
//        System.out.println("Total vehicle count from Vehicle: " + Vehicle.totalCount);



    }

}
