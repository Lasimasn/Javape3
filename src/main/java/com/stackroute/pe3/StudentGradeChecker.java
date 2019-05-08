//Program that takes input grades of students and prints error if the grades are negative or more than 100
package com.stackroute.pe3;
import java.util.Scanner;
public class StudentGradeChecker {
    private Scanner scan;
    private Object Exception;

    public static void main(String[] args)
    {
        StudentGradeChecker gradesChecker=new StudentGradeChecker();
        gradesChecker.numberOfStudents();
    }
    public void numberOfStudents()
    {
        scan=new Scanner(System.in);
        int numOfStudents;
        System.out.println("Enter the number of students.");
        numOfStudents=scan.nextInt();//reads the number of students
        checkStuGrades(numOfStudents);
    }
    public String checkStuGrades(int numOfStudents)
    {
        int[] stuGrades = new int[numOfStudents];//reads grades
        System.out.println("Enter grades of each students");
        for(int i=0;i<numOfStudents;i++)
        {
            stuGrades[i] = scan.nextInt();
            if(stuGrades[i]>=0 && stuGrades[i] <= 100)
                System.out.println(stuGrades[i]);//prints the grades if the condition is satisfied

            else
                System.out.println( "Error");//prints error if the condition is not satisfied
        }
        return null;
    }
}
