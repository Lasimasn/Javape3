package com.stackroute.pe3;

import java.util.Scanner;

//Program to print a chess board with 8 rows and columns
public class ChessBoard {
    Scanner scan;
    public static void main(String args[])
    {
        ChessBoard chess= new ChessBoard();
        chess.displayChessBoard();
    }
    public void displayChessBoard() {//loop to print a chess board of 8 rows and columns
        String [][]array=new String[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        array[i][j]="BB|";
                    else
                        array[i][j]="WW|";
                } else {
                    if (j % 2 == 0)
                        array[i][j]="WW|";
                    else
                        array[i][j]="BB|";
                }
            }
        }
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

}
