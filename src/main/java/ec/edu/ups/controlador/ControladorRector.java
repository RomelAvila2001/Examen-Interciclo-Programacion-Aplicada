/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Rector;

/**
 *
 * @author NANCY
 */
public class ControladorRector {

    Rector rector = new Rector("rector","123","0123456789", "Juan", "Perez");
    
    public Rector iniciarSesion(String correo, String contrase){
        if (rector.getCorreo().equals(correo) && rector.getContrase().equals(contrase)) {
            return rector;
        }
        return null;
    }
}
