package com.stackroute.pe3;

public class ExceptionThrow {
    private String name;
    private int age;
    ExceptionThrow(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String args[])
    {
        try
        {
            ExceptionThrow object= new ExceptionThrow("John",0);
                if(object.name.equals("")||object.age==0)
                    throw new NullPointerException();
                else
                    System.out.println("No Exception thrown");
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception Caught");
        }
        finally
        {
            System.out.println("Error Occured");
        }
    }

}
