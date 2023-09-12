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
public class exerc15 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, num3, resultado;
        
        System.out.println("Informe a nota do primeiro semestre: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe a nota do segundo semestre: ");
        num2 = scanner.nextInt();
        
        System.out.println("Informe a nota do terceiro semestre: ");
        num3 = scanner.nextInt();
        
        resultado = num1 + num2 + num3;
        
        if (resultado >= 70){
            System.out.println("Aluno aprovado! ");
            
        }else{
            System.out.println("Aluno reprovado! ");
        }
            
    
    }
}
