package org.fasttrackit;


// inheritance -- is-a relationship
public class Car extends AutoVehicle {

    // instance variables

     private int doorCount;

     public Car(Engine engine) {
          super(engine);
     }

     public Car(){

          this(new Engine());

     }

     public int getDoorCount() {
          return doorCount;
     }

     public void setDoorCount(int doorCount) {
          this.doorCount = doorCount;
     }
}
