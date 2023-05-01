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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entradaParedeAltura = new Scanner(System.in);
        Scanner entradaParedeLargura = new Scanner(System.in);
        Scanner entradaAzulejoAltura = new Scanner(System.in);
        Scanner entradaAzulejoLargura = new Scanner(System.in);
        
        
        System.out.println("***Digite os dados em CM*** ");
        System.out.print("Digite a altura da sua parede: ");
        Double HP = entradaParedeAltura.nextDouble();
        System.out.print("Digite a largura da sua parede: ");
        Double LP = entradaParedeLargura.nextDouble();
        System.out.print("Digite a altura do azulejo: ");
        Double HA = entradaAzulejoAltura.nextDouble();
        System.out.print("Digite a largura do azulejo: ");
        Double LA = entradaAzulejoLargura.nextDouble();
        
        Double totalParede = HP*LP;
        Double totalAzulejo = HA*LA;
        
        Double qtd = totalParede/totalAzulejo;
        
        System.out.println("A quantidade de azulejos necessarios: "+qtd);
    }
}
