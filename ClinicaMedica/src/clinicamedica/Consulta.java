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
public class Consulta {
    private String dataConsulta;
    private Double valorConsulta;
    private Medicos medicos = new Medicos();
    private Pacientes Pacientes = new Pacientes();

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }

    public Pacientes getPacientes() {
        return Pacientes;
    }

    public void setPacientes(Pacientes Pacientes) {
        this.Pacientes = Pacientes;
    }
    
    
}
