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
public class exerc17 {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
      
      
       float peso, altura, resultado;
       
       
       System.out.println("Informe o peso: ");
       peso = scanner.nextFloat();
       
       
       System.err.println("Informe a altura: ");
        altura = scanner.nextFloat();
        
        altura = altura * altura;
        
        resultado = peso / altura;
        
        System.out.println("Seu IMC é: " + resultado);
        
   } 
}
