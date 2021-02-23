package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Варіант 4
Обчисліть вираз: a(b-a)/(b+a)
*/

public class Lab5 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter a: ");
            float a = in.nextFloat();
            System.out.println("Enter b: ");
            float b = in.nextFloat();
            System.out.println("a (b - a)/(b + a) = " + a * (b - a)/(b + a));
        } catch (InputMismatchException ex) {
            System.out.println("Error. Only numbers allowed.");
        }
    }
}
