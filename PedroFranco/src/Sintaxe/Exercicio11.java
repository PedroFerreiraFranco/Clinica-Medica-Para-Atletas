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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entradaDias = new Scanner(System.in);
        Scanner entradaKm = new Scanner(System.in);
        
        System.out.print("Quantidade de dias que o cliente ficou com o carro: ");
        Integer dias = entradaDias.nextInt();
        System.out.print("Quantidade de KMs que o cliente dirigiu com o carro: ");
        Double km = entradaKm.nextDouble();
        Integer kmTotal;
        kmTotal = dias * 60;
        
        if(km>kmTotal){                   
                    Double valorFixo = dias * 45.00;
                    Double valorAdicional = ((km-kmTotal) * 0.50);
                    Double valorTotal = valorFixo + valorAdicional;
                    
        System.out.println("Valor dos dias em que o carro foi alugado: R$"+valorFixo);
        System.out.println("Valor adicional sobre quilometragem excedida: R$"+valorAdicional);
        System.out.println("Valor total a ser pago: R$"+valorTotal);
        }
        else if(kmTotal>km){
                    Double valorFixo = dias * 45.00;
                    Double valorAdicional = ((km-kmTotal) * 0);
                    Double valorTotal = valorFixo + valorAdicional;
                    
        System.out.println("Valor dos dias em que o carro foi alugado: R$"+valorFixo);
        System.out.println("Valor adicional sobre quilometragem excedida: R$"+valorAdicional);
        System.out.println("Valor total a ser pago: R$"+valorTotal);    
        }
    
   }
}
