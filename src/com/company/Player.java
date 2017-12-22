package com.company;

import java.util.Scanner;

public class Player {
    public static String symbol;

    public static void askForlocation() { // asks the user to put in coords they would like to place an x or o in
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Your move! Please place an x by using the format '0,0'");
            String tempLocation = input.nextLine();
            if (Board.checkAvailable(Board.coordAdaptor(tempLocation))) {
                Board.setBoard(Board.coordAdaptor(tempLocation), symbol);
                break;
            } else
                System.out.println("Please enter an available location");
        }


    }
}