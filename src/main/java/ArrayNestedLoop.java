
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ani
 */
public class ArrayNestedLoop {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         int[][] array = new int[10][10];
       
        System.out.println("Enter values for the 2D array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt(); // Accept input for each element
            }
        }
         System.out.println("The values you entered are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
