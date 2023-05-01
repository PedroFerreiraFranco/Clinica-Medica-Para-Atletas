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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);    
        Scanner entrada2= new Scanner(System.in); 
        Scanner entrada3= new Scanner(System.in); 
      
        Double IMC;
        
        System.out.println("***Utilize virgula para a altura e peso***");
        System.out.println("        **Exemplo** \n*(Digite sua altura: 1,84)*\n *(Digite seu peso: 72,8)*\n\n ");
        System.out.print("Digite sua altura: ");
        Double altura = entrada.nextDouble();
        System.out.print("Digite seu peso: ");
        Double peso = entrada2.nextDouble();        
        System.out.println("Digite seu sexo [m]mulher ou [h]homem: ");
        String sexo = entrada3.nextLine();
        
        IMC = (peso/(Math.pow(altura, 2)));

        switch(sexo) {
            case "m":
            if(IMC<19.1){
            System.out.println("Abaixo do peso: "+IMC); 
            }
            else if (IMC >= 19.1 && IMC <= 25.8){
            System.out.println("Peso ideal: "+IMC); 
            }
            else{
            System.out.println("Acima do peso: "+IMC);        
            }
            break;
        
            case "h":
            if(IMC<20.7){
            System.out.println("Abaixo do peso: "+IMC); 
            }
            else if (IMC >= 20.7 && IMC <= 25.8){
            System.out.println("Peso ideal: "+IMC); 
            }
            else{
            System.out.println("Acima do peso: "+IMC);        
            }
            break;
    }
}
}
