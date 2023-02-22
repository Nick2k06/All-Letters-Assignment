/*
Nickolas Gabrialovitch
Wednesday Oct 19 2022
ICS 3U1
Creating a program that asks the user for input to replace 
adjectives, animals, and colour.
*/

import java.util.Scanner;

public class MyProgram{
    public static void main(String[] args){
    
//Displays the sentence that contains all the letters of the alphabet
System.out.println("The following sentence contains all the letters of the alphabet: 'The quick brown fox jumps over the lazy dog.'");

//Creation of Scanner object called "s"
Scanner s = new Scanner (System.in);

//Asks the user to input a different adjective to replace quick
System.out.print("Enter an adjective to replace 'quick': ");
String adjective = s.nextLine();

//Asks the user to input a different colour to replace brown
System.out.print("Enter a colour to replace 'brown': ");
String colour = s.nextLine();

//Asks the user to input a different animal to replace fox
System.out.print ("Enter the name of an animal to replace 'fox': ");
String animal = s.nextLine();

//Ask the user to input a different adjective to replace lazy
System.out.print("Enter another adjective to replace 'lazy': ");
String adjective2 = s.nextLine();

//Asks the user to input a different animal to replace dog
System.out.print ("Enter another name of an animal to replace 'dog': ");
String animal2 = s.nextLine();

//Using a println() methods to output the sentance, as well as the input of the user together.
System.out.println("The following sentances consists of all the changes you have made: ");
System.out.print("The "+ adjective + " " + colour + " " + animal + " jumps over the " + adjective2 + " " + animal2 + ".");
    }
}
