package org.idnp.labidnp_03;

import java.io.Serializable;

public class Postulante implements Serializable {
    private String apellidoPaterno, apellidoMaterno, nombres, fechaNacimiento, colegioProcedencia, carreraPostula;

    public Postulante(String ap, String am, String n, String f, String col, String carr){
        apellidoPaterno=ap;
        apellidoMaterno=am;
        nombres=n;
        fechaNacimiento=f;
        colegioProcedencia=col;
        carreraPostula=carr;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColegioProcedencia() {
        return colegioProcedencia;
    }

    public void setColegioProcedencia(String colegioProcedencia) {
        this.colegioProcedencia = colegioProcedencia;
    }

    public String getCarreraPostula() {
        return carreraPostula;
    }

    public void setCarreraPostula(String carreraPostula) {
        this.carreraPostula = carreraPostula;
    }
}