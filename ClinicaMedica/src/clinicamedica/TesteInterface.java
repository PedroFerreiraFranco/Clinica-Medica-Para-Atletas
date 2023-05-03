/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TesteInterface {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        List<Pagavel> listaPagavel = new ArrayList<>();
        
        System.out.print("Digite o valor do primeiro salario: ");
        listaPagavel.add(new Especialidades((float) entrada.nextDouble()));
        System.out.print("Digite o valor do segundo salario: ");
        listaPagavel.add(new Especialidades((float) entrada.nextDouble()));
        
        double totalSalarios = 0.0;
        
        for (Pagavel pagavel : listaPagavel) {
            totalSalarios += pagavel.getSalario();
}
System.out.println("Total da soma dos salários: " + totalSalarios);
    }
}
