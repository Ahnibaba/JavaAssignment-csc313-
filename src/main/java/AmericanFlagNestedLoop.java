/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ani
 */
public class AmericanFlagNestedLoop {
     public static void main(String[] args) {
           for (int i = 1; i <= 66; i++) {

            if ((i<=4) || (i>=12 && i<=15) || (i>=23 && i<=26)) {
                System.out.print("*");
            } else if(i==39 || i==50 || i==61) {
                System.out.print(" ");
            }else {
                System.out.print("=");
            }

            if (i % 11 == 0) {
                System.out.print("\n");
            }
        }
     }
}
