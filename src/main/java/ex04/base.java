/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 4 - Mad Lib
 *  Create a simple mad-lib program that prompts for a noun, a verb,
 *  an adverb, and an adjective and injects those into a story that you
 *  create.
 *
 *  Constraint:
 *  Use a single output statement for this program.
 *  If your language supports string interpolation or string substitution, use it to build up the output.

 *
 */

package ex04;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        String noun,verb,adjective,adverb;

        // User Input Step
        System.out.printf("Enter a noun: ");
        noun = userInput.nextLine();

        System.out.printf("Enter a verb: ");
        verb = userInput.nextLine();

        System.out.printf("Enter an adjective: ");
        adjective = userInput.nextLine();

        System.out.printf("Enter an adverb: ");
        adverb = userInput.nextLine();

        // String Substitution
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
