package com.company;

import java.util.Scanner;

public class Main {

    public static boolean winner = false;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac To my friends, can you beat the computer???????? (The answer if im a good coder is no) \n Please choose your symbol.....X or O");
        String symbol = input.next().toLowerCase();
        Board board = new Board();
        board.printBoard();

        while (!winner){
            String tempLocation = "";
            if (symbol.equals("x")) {
                System.out.println("Please place an x by using the format '0,0'");
                board.setBoard(input.nextLine());
            }

        }


    }
}
