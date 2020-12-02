/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Objects;

/**
 *
 * @author NANCY
 */
public class Docente implements Serializable {

    private int codigo;
    private String correo;
    private String contrase;
    
    private Curso curso;
    public static Docente instance;
    
    private String cedula;
    private String nombre;
    private String apellido;

    private Docente() {
    }
    private Docente(int codigo, String correo, String contrase, Curso curso, String cedula, String nombre, String apellido) {
        this.codigo = codigo;
        this.correo = correo;
        this.contrase = contrase;
        this.curso = curso;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public static Docente getInstance(){
        if(Docente.instance==null){
            Constructor<Docente> constructor;
            try{
                constructor=Docente.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                
                Docente docente=constructor.newInstance();
                
                Docente.instance=docente;
            }catch(Exception e){
                e.printStackTrace();
            }
            return Docente.instance;
        }
        return Docente.instance;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrase() {
        return contrase;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.correo);
        hash = 97 * hash + Objects.hashCode(this.contrase);
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
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contrase, other.contrase)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", correo=" + correo + ", contrase=" + contrase + ", curso=" + curso + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    

    

}
