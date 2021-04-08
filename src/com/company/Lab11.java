package com.company;

/* Варіант 4
* Згенеруйте масив цілих чисел, використовуючи клас Random().
* Використовуючи методи класів-колекцій найдіть унікальні (що не дублюються) числа.
**/

import java.util.*;

public class Lab11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter a size of the array: ");
            int n = in.nextInt();
            int[] arr = new int[n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(10);
            }
            System.out.println("Your generated array: " + Arrays.toString(arr));

            Set set = new HashSet();
            List<String> duplicate = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (!set.add(arr[i])) {
                    duplicate.add(Integer.toString(arr[i]));
                }
            }

            List<String> unique = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                unique.add(Integer.toString(arr[i]));
            }

            unique.removeAll(duplicate);
            System.out.print("Unique elements: ");
            for (String s : unique) {
                System.out.print(s + " ");
            }

        } catch (InputMismatchException ex){
            System.out.println("ERROR: Only integer numbers allowed.");
        } catch (Exception ex){
            System.out.println("Oops... Something went wrong.");
        }
    }
}
