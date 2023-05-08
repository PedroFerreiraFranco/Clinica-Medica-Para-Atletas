/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

/**
 *
 * @author 17352499636
 */
public class Funcionarios extends Cargos{
    private String cpfFuncionario, nomeFuncionario, rgFuncionario, telefoneFuncionario;
    
    public void mostra(){
    System.out.println("\n*****Mostrando Dados Funcionário*****");
    System.out.println("Nome: "+this.getNomeFuncionario());
    System.out.println("RG: "+this.getRgFuncionario());
    System.out.println("CPF: "+this.getCpfFuncionario());
    System.out.println("Telefone: "+this.getTelefoneFuncionario());
        System.out.println("Cargo: "+this.getNomeCargo());
        System.out.println("Salario: "+this.getValorSalario());

}

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }
    

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }


    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
