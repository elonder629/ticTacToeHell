package com.company;

import java.util.Scanner;

public class Player {
    public  String symbol;

    public Player(String symbol) { // sets up player and their symbol
        this.symbol = symbol;
    }

    public void askForlocation() { // asks the user to put in coords they would like to place an x or o in
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please place an x by using the format '0,0'");
            String tempLocation = input.nextLine();
            if (Board.checkAvailable(Board.coordAdaptor(tempLocation))) {
                Board.setBoard(Board.coordAdaptor(tempLocation), symbol);
                break;
            } else
                System.out.println("Please enter an available location");
        }


    }
}
