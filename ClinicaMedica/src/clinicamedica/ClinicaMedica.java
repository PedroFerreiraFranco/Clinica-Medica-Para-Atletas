/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

import java.util.Scanner;

/**
 *
 * @author 17352499636
 */
public class ClinicaMedica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cargos cargos = new Cargos();
        cargos.setNomeCargo("Recepcionista");
        cargos.setValorSalario(1200.00);
        
        /*System.out.print("Digite o cargo: ");
        cargos.setNomeCargo(entrada.next());
        System.out.print("Valor salarial: ");
        cargos.setValorSalario(entrada.nextDouble());*/
             
        Funcionarios f1 = new Funcionarios();
        f1.setNomeFuncionario("Gustavo");
        f1.setRgFuncionario("MG-21.000.654");
        f1.setCpfFuncionario("17300954232");
        f1.setTelefoneFuncionario("35998085210");
        
       /* System.out.print("Digite seu nome: ");
        f1.setNomeFuncionario(entrada.next());
        System.out.print("Digite seu rg: ");
        f1.setRgFuncionario(entrada.next());
        System.out.print("Digite seu CPF: ");
        f1.setCpfFuncionario(entrada.next());
        System.out.print("Digite seu telefone: ");
        f1.setTelefoneFuncionario(entrada.next()); 
        f1.setCargoFuncionario(cargos);*/
        f1.mostra();
        System.out.println("Cargo: "+cargos.getNomeCargo());
        System.out.println("Valor Salario: "+cargos.getValorSalario());
        
        /*-------------------------------------------------------------*/
        
        Especialidades especialidades = new Especialidades();
        especialidades.setNomeEspecialidade("Cardiologista");
        especialidades.setSalarioEspecialidade(20000.68);
        
       /* System.out.println("Especialidade do médido: ");
        especialidades.setNomeEspecialidade(entrada.next());
        System.out.println("Salário do médido: ");
        especialidades.setSalarioEspecialidade(entrada.nextDouble());*/
        
        
        
        Medicos med1 = new Medicos();
        med1.setNomeMedico("Pedro");
        med1.setCrm("4548798-MG");
        med1.setRgMedico("MG-16578923789");
        med1.setTelefoneMedico("3598416572");
        
        /*System.out.print("Digite o nome do médico: ");
        med1.setNomeMedico(entrada.next());
        System.out.print("Digite o CRM do médico: ");
        med1.setCrm(entrada.next());
        System.out.print("Digite o RG do médico: ");
        med1.setRgMedico(entrada.next());
        System.out.print("Digite o telefone do médico: ");
        med1.setTelefoneMedico(entrada.next());*/
        med1.mostra();
        System.out.println("Especialidade: "+especialidades.getNomeEspecialidade());
        System.out.println("Salario do Médico: "+especialidades.getSalarioEspecialidade());
        
        Pacientes p1 = new Pacientes();
        
        
        
        Consulta c1 = new Consulta();
    }
    
}
