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
public class Medicos{
   private String nomeMedico;
   private String crm;
   private String rgMedico;
   private String telefoneMedico;
   private Especialidades especialidade;

   public Medicos(String nomeMedico, String crm, String rgMedico, String telefoneMedico, Especialidades especialidade) {
      this.nomeMedico = nomeMedico;
      this.crm = crm;
      this.rgMedico = rgMedico;
      this.telefoneMedico = telefoneMedico;
      this.especialidade = especialidade;
   }
    
    public void mostra(){
    System.out.println("\n*****Mostrando Dados do Médico*****");
    System.out.println("Nome: "+this.getNomeMedico());
    System.out.println("RG: "+this.getRgMedico());
    System.out.println("CRM: "+this.getCrm());
    System.out.println("Telefone: "+this.getTelefoneMedico());
    System.out.println("Especialidade:  "+this.especialidade.getNomeEspecialidade());
    System.out.println("Salario: "+this.especialidade.getSalarioEspecialidade());
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
}
