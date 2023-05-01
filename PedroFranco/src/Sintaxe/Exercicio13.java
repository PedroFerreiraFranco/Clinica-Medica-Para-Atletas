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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entradaDias = new Scanner(System.in);
        Scanner entradaHospedes = new Scanner(System.in);
        
        System.out.print("Quantidade de hospedes: ");
        Integer qtdHospedes = entradaHospedes.nextInt();
        System.out.print("Quantidade de dias: ");
        Integer qtdDias = entradaDias.nextInt();
        
        Integer valorTotal = null;
        Integer valorDia = null;
        
        if(qtdHospedes>=1 && qtdHospedes<=4){
           valorDia = qtdHospedes * 160;
           valorTotal = valorDia * qtdDias;
           System.out.println("Valor para se pagar pela hospedagem: R$"+valorTotal);
        }
        else if(qtdHospedes>=5 && qtdHospedes<=8){
           valorDia = qtdHospedes * 120;
           valorTotal = valorDia * qtdDias;
           System.out.println("Valor para se pagar pela hospedagem: R$"+valorTotal);
        }
        else if(qtdHospedes>8){
           valorDia = qtdHospedes * 80; 
           valorTotal = valorDia * qtdDias;
           System.out.println("Valor para se pagar pela hospedagem: R$"+valorTotal);
        }
    }
    
}
