package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by el693 on 12/18/17.
 */
public class computerAI {
    public static String symbol;


    public static void askForlocation() {
        System.out.println("Computer's Move");
        if (placeCenter()) {
        } else if (tryToWin()) {
        } else if (blockOpponent()) {
        } else {
            placeRandom();
        }


    }


    private static boolean blockOpponent() {
        int opponentCount;
        int AICount;
        int row = 0;
        for (int j = 0; j < 3; j++) {
            opponentCount = 0;
            AICount = 0;
            for (int x = 0; x < 3; x++) {
                if (Board.board[j][x].equals(Player.symbol))
                    opponentCount++;
                else if (Board.board[j][x].equals(symbol))
                    AICount++;
                else if (Board.board[j][x].equals("-")) {
                    row = x;
                }
            }

            if (opponentCount == 2 && AICount == 0) {
                Board.setBoard(j, row, symbol);
                return true;
            }

        }
        for (int j = 0; j < 3; j++) {
            opponentCount = 0;
            AICount = 0;
            for (int x = 0; x < 3; x++) {
                if (Board.board[x][j].equals(Player.symbol))
                    opponentCount++;
                else if (Board.board[x][j].equals(symbol))
                    AICount++;
                else if (Board.board[x][j].equals("-")) {
                    row = x;
                    System.out.println("This happens");
                }

            }
            if (opponentCount == 2 && AICount == 0) {
                Board.setBoard(row, j, symbol);
                return true;
            }

        }
        opponentCount = 0;
        AICount = 0;

        for (int j = 0; j < 3; j++) {
            if (Board.board[j][j].equals(Player.symbol))
                opponentCount++;
            else if (Board.board[j][j].equals(symbol))
                AICount++;
            else if (Board.board[j][j].equals("-"))
                row = j;
        }
        if (opponentCount == 2 && AICount == 0) {
            Board.setBoard(row, row, symbol);
            return true;
        }
        opponentCount = 0;
        AICount = 0;
        for (int j = 0; j < 3; j++) {
            if (Board.board[j][(Board.board[j].length - 1) - j].equals(Player.symbol))
                opponentCount++;
            else if (Board.board[j][(Board.board[j].length - 1) - j].equals(symbol))
                AICount++;
            else
                row = j;
        }
        if (opponentCount == 2 && AICount == 0) {
            Board.setBoard(row, (Board.board[row].length - 1) - row, symbol);
            return true;
        }
        return false;
    }

    private static boolean tryToWin() {
        System.out.println("tryto win");
        int openSpaceCount;
        int AICount;
        int row = 0;
        for (int j = 0; j < 3; j++) {
            openSpaceCount = 0;
            AICount = 0;
            for (int x = 0; x < 3; x++) {
                if (Board.board[j][x].equals("-"))
                    openSpaceCount++;
                else if (Board.board[j][x].equals(symbol))
                    AICount++;
                else if (Board.board[j][x].equals("-"))
                    row = x;
            }

            if (openSpaceCount == 1 && AICount == 2) {
                Board.setBoard(j, row, symbol);

                return true;

            }

        }
        for (int j = 0; j < 3; j++) {
            openSpaceCount = 0;
            AICount = 0;
            for (int x = 0; x < 3; x++) {
                if (Board.board[x][j].equals("-"))
                    openSpaceCount++;
                else if (Board.board[x][j].equals(symbol))
                    AICount++;
                else
                    row = x;
            }
            if (openSpaceCount == 1 && AICount == 2) {
                Board.setBoard(row, j, symbol);

                return true;
            }
        }
        openSpaceCount = 0;
        AICount = 0;
        for (int j = 0; j < 3; j++) {
            if (Board.board[j][j].equals("-"))
                openSpaceCount++;
            else if (Board.board[j][j].equals(symbol))
                AICount++;
            else
                row = j;
        }
        if (openSpaceCount == 1 && AICount == 2) {
            Board.setBoard(row, row, symbol);

            return true;
        }
        openSpaceCount = 0;
        AICount = 0;
        for (int j = 0; j < 3; j++) {
            if (Board.board[j][(Board.board[j].length - 1) - j].equals("-"))
                openSpaceCount++;
            else if (Board.board[j][(Board.board[j].length - 1) - j].equals(symbol))
                AICount++;
            else
                row = j;
        }
        if (openSpaceCount == 1 && AICount == 2) {
            Board.setBoard(row, (Board.board[row].length - 1) - row, symbol);
            System.out.println("This happens");
            return true;
        }
        return false;
    }

    private static void placeRandom() {
        Random rn = new Random();
        boolean found = false;
        while (!found) {
            int r = rn.nextInt(3), c = rn.nextInt(3);
            if (Board.checkAvailable(r, c)) {
                Board.setBoard(r, c, symbol);
                found = true;
            }
        }

    }

    private static boolean placeCenter() {
        if (Board.checkAvailable(1, 1)) {
            Board.setBoard(1, 1, symbol);
            return true;
        }
        return false;
    }
}