/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author NANCY
 */
public class Actividades {
    private String nombre;
    private Set<String>Aplicaciones;
    private Curso curso;

    public Actividades() {
    }

    
    public Actividades(String nombre, Set<String> Aplicaciones, Curso curso) {
        this.nombre = nombre;
        this.Aplicaciones = Aplicaciones;
        this.curso = curso;
    }

    public Actividades(String nombre, Set<String> Aplicaciones) {
        this.nombre = nombre;
        this.Aplicaciones = Aplicaciones;
    }
    

    public Actividades(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<String> getAplicaciones() {
        return Aplicaciones;
    }

    public void setAplicaciones(Set<String> Aplicaciones) {
        this.Aplicaciones = Aplicaciones;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nombre);
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
        final Actividades other = (Actividades) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Actividades{" + "nombre=" + nombre + ", Aplicaciones=" + Aplicaciones + ", curso=" + curso + '}';
    }
    
    
    
}
