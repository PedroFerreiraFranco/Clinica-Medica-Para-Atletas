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
public class Medicos {
    private String nomeMedico, crm, rgMedico, telefoneMedico;
    private Especialidades especialidadeMedica = new Especialidades();
    
    public void mostra(){
    System.out.println("\n*****Mostrando Dados do Médico*****");
    System.out.println("Nome: "+this.getNomeMedico());
    System.out.println("RG: "+this.getRgMedico());
    System.out.println("CRM: "+this.getCrm());
    System.out.println("Telefone: "+this.getTelefoneMedico());

}

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getRgMedico() {
        return rgMedico;
    }

    public void setRgMedico(String rgMedico) {
        this.rgMedico = rgMedico;
    }

    public String getTelefoneMedico() {
        return telefoneMedico;
    }

    public void setTelefoneMedico(String telefoneMedico) {
        this.telefoneMedico = telefoneMedico;
    }


    public Especialidades getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(Especialidades especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    
    
     
    
}
