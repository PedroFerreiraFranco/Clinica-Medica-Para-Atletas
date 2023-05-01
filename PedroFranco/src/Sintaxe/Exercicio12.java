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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entradaSalario = new Scanner(System.in);
        
        System.out.print("Digite seu salario: R$");
        Double salario = entradaSalario.nextDouble();
        
                    Double valor = null;
                            
        if(salario>0 && salario<10800.00){
            System.out.println("Voce esta isento de imposto");
        }
        else if(salario>=10800.00 && salario<=21600.00){
            valor = ((salario*0.15)-1620.00);
            System.out.println("Voce deve pagar R$"+valor+" de imposto");
        }
        else if(salario>=21600.00){
            valor = ((salario*0.275)-4320.00);
            System.out.println("Voce deve pagar R$"+valor+" de imposto");
        }
        else if(salario<=0){
            System.out.println("Valor invalido");
        }
    }
}
