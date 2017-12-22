package com.company;

/**
 * Created by el693 on 12/19/17.
 */
public class Board {
    public static String[][] board = new String[][]{
            {"-", "-", "-"},
            {"-", "-", "-"}, //Sets up the game base values
            {"-", "-", "-"}};

    public static void printBoard() { //prints the board....duh
        System.out.println("\t0\t1\t2");
        for (int j = 0; j < 3; j++) {
            System.out.print(j + "|\t");
            for (int x = 0; x < 3; x++) {
                System.out.print(board[j][x] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void setBoard(int[] coords, String symbol) { //puts an x or o in a location
        board[coords[0]][coords[1]] = symbol;
        printBoard();
    }

    public static void setBoard(int r, int c, String symbol) {
        board[r][c] = symbol;
        printBoard();
    }

    public static boolean checkAvailable(int r, int c) {
        return board[r][c].equals("-");
    }

    public static boolean checkAvailable(int[] coords) { //checks if a location is vacant
        return board[coords[0]][coords[1]].equals("-");
    }

    public static int[] coordAdaptor(String location) {// finds the x and y coords from user input
        int[] coords = new int[2];
        coords[0] = Integer.parseInt(location.substring(0, 1));
        coords[1] = Integer.parseInt(location.substring(2));
        return coords;
    }

    public static boolean checkWin(String symbol) { // checks if there is a winning board
        int count;
        for (int j = 0; j < 3; j++) {
            count = 0;
            for (int x = 0; x < 3; x++) {
                if (board[j][x].equals(symbol))
                    count++;
            }
            if (count == 3)
                return true;
        }
        for (int j = 0; j < 3; j++) {
            count = 0;
            for (int x = 0; x < 3; x++) {
                if (board[x][j].equals(symbol))
                    count++;
            }
            if (count == 3)
                return true;
        }
        count = 0;
        for (int j = 0; j < 3; j++) {
            if (board[j][j].equals(symbol))
                count++;
            if (count == 3)
                return true;
        }
        count = 0;
        for (int j = 0; j < 3; j++) {
            if (board[j][(board[j].length - 1) - j].equals(symbol))
                count++;
            if (count == 3)
                return true;
        }
        return false;

    }

    public static boolean tieCheck() { // checks if there is a tie by seeing if  all spaces are filled because im lazy and
        // its 2 am so im just only going to use this after the check win method because otherwise everything is broken
        for (int j = 0; j < 3; j++) {
            for (int x = 0; x < 3; x++) {
                if (board[j][x].equals("-"))
                    return false;
            }
        }
        return true;
    }


}