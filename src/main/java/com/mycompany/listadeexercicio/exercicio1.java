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
public class exercicio1 {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
     int num1, num2, resultado;
     
     System.out.println("Informe o primeiro numero: ");
     num1 = scanner.nextInt();
     
        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("O resultado da soma entre " + num1 + "e" + num2 + "é : " + resultado);
}
}