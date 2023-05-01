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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaConstruida = new Scanner(System.in);
        
        System.out.println("***Digite as medidas em Metros***");
        System.out.print("Area total do terreno: ");
        Double AT = entrada.nextDouble();
        System.out.print("Area construida do terreno: ");
        Double AC = entradaConstruida.nextDouble();
        
        Double ANC = AT-AC;
        Double somaValor = ((ANC*3.80)+(AC*5));
        
        System.out.println("Valor pela area construida: "+AC*5);
        System.out.println("Valor pela area nao construida: "+ANC*3.8);
        System.out.println("Valor total: "+somaValor);
        
    }
}
