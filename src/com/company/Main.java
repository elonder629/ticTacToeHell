package com.company;

import java.util.Scanner;

public class Main {

    public static boolean winner = false;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac To my friends, can you beat the computer???????? (The answer if im a good coder is no) \n Please choose your symbol.....X or O");
        String symbol = input.nextLine().toLowerCase();
        Board board = new Board();
        board.printBoard();

        while (!winner) {
            while (true) {
                String tempLocation = "";
                System.out.println("Please place an x by using the format '0,0'");
                tempLocation = input.nextLine();
                if (board.checkAvailable(board.coordAdaptor(tempLocation))) {
                    board.setBoard(board.coordAdaptor(tempLocation), symbol);
                    break;
                }
                else
                    System.out.println("Please enter an available location");
            }
        }



    }
}
