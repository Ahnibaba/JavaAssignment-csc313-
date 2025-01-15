/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ani
 */
public class NigerianFlagNestedLoop {
    
    public static void main(String[]args) {
        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= 12; col++) {
                if (col == 5 || col == 6 || col == 7 || col == 8) {
                    System.out.print("=");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}
