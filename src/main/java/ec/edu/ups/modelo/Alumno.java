/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author NANCY
 */
public class Alumno implements Serializable {

    private int codigo;
    private String comportamiento;
    private Curso curso;
    private String cedula;
    private String nombreApellido;


    public Alumno() {
    }

    public Alumno(int codigo, String comportamiento, Curso curso, String cedula, String nombreApellido) {
        this.codigo = codigo;
        this.comportamiento = comportamiento;
        this.curso = curso;
        this.cedula = cedula;
        this.nombreApellido = nombreApellido;
    }

    public Alumno(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }


    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombreApellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombreApellido, other.nombreApellido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", comportamiento=" + comportamiento + ", curso=" + curso + ", cedula=" + cedula + ", nombreApellido=" + nombreApellido + '}';
    }

}
