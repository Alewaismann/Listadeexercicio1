/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicio;

import java.util.Scanner;

/**
 *
 * @author alexandre.9930
 */
public class Fibonacci {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       
       int num1 = 0, num2 = 1;
       
       while(num1 <= 10){
        System.out.println(num2);
           num1 = num1 + num2;
           System.out.println(num1);
           
           
           
        
       }
   
   } 
}
