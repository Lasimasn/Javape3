//Program that demonstrates three different kinds of Exceptions
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
        arraySize = scan.nextInt();//Read size of array
        int array[]= new int[5];//Initialize a new array
        String name="";

        try
        {
            if (arraySize < 0)//Negative array size
                throw new NegativeArraySizeException();
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Caught Negative Array Size Exception");
        }
        try
        { int i=array[6];//Index out of bounds
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Caught Index out of bounds Exception");
        }
        try
        {
            if(name.equals(""))//if no name is specified throw exception
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught Null pointer Exception");
        }

    }
}
