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
class Especialidades {
    
   private String nomeEspecialidade;
   private float salarioEspecialidade;

   public Especialidades(String nomeEspecialidade, float salarioEspecialidade) {
      this.nomeEspecialidade = nomeEspecialidade;
      this.salarioEspecialidade = salarioEspecialidade;
   }
      public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public float getSalarioEspecialidade() {
        return salarioEspecialidade;
    }

    public void setSalarioEspecialidade(float salarioEspecialidade) {
        this.salarioEspecialidade = salarioEspecialidade;
    }
    
    
}
