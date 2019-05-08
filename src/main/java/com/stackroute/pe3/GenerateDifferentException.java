package com.stackroute.pe3;

import java.util.Scanner;

public class GenerateDifferentException {
    Scanner scan=new Scanner(System.in);

    public static void main(String args[])
    {
        GenerateDifferentException generateDifferentException=new GenerateDifferentException();
        generateDifferentException.displayError();
    }
    public void displayError()
    {
        int arraySize;
        System.out.println("Enter the size of the array");
        arraySize = scan.nextInt();
        int array[]= new int[5];
        String name="";

        try
        {
            if (arraySize < 0)
                throw new NegativeArraySizeException();
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Caught Negative Array Size Exception");
        }
        try
        { int i=array[6];
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Caught Index out of bounds Exception");
        }
        try
        {
            if(name.equals(""))
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught Null pointer Exception");
        }

    }
}
