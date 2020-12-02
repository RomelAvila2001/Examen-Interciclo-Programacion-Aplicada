/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Alumno;

/**
 *
 * @author NANCY
 */
public class ControladorAlumno extends Controlador<Alumno>{

    public ControladorAlumno(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Alumno obj) {
        return true;
    }
    
}
