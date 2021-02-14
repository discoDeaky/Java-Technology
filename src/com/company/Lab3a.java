package com.company;

/* Варіант 4
Розробити програму, що встановлює, чи є слово паліндромом
(слово, яке однаково читається зліва направо і справа наліво: дід, око, зараз і т.д.) */

import java.util.Scanner;

public class Lab3a {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = in.nextLine();
        in.close();

        if (word.length() == 0) {
            System.out.println("Is not palindrome");
        }

        int a = 0, b = word.length() - 1;
        String flag = "";
        while(a < b) {
            if (word.charAt(a++) != word.charAt(b--)) {
                flag = "Is not palindrome";
            } else {
                flag = "Is palindrome";
            }
        }
        System.out.println(flag);
    }
}
