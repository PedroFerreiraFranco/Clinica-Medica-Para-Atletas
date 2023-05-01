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
public class Exercicio14 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String palavra = entrada.nextLine();
    
    int contador = 0;
    for (int i = 0; i < palavra.length(); i++) {
      if (palavra.substring(i, i + 1).equals("a")||palavra.substring(i, i + 1).equals("A")) {
        contador++;
      }
    }
    
    System.out.println("A palavra '" + palavra + "' possui " + contador + " letra(s) 'a'");
  }
}