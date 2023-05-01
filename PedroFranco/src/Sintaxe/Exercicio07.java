/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;

import java.util.Scanner;

/**
 *
 * @author 17352499636
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        Integer cont;
        float total = 0, nota=0, media=0;
                
        for(cont=1;cont<=4;cont++){
            System.out.print("Digite a sua "+cont+"ª nota: ");
            nota = (float) entrada.nextFloat();
            
        total = total + nota;
        }
        
        media = total/4;
        
        if(media<3.50){
        System.out.println("Reprovado com nota:"+media);
                }
        else if(media>=3.5 && media<=6.49){
        System.out.println("Recuperação com nota:"+media);
                }
        else if(media>=6.5){
        System.out.println("Aprovado com nota:"+media);
                }
    }
}
