//Program that removes all vowels in a string
package com.stackroute.pe3;
import java.util.Scanner;
public class RemoveVowels {
    Scanner scan;
    public static void main(String args[])
    {
        RemoveVowels vowels=new RemoveVowels();
        vowels.limit();
    }
    public void limit()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter the number of words to be entered");
        int limit=scan.nextInt();//Enter the number of words to be entered
        inputWords(limit);
    }
    public void inputWords(int limit)
    {
        String words[]=new String[limit];
        System.out.println("Enter the words one by one");//Takes input of words
        for(int i=0;i<limit;i++)
            words[i]=scan.next();
        removeVowel(words);
    }
    public void removeVowel(String words[])
    {
        System.out.print("New string:");
        for(String word :words) {
            String newString = word.replaceAll("[AEIOUaeiou]", "");//Replaces vowels
            System.out.println(newString);

        }
    }
}
