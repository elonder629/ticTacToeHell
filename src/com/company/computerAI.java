package com.company;

import java.util.Scanner;

/**
 * Created by el693 on 12/18/17.
 */
public class computerAI {
    public  String symbol;

    public computerAI(String symbol){
        this.symbol = symbol;
    }
    public void askForlocation() { //Needs to change because duh it will be automated, this is just a placeholder
        Scanner input = new Scanner(System.in);
        while (true) {
            String tempLocation = input.nextLine();
            if (Board.checkAvailable(Board.coordAdaptor(tempLocation))) {
                Board.setBoard(Board.coordAdaptor(tempLocation), symbol);
                break;
            }
        }


    }
}
