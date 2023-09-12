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
public class exerc10 {
    public static void mai(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, resultado;
        
        System.out.println("Informe a temperatura: ");
        num1 = scanner.nextDouble();
        
        num2 = num1 * 1.8;
        
        resultado = num2 + 32;
        System.out.println(num1 + "° celsius são " + resultado + "° Fahrenheit ");
     
    }
}
