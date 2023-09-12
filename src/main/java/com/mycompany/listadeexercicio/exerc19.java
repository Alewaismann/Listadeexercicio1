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
public class exerc19 {
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      
      int num1, num2, peso1, peso2, resultado;
      
      System.out.println("Informe o primeiro valor: ");
      num1 = scanner.nextInt();
      
      System.out.println("Informe o primeiro peso : ");
      peso1 = scanner.nextInt();
      
      
      System.out.println("Informe o segundo valor : ");
      num2 = scanner.nextInt();
      
      System.out.println("Informe o segundo peso : ");
      peso2 = scanner.nextInt();
      
      num1 = num1 * peso1;
      
      num2 = num2 * peso2;
      
      num1 = num1 + num2;
      
      peso1 = peso1 + peso2;
      
      resultado = num1 / peso1;
      
      System.out.println("O resultado é: " + resultado);
        
  }  
}
