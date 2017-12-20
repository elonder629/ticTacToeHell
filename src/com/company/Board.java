package com.company;

import java.util.Scanner;

/**
 * Created by el693 on 12/19/17.
 */
public class Board {
    public String[][] board = new String[3][3];
    public Board() {
        for (int j = 0; j < 3; j++) {
            for (int x = 0; x < 3; x++) {
                board[x][j] = "-";
            }

        }
    }
    public void printBoard(){
        for (int j = 0; j < 3; j++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(board[j][x]);
            }
            System.out.println("\n");
        }
    }
    public void setBoard(int[] coords, String symbol){
        board[coords[0]][coords[1]] = symbol;
        printBoard();
    }
    public boolean checkAvailable(int[] coords){
        if (board[coords[0]][coords[1]].equals("-"))
            return true;
        else
            return false;
    }
    public int[] coordAdaptor(String location){
        Scanner sc = new Scanner(location);
        int[] coords = new int[2];
        coords[0] = Integer.parseInt(location.substring(0,1));
        coords[1] = Integer.parseInt(location.substring(2));
        return coords;
    }
    public boolean checkWin(String symbol){
        for (int j = 0; j < 8; j++) {
            int count = 0;
            for (int x = 0; x < 3; x++) {
                if (board[0][x].equals(symbol))
            }
        }
    }
}
