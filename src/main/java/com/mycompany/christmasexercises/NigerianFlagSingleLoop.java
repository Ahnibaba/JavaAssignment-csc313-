/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.christmasexercises;

/**
 *
 * @author Ani
 */
public class NigerianFlagSingleLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 48; i++) {
            if (i == 5 || i == 6 || i == 7 || i == 8) {
                System.out.print("=");
            } else if (i == 17 || i == 18 || i == 19 || i == 20) {
                System.out.print("=");
            } else if (i == 29 || i == 30 || i == 31 || i == 32) {
                System.out.print("=");
            } else if (i == 41 || i == 42 || i == 43 || i == 44) {
                System.out.print("=");
            } else {
                System.out.print("*");
            }
            if (i % 12 == 0) {
                System.out.print("\n");
            }
        }
    }    
    
}
