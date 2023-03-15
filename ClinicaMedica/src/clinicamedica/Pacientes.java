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
class Pacientes {
    private String nomePaciente, rgPaciente, cpfPaciente, telefonePaciente;    
    
    public void mostra(){
    System.out.println("\n*****Mostrando Dados do Paciente*****");
    System.out.println("Nome: "+this.getNomePaciente());
    System.out.println("RG: "+this.getRgPaciente());
    System.out.println("CPF: "+this.getCpfPaciente());
    System.out.println("Telefone: "+this.getTelefonePaciente());

}

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }
    
}
