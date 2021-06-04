package E_16;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        System.out.print( "What is you age? " );
        CheckAge checker = new CheckAge(reader.nextInt());
        String output = "You are not old enough to drive";
        if(checker.isLegal()){
            output = "You are old enough to drive";
        }

        System.out.println(output);
    }
}
