package com.company;
import java.util.Scanner;


/* Варіант 4
З матриці A (n,m) отримати нову матрицю, викресливши з вихідної матриці рядок і стовпець,
на перетині яких знаходиться перший максимальний елемент.

From the matrix A (n, m) get a new matrix, deleting from the original matrix row and column,
at the intersection of which are the first maximum elements.*/

public class Lab2 {

    public static void main(String[] args) {

        // entering the number of rows and columns from the keyboard
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int n = in.nextInt();
        System.out.print("Input number of columns: ");
        int m = in.nextInt();
        in.close();

        // filling the array with random numbers in the range from 0 to 100
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        // output of the generated array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        // determination of the maximum element and its index
        int max = arr[0][0];
        int[] position = new int[2];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                if (arr[a][b] > max) {
                    max = arr[a][b];
                    position[0] = a;
                    position[1] = b;
                }
            }
        }
        // output to the console of the maximum number and its index
        System.out.println("\nMax value: " + max);
        System.out.print("Index: ");
        for (int i = 0; i < position.length; i++) {
            System.out.printf("%d ", position[i]);
        }
        System.out.println();

        // changing the column and row at the intersection of the maximum element to zero
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i == position[0] || j == position[1]){
                    arr[i][j] = 0;
                }
            }
        }

        // output of a new matrix
        System.out.println("\nNew matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
