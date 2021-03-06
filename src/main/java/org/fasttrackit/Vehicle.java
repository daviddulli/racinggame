package org.fasttrackit;

public class Vehicle {


    //class variable
    static int totalCount;

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {

        totalCount++;

    }

    // method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;

        System.out.println(getName() + " is accelerating with "
                + speed + " for " + durationInHours + "h.");

        if (speed > getMaxSpeed()) {
            System.out.println("Sorry. Maximum speed exceeded.");
            return 0;
        } else if (speed == getMaxSpeed()) {
            System.out.println("Careful! Max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        if (getFuelLevel() <= 0) {
            System.out.println("You don't have enough fuel.");
            return 0;
        }

        if (speed > 120) {
            System.out.println("Going fast... you'll use more fuel.");

            // increasing mileage multiplier with percentage of acceleration speed
            mileageMultiplier = speed / 100;
        }

        // local variable (declared inside a method)
        double distance = speed * durationInHours;

        setTraveledDistance(getTraveledDistance() + distance);
        // same result as the statement above
//        traveledDistance += distance;

        System.out.println("Total traveled distance: " + getTraveledDistance());

        double usedFuelWithStandardMileage = distance * getMileage() / 100;
        System.out.println("Used fuel with standard mileage: " + usedFuelWithStandardMileage);

        double usedFuelWithCurrentMileage =
                usedFuelWithStandardMileage * mileageMultiplier;

        System.out.println("Used fuel with current mileage: "
                + usedFuelWithCurrentMileage);

        setFuelLevel(getFuelLevel() - usedFuelWithCurrentMileage);

        System.out.println("Remaining fuel level: " + getFuelLevel());

        return distance;
    }

    // co-variant return type
    @Override
    public Vehicle clone() {
        return new Vehicle();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", mileage=" + getMileage() +
                ", maxSpeed=" + getMaxSpeed() +
                ", fuelLevel=" + getFuelLevel() +
                ", traveledDistance=" + getTraveledDistance() +
                ", running=" + isRunning() +
                '}';
    }

}
