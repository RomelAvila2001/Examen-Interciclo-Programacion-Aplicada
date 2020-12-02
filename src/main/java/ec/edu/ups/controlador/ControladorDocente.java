/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Docente;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorDocente extends Controlador<Docente>{

    public ControladorDocente(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Docente obj) {
        return true;
    }
    
   public Docente iniciarSesion(String correo, String contrase) {
        
       var listaDocente= (List<Docente>) getListaGenerica();
        
        Docente docente= listaDocente.stream().filter(dosen-> dosen.getCorreo().equals(correo)&& dosen.getContrase().equals(contrase)).findAny().get();
        
        if(docente!=null){
            return Docente.getInstance();
        }
        return null;
        
        /*for (Docente docente : (List<Docente>) getListaGenerica()) {
            if (docente.getCorreo().equals(correo) && docente.getContrase().equals(contrase)) {
                return docente;
            }
        }
        return null;*/
   } 
}
