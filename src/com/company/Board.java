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
    public void setBoard(String location){
        Scanner sc = new Scanner(location);
        int x = Integer.parseInt(location.substring(0,1));
        int y = Integer.parseInt(location.substring(location.length()-2, location.length()-1));
        System.out.println(x);
        System.out.println(y);
    }
}
