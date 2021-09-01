package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the input string? " );
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            count++;
        }
        System.out.println( string + " has " + count + " characters.");
    }
}
