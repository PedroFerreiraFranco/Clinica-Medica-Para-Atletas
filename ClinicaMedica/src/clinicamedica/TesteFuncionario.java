/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TesteFuncionario {
       public static void main(String[] args) {
        
        Funcionarios f1 = new Funcionarios();
        Funcionarios f2 = new Recepcionista();
        Scanner entrada = new Scanner(System.in);
        
        f1.setNomeFuncionario("Ryan");
        f1.setCpfFuncionario("17352499825");
        f1.setRgFuncionario("MG-21.124.365");
        f1.setTelefoneFuncionario("(35)998084126");
        System.out.print("Cargo: ");
        f1.setNomeCargo(entrada.next());               
        System.out.print("Salario: ");
        f1.setValorSalario(entrada.nextDouble());
        System.out.print("Bonificação: ");
        f1.bonifica(entrada.nextDouble());
           
        System.out.println("\n\n");
        
        f2.setNomeFuncionario("Gustavo");
        f2.setCpfFuncionario("17478492325");
        f2.setRgFuncionario("MG-35.250.852");
        f2.setTelefoneFuncionario("(35)9882510");
        System.out.print("Bonificação: ");
        f2.bonifica(entrada.nextDouble());
        
        f1.mostra();    
        f2.mostra();
       
    }
}
