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
        System.out.println("Enter the limit of the array n");//Input n of the first matrix of order n by m
        int n=scan.nextInt();
        System.out.println("Enter the limit of the array m");//Input m of the first matrix of order n by m
        int m=scan.nextInt();
        System.out.println("Enter the limit of the array k");//Input k of the second matrix of order k by l
        int k=scan.nextInt();
        System.out.println("Enter the limit of the array l");//Input l of the second matrix of order k by l
        int l=scan.nextInt();
        inputMatrix(n,m,k,l);
    }
    public  void inputMatrix(int n,int m, int k, int l)
    {
        int matrix1[][]=new int[n][m];
        System.out.print("Enter the first matrix of order "+n+" by "+m);
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix1[i][j]=scan.nextInt();//Input elements of the first matrix
        int matrix2[][]=new int[k][l];
        System.out.print("Enter the second matrix of order "+k+" by "+l);
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix2[i][j]=scan.nextInt();//Input elements of the second matrix
        matrixAdd(matrix1,matrix2,n,m,k,l);
    }
    public void matrixAdd(int matrix1[][],int matrix2[][],int n,int m, int k, int l)
    {
        int sum[][]=new int[n][m];//Declaring a new sum array
        if((n==k)&&(m==l)) {//checking to see if both the matrices are of the same index
            {
                for (int i = 0; i < n; i++)
                    for (int j = 0; j < m; j++)
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("Sum :");
//            for (int i = 0; i < n; i++)
//                for (int j = 0; j < m; j++)
//                    System.out.println(+sum[i][j]);
            System.out.println(Arrays.deepToString(sum));//Display sum
        }
        else
            System.out.println("Cannot find sum");
    }
}
