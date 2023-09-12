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
public class exerc7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1, cont = 2, resultado;
         
        
        System.out.println("Informe um valor: ");
        num1 = scanner.nextInt();
        
        cont = num1;
        
        while(cont > 2){
        
            cont = cont - 1;
            
            resultado = num1 * cont;
            
            num1 = num1 * cont ;
            
            System.out.println(resultado);
        }
        
    }
}
