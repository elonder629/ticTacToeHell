package com.company;

/**
 * Created by el693 on 12/18/17.
 */
public class print {

    public print(){
        for (int j = 0; j < 3; j++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(Main.board[x][j]);
            }
            System.out.println("\n");
        }

    }
}
