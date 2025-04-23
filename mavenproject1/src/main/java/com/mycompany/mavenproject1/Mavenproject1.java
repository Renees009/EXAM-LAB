/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author IT20
 */
public class Mavenproject1 {

   public static void main(String[] args) {
        int num1 = 10;  // First number
        int num2 = 20;  // Second number

        int sum = num1 + num2;             // Addition
        int difference = num1 - num2;      // Subtraction
        int product = num1 * num2;         // Multiplication
        double quotient = (double) num1 / num2; // Division (cast to double for decimal result)

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}