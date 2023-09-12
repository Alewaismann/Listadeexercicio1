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
public class exercicio2 {
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int num1, num2, num3, resultado1, resultado2;
      
      System.out.println("Informe o primeiro numero");
      num1 = scanner.nextInt();
      
      
      System.out.println("Informe o segundo numero");
      num2 = scanner.nextInt();
      
      System.out.println("Informe o terceiro valor");
      num3 = scanner.nextInt();
      
      resultado1 = num1 + num2 + num3;
      
      System.out.println("O resultado entre " + num1 + " e " + num2 + " e " + num3 + " é: " + resultado1 );
       
      resultado2 = resultado1 / 3;
      
      System.out.println("O resultado é: " + resultado2);
      
      
      
    
      
  
  }
}
