//Program to output mondays date and the consequent mondays date
package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCheckerForAWeek {
    public static void main(String args[])
    {
        Calendar calendar=Calendar.getInstance();//fetches the current date and time
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);//sets the day on calendar to monday
        DateFormat dateFormat= new SimpleDateFormat("dd/mm/yyyy");//declares date format
        System.out.println(dateFormat.format(calendar.getTime()));//prints current date
        calendar.add(Calendar.DATE,6);
        System.out.println(dateFormat.format(calendar.getTime()));//prints next monday date
    }
}
