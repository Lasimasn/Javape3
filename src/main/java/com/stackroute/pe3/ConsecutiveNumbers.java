package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumbers {
    Scanner scan;

    public static void main(String  args[])
    {
        ConsecutiveNumbers consecutiveNumbers=new ConsecutiveNumbers();
        consecutiveNumbers.inputNumbers();
    }
    public void inputNumbers()
    {
        scan=new Scanner(System.in);
        int limit;
        System.out.println("Enter the limit");
        limit=scan.nextInt();
        int array[]=new int[7];
        System.out.println("Enter "+limit+" numbers");
        for(int i=0;i<limit;i++)
            array[i]=scan.nextInt();
        checkConsecutive(array,limit);
    }

    public void checkConsecutive(int array[],int limit)
    {
        int k=0;
        for(int i=0;i<limit-1;i++)
            if((array[i]==array[i+1]+1) || (array[i]==array[i+1]-1))
            {
                k++;
            }
        if(k==limit-1)
            System.out.println("The given array is consecutive");
        else
        System.out.println("The given array is not consecutive");

    }
}
