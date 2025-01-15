/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ani
 */
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        for(int i=0; i<numbers.length; i++){
            System.out.print("\nEnter a number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("You entered the following numbers: ");
        for(int num: numbers) {
            System.out.println(num + "");
        }
    }
}
