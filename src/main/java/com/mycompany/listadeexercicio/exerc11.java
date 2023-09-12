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
public class exerc11 {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       
       int num1, num2;
       
       System.out.println("informe o prmeiro numero: ");
       num1 = scanner.nextInt();
       
        System.out.println("informe o segundo numero: ");
       num2 = scanner.nextInt();
       
       if (num1 > num2){
           System.out.println(num1 + " é maior que " +num2);
       
       }else{
           System.out.println(num2 + " é maior que " + num1);
       }
   } 
}
