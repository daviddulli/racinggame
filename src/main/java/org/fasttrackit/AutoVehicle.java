package org.fasttrackit;

public class AutoVehicle extends Vehicle{

    //has-a relationship
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.setEngine(engine);
        System.out.println("Creating an autovehicle...");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
