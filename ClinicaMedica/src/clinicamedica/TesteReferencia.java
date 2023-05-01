/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

/**
 *
 * @author pedro
 */
public class TesteReferencia {
    public static void main(String[] args) {
    Especialidades especialidade = new Especialidades("Cardiologia", 10000.0f);
    Medicos medico = new Medicos("João Silva", "123456", "7891011", "11999999999", especialidade);
    
    
    
    medico.mostra();
    }
}
