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
public class TesteFuncionario {
       public static void main(String[] args) {
        
        Funcionarios f1 = new Funcionarios();
        
        f1.setNomeFuncionario("Ryan");
        f1.setCpfFuncionario("17352499825");
        f1.setRgFuncionario("MG-21.124.365");
        f1.setTelefoneFuncionario("(35)998084126");
        f1.mostra();
                      
        Cargos objFuncionario = new Recepcionista();
        objFuncionario.setValorSalario(1800.00);
        System.out.println("Salário recepcionista com binificação: " 
                + objFuncionario.getBonificacao());
    }
}
