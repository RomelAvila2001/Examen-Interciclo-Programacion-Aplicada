/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Curso;

/**
 *
 * @author NANCY
 */
public class ControladorCurso extends Controlador<Curso>{

    public ControladorCurso(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Curso obj) {
       return true;
    }
    
}
