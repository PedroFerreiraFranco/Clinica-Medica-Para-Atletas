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
public class Recepcionista extends Cargos {
    
       @Override // anotação de método reescrito
    public double getBonificacao() {
        return super.getValorSalario() +200;
    }
}
