package clinicamedica;

import java.util.Scanner;

public class ClinicaMedica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                         
        Funcionarios f1 = new Funcionarios();
        
       /* System.out.print("Digite o nome do(a) Funcionario(a): ");
        f1.setNomeFuncionario(entrada.next());
        System.out.print("Digite o rg do(a) Funcionario(a): ");
        f1.setRgFuncionario(entrada.next());
        System.out.print("Digite o CPF do(a) Funcionario(a): ");
        f1.setCpfFuncionario(entrada.next());
        System.out.print("Digite o telefone do(a) Funcionario(a): ");
        f1.setTelefoneFuncionario(entrada.next()); 
        System.out.print("Digite o cargo do(a) Funcionario(a): ");
        cargos.setNomeCargo(entrada.next());
        System.out.print("Valor salarial do(a) Funcionario(a): ");
        cargos.setValorSalario(entrada.nextDouble());*/
        f1.setNomeFuncionario("Ryan");
        f1.setCpfFuncionario("17352499825");
        f1.setRgFuncionario("MG-21.124.365");
        f1.setTelefoneFuncionario("(35)998084126");
        f1.mostra();
        /*-------------------------------------------------------------*/ 
        
        Medicos med1 = new Medicos();
        Especialidades especialidades = new Especialidades();
        
        /*System.out.println("\n\n\n");
        System.out.print("Digite o nome do médico: ");
        med1.setNomeMedico(entrada.next());
        System.out.print("Digite o CRM do médico: ");
        med1.setCrm(entrada.next());
        System.out.print("Digite o RG do médico: ");
        med1.setRgMedico(entrada.next());
        System.out.print("Digite o telefone do médico: ");
        med1.setTelefoneMedico(entrada.next());
        System.out.print("Especialidade do médido: ");
        especialidades.setNomeEspecialidade(entrada.next());
        System.out.print("Salário do médido: ");
        especialidades.setSalarioEspecialidade(entrada.nextDouble());*/
        especialidades.setNomeEspecialidade("Cardiologista");
        especialidades.setSalarioEspecialidade(27500.00);
        med1.setNomeMedico("Gustavo");
        med1.setCrm("35712547-5/BR");
        med1.setRgMedico("SP-21.124.253");
        med1.setTelefoneMedico("(31)987254632");
        med1.mostra();
        
        
        System.out.println("Especialidade: "+especialidades.getNomeEspecialidade());
        System.out.println("Salario do Médico: "+especialidades.getSalarioEspecialidade());
        
        Pacientes p1 = new Pacientes();
        
        /*System.out.println("\n\n\n");
        System.out.print("Digite o nome do(a) Paciente: ");
        p1.setNomePaciente(entrada.next());
        System.out.print("Digite o CPF do(a) Paciente: ");
        p1.setRgPaciente(entrada.next());
        System.out.print("Digite o RG do(a) Paciente: ");
        p1.setCpfPaciente(entrada.next());
        System.out.print("Digite o telefone do(a) Paciente: ");
        p1.setTelefonePaciente(entrada.next());*/
        p1.setNomePaciente("Pedro");
        p1.setCpfPaciente("351.235.685");
        p1.setRgPaciente("MG-21.233.443");
        p1.setTelefonePaciente("(35)998055210");
        p1.mostra();
        
        Consulta c1 = new Consulta();
        
        /*System.out.println("\n\n\n");
        System.out.print("Data desejada para a consulta: ");
        c1.setDataConsulta(entrada.next());
        System.out.print("Valor cobrado pela consulta: ");
        c1.setValorConsulta(entrada.nextDouble());*/
        c1.setDataConsulta("27/12/2023");
        c1.setValorConsulta(175.75);
        
        System.out.println("\n*****Mostrando Dados da Consulta*****");
        System.out.println("Nome do paciente: "+p1.getNomePaciente());
        System.out.println("Medico que ira fazer a consulta: "+med1.getNomeMedico());
        System.out.println("Data agendada: "+c1.getDataConsulta());
        System.out.println("Valor cobrado: "+c1.getValorConsulta());
        
        System.out.println("\n\n\n");
        System.out.println("Salario do medico(a) "+med1.getNomeMedico()+" apos a consulta com bonificacao de 70%: "+(especialidades.getSalarioEspecialidade())+(c1.getValorConsulta()*0.7));

    }
    
}
