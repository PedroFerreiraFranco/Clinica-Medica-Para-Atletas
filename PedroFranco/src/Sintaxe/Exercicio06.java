/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 17352499636
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner entrada2= new Scanner(System.in);
        
        System.out.print("Digite o comprimento do retangulo: ");
        Double comprimento = entrada.nextDouble();
        System.out.print("Digite o comprimento do largura: ");
        Double largura = entrada.nextDouble();
        
        if(Objects.equals(largura, comprimento)){
            System.out.println("O objeto é um quadrado");  
        }
        else{
            System.out.println("O objeto é um retângulo");
        }  
        System.out.println("Perimetro: "+((largura*2)+(comprimento*2)));
        System.out.println("Área: "+(largura*comprimento));
    }
}
