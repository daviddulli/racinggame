package org.fasttrackit;

import java.util.Scanner;

public class Game {


    private Track[] tracks = new Track[3];


    public void start() {
        initializeTracks();
        displayTracks();
        System.out.println("Starting game...");

        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players: " + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: " + vehicleName);
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

}
