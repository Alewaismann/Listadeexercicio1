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
public class exerc18 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int jan = 31,
            fev = 28,
            mar = 31,
            abr = 30,   
            mai = 31,
            jun = 30,
            jul = 31,
            ago = 31,
            set = 30,
            out = 31,
            nov = 30,
            dez = 31;
        
        
        int mes, ano;
        
        System.out.println("Informe um mês: ");
        mes = scanner.nextInt();
        
        System.out.println("Informe um ano: ");
        ano = scanner.nextInt();
        
        if(mes == 1){
            System.out.println("O mes de janeiro do " + ano + " tem " + jan + " dias ");
        }else if(mes == 2){
            System.out.println("O mes de fevereiro do " + ano + " tem " + fev + " dias ");
        
        }else if(mes == 3){
        System.out.println("O mes de março do " + ano + " tem " + mar + " dias ");
        
        }else if(mes == 4){
        System.out.println("O mes de abril do " + ano + " tem " + abr + " dias ");
        
        }else if(mes == 5){
        System.out.println("O mes de maio do " + ano + " tem " + mai + " dias ");
          
        }else if(mes == 6){
        System.out.println("O mes de junho do " + ano + " tem " + jun + " dias ");
        
        
        }else if(mes == 7){
        System.out.println("O mes de julho do " + ano + " tem " + jul + " dias ");
        
        }else if(mes==8){
        System.out.println("O mes de agosto do " + ano + " tem " + ago + " dias ");
        
        }else if(mes == 9){
        System.out.println("O mes de setembro do " + ano + " tem " + set + " dias ");
        
        }else if(mes == 10){
        System.out.println("O mes de outubro do " + ano + " tem " + out + " dias ");
        
        }else if(mes == 11){
        System.out.println("O mes de novembro do " + ano + " tem " + nov + " dias ");
        
        }else if(mes == 12){
        System.out.println("O mes de dezembro do " + ano + " tem " + dez + " dias ");
        
        }
        
    
    }
}
