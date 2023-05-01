/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Exercicio04 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in); 
        
    Double real;
        
        System.out.print("Escreva um valor em $: ");
        Double dolar = entrada.nextDouble();
        
        real = dolar * 5.1;
        
        System.out.println("Convertendo de $ para R$ o valor fica: R$"+real);
    }
}
