package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();



    public void start() {
        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();

        initializeCompetitors();

        for (Vehicle vehicle : competitors){

            System.out.println("It's " + vehicle.getName() + "'s turn.");
            double speed = getAccelerationSpeedFromUser();
            vehicle.accelerate(speed);

            if(vehicle.getTraveledDistance() >= selectedTrack.getLenght())
            {

                System.out.println("The winner is " + vehicle.getName());
                break;
            }
        }

    }

    private double getAccelerationSpeedFromUser(){

        System.out.println("Please enter acceleration speed...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

    private void displayTracks() {

        System.out.println("Available tracks:");

        //classic for loop
        for (int i = 0; i < tracks.length; i++) {

            if (tracks[i] != null) {
//                System.out.println(tracks[i].toString(i)); - costumized output with method
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLenght() + " km");
            }
        }

    }

    private void initializeCompetitors(){

        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players: " + playerCount);
        for (int i = 1; i <= playerCount; i++){

            System.out.println("Adding player " + i);
            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6, 15));
            vehicle.setMaxSpeed(300);


            System.out.println("Vehicle for player " + i + ": " + vehicle.getName() + " - Mileage: " + vehicle.getMileage());

            competitors.add(vehicle);
        }

    }


    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLenght(4.2);
        Track track2 = new Track();
        track2.setName("BestTrack");
        track2.setLenght(200);

        tracks[0] = track1;
        tracks[1] = track2;

    }



    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter player count.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private Track getSelectedTrackFromUser(){

        System.out.println("Please enter the chosen track's number...");
        Scanner scanner = new Scanner(System.in);
        int selectedTrackNumber;
        selectedTrackNumber = scanner.nextInt() - 1;
        Track selectedTrack = new Track();
        selectedTrack = tracks[selectedTrackNumber];
        System.out.println("Youve selected: " + selectedTrack.getName());
        return selectedTrack;
    }



}
