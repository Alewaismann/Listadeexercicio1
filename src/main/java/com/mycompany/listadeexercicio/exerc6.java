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
public class exerc6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
      int numTabuada, cont = 1, resultado; 
      
      String opcaoescolha;
      
      boolean continuar = true;
      
      while(continuar){
      System.out.println("Informe uma tabuada: ");
      numTabuada = scanner.nextInt();
      
      while(cont <= 10){
            resultado = numTabuada * cont;
              System.out.println(numTabuada + " x " + cont + " = " +  resultado);
              cont = cont + 1;
           }
      
           cont = 1;
      
            System.out.println("---------------------------------");
            System.out.println("Deseja continuar? (s/n)");
            opcaoescolha = scanner.next();
            System.out.println("---------------------------------");

            if(opcaoescolha.equals("s")){
                 continuar = true;
            }else{
              continuar = false;

      }
    }
  }
}
    
  
 
    

