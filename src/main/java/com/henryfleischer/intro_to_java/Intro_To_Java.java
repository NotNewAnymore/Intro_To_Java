/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.henryfleischer.intro_to_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Not New Anymore
 */
public class Intro_To_Java {

    public static void main(String[] args) {
        System.out.println("Enter your favorite red color in number");
        //Scanner! Know this line for getting input
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
                //Sout + tab
        //Basically System.Writeline
        System.out.println("Color is  " + userInput);
        
        //NOTE: If you use your scanner for non-string reasons, call scanner.nextline afterwards
        scanner.nextLine();
        
        //Conditions
        //Decision code blocks
        //If, Elseif, Else, while, for, try/catch , Switch
        if (false){
            
        }
        else if (false){
            
        }
        else{
            
        }
        switch ("C"){
            case "C":
                break;
            default:
                break;
        }
        //Scope is identical to C#
        
        //Loops
        //For, While, foreach
        //For is just like C#
        for (int i = 0; i < 10; i++) {
            System.out.print("W");
        }
        //Do while
        boolean dothings =  true;
        do
        {
            dothings = false;
            System.out.print("\n");
        }
            while (dothings);
        
        //Math ops (Return a number): +,-,*,/
        //Compound Ops (Math and assignment): +=, -=, *=, /=, %=.
        //Assignment op (Assigns a value): =
        //Concatonate: +, +=
        //Logical:  &&(And), ||(Or), !(Not), &(And, evaluates all conditions. Good for obscure logic things, but laggy)
        //Comparison: >, <, <=, >=. ==, !=
        
        //Methods are supposed to be lower case, classes are upper case
        System.out.println("Number:" + add(10,25.5));
        
        //List is now Arraylist
//        ArraylList<string> names = new ArrayList<String>();

        
        
        //Int- whole numbers- byte, shrt, int long
        //Float- fractional numbers - float or long
        //Boolean- true or false
        //Char- a character- String holds many
        //No unsigned data types~
        //String is very much treated as an object- a collection of Chars.
        
    }
    
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }
}
