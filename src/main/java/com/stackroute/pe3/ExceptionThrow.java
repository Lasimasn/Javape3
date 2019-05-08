//Program that throws an error in try block, catches the catch and implements finally
package com.stackroute.pe3;

import javax.naming.LimitExceededException;

public class ExceptionThrow {
    private String name;
    private int age;
    ExceptionThrow(String name)
    {
        this.name=name;
    }
    public int getLength() throws LimitExceededException //method that returns the length of the string
    {
        int length=name.length();
        return length;
    }

    public static void main(String args[])
    {
        try
        {
            ExceptionThrow object= new ExceptionThrow("John");
            int length=object.getLength();
                if(length>2)//Exception condition
                {
                    System.out.println("Inside Try Block");//inside try block
                    throw new LimitExceededException();
                }
                else
                    System.out.println("No Exception thrown");
        }
        catch(Exception LimitExceededException)//catch block
        {
            System.out.println("Exception Caught");
        }
        finally//finally block
        {
            System.out.println("Error Occured");
        }
    }

}
