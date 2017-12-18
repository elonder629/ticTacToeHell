package com.company;

import java.util.Scanner;

public class Main {
    public static String[][] board = new String[][]{
            {"-","-","-"},
            {"-","-","-"},
            {"-","-","-"}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac To my friends, can you beat the computer???????? (The answer if im a good coder is no) \n Please choose your symbol.....X or O");
        String symbol = input.next();
        print printer = new print();


    }
}
