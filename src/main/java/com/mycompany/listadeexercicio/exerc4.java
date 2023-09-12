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
public class exerc4 {
    public static void main(String args[]){
    //Declaração da variavel do tipo scanner
     Scanner entrada = new Scanner(System.in);
     
     //Variavel referente a opção Calculadora
     int opcao;
     
     //Declaração das variaveis que receberão os numeros
     float num1, num2, resultado = 0;
     
     boolean continuar = true;
     
     String opcaoescolha;
     
     while(continuar){
        //Menu Calculadora
        System.out.println("---------------------------------");
        System.out.println("Caulculadora das quatro operações");
        System.out.println("---------------------------------");
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("---------------------------------");

        //Entrada da opção
        opcao = entrada.nextInt();

   
        //Condicionais referente a opção selecionada
        if(opcao == 1){//soma
            //Entrada do primeiro valor a ser caulculado
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextFloat();

        //Entrada do segundo valor a ser calculado
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextFloat();
           resultado = num1 + num2;
        System.out.println("---------------------------------");
        System.out.println("RESULTADO");
        System.out.println("---------------------------------");
        System.out.println(resultado);
        }else if(opcao == 2){//subtração
              //Entrada do primeiro valor a ser caulculado
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextFloat();

        //Entrada do segundo valor a ser calculado
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextFloat();
           resultado = num1 - num2;
        System.out.println("---------------------------------");
        System.out.println("RESULTADO");
        System.out.println("---------------------------------");
        System.out.println(resultado);
        }else if(opcao == 3){//multiplicação
              //Entrada do primeiro valor a ser caulculado
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextFloat();

        //Entrada do segundo valor a ser calculado
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextFloat();
           resultado = num1 * num2;
        System.out.println("---------------------------------");
        System.out.println("RESULTADO");
        System.out.println("---------------------------------");
        System.out.println(resultado);
        }else if(opcao == 4){//divisão
              //Entrada do primeiro valor a ser caulculado
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextFloat();

        //Entrada do segundo valor a ser calculado
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextFloat();
            resultado = num1 / num2;
        System.out.println("---------------------------------");
        System.out.println("RESULTADO");
        System.out.println("---------------------------------");
        System.out.println(resultado);
        }else{
        System.out.println("Opção inexistente!");

        }
     
        System.out.println("---------------------------------");
        System.out.println("Deseja continuar? (s/n)");
        opcaoescolha = entrada.next();
        System.out.println("---------------------------------");
        
        if(opcaoescolha.equals("s")){
             continuar = true;
        }else{
          continuar = false;
        }
     }
    
    
    }
}
