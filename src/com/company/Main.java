package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean winner = false;
        System.out.println("Welcome to Tic Tac To my friends, can you beat the computer???????? (The answer if im a good coder is no) \n Please choose your symbol.....X or O \n p.s X will go first!");
        Player.symbol = input.nextLine().toLowerCase();
        if (Player.symbol.equals("x")) {
            computerAI.symbol = "o";
            Board.printBoard();
        } else
            computerAI.symbol = "x";


        int turn = 1;
        while (!winner) { // game loop
            if (turn % 2 == 1) {
                if (Player.symbol.equals("x")) {
                    Player.askForlocation();
                    if (Board.checkWin(Player.symbol) || Board.tieCheck())
                        winner = true;
                    turn++;
                } else {
                    computerAI.askForlocation();
                    if (Board.checkWin(computerAI.symbol) || Board.tieCheck())
                        winner = true;
                    turn++;
                }
            } else {
                if (Player.symbol.equals("o")) {
                    Player.askForlocation();
                    if (Board.checkWin(Player.symbol) || Board.tieCheck())
                        winner = true;
                    turn++;
                } else {
                    computerAI.askForlocation();
                    if (Board.checkWin(computerAI.symbol) || Board.tieCheck())
                        winner = true;
                    turn++;
                }

            }
        }
        System.out.println("Game Over");
    }
}