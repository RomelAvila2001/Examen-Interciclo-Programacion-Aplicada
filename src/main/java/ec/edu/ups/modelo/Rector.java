/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author NANCY
 */
public class Rector extends Persona implements Serializable{
    private String correo;
    private String contrase;

    public Rector() {
    }

    public Rector(String correo, String contrase, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.correo = correo;
        this.contrase = contrase;
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

    @Override
    public String toString() {
        return "Rector{" + "correo=" + correo + ", contrase=" + contrase + '}';
    }
    
    
}
