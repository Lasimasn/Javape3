//Program that inputs limit and elements of two matrices and returns the sum of the two matrices
package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    Scanner scan;
    public static void main(String args[])
    {
        MatrixAddition matrix=new MatrixAddition();
        matrix.inputLimit();
    }
    public void inputLimit()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter the limit of the array");//Input row value of the first matrix
        int n=scan.nextInt();
        System.out.println("Enter the limit of the array");//Input column value of the first matrix
        int m=scan.nextInt();
        System.out.println("Enter the limit of the array");//Input row value  of the second matrix
        int k=scan.nextInt();
        System.out.println("Enter the limit of the array");//Input column value of the second matrix
        int l=scan.nextInt();
        inputMatrix(n,m,k,l);
    }
    public  void inputMatrix(int row,int column, int row1, int column1)
    {
        int matrix1[][]=new int[row][column];
        System.out.print("Enter the first matrix of order "+row+" by "+column);
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                matrix1[i][j]=scan.nextInt();//Input elements of the first matrix
        int matrix2[][]=new int[row1][column1];
        System.out.print("Enter the second matrix of order "+row1+" by "+column1);
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                matrix2[i][j]=scan.nextInt();//Input elements of the second matrix
        matrixAdd(matrix1,matrix2,row,column,row1,column1);
    }
    public void matrixAdd(int matrix1[][],int matrix2[][],int row1,int column1, int row2, int column2)
    {
        int sum[][]=new int[row1][column1];//Declaring a new sum array
        if((row1==row2)&&(column1==column2)) {//checking to see if both the matrices are of the same index
            {
                for (int i = 0; i < row1; i++)
                    for (int j = 0; j < column1; j++)
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("Sum :");
            System.out.println(Arrays.deepToString(sum));//Display sum
        }
        else
            System.out.println("Cannot find sum");
    }
}
