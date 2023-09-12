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
public class exerc3 {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        int num1, resultado;
        
       
        System.out.println("Informe o numero: ");
        num1 = scanner.nextInt();
        
        resultado = num1 % 2;
        
        if (resultado == 0){
            System.out.println("O numero é par");
        
        }else if (resultado != 0){
            System.out.println("O numero é impar");
        }
        
     
    }
}
