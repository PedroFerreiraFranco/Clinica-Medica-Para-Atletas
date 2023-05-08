/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class TesteReferencia {
    public static void main(String[] args) {

    
    List<Especialidades> listaPagavel = new ArrayList<>();
    
    
        Especialidades especialidade = new Especialidades("Cardiologia", 10000.0f);
    Medicos medico = new Medicos("João Silva", "123456", "7891011", "11999999999", especialidade);
    
        Especialidades especialidade2 = new Especialidades("Ortopedista", 35000.0f);
    Medicos medico2 = new Medicos("Raysson Caproni", "456756", "7825321", "35988359915", especialidade);
    
    listaPagavel.add(especialidade);
    listaPagavel.add(especialidade2);
    
    double totalSalarios = 0.0;
    
     for (Especialidades pagavel : listaPagavel) {
            totalSalarios += pagavel.getSalarioEspecialidade();
        }
    
    medico.mostra();
    medico2.mostra();
    System.out.println("Total da soma dos salários: " + totalSalarios);
    }
}
    
