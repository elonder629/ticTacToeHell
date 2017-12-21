package com.company;

import java.util.Scanner;
//TODO  Implement the computer AI, Be able to Reset the game, redesign  the board, check for a win, check for a tie

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean winner = false;
        System.out.println("Welcome to Tic Tac To my friends, can you beat the computer???????? (The answer if im a good coder is no) \n Please choose your symbol.....X or O \n p.s X will go first!");
        String symbol = input.nextLine().toLowerCase();
        Player player = new Player(symbol);

        Board.printBoard();
        int turn = 1;
        while (!winner) { // game loop
            if (turn % 2 == 1) {
                if (player.symbol.equals("x")){
                    player.askForlocation();
                    if (Board.checkWin(symbol) || Board.tieCheck())
                        winner = true;
                }
                else {
                    computerAI
                }
            }


        }
    }
}
