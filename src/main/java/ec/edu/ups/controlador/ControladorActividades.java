/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Actividades;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NANCY
 */
public class ControladorActividades extends Controlador<Actividades>{

    public ControladorActividades(String ruta) {
        super(ruta);
    }
    
    private Pattern patron;
    private Matcher corpus;
    
    public Pattern getPatron() {
        return patron;
    }

    public void setPatron(Pattern patron) {
        this.patron = patron;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
    
   public void ingresarRegex(String regex){
        patron= Pattern.compile(regex);
    }
    
    public boolean validarE(String texto){
        corpus=patron.matcher(texto);
        return corpus.find();
    }
    
    public Set<String> obtenerUrlGoogle(String paginaText){
        Set<String> resultado= new HashSet();
        corpus= patron.matcher(paginaText);
         while(corpus.find()){
           /* for (int i = 0; i < corpus.groupCount(); i++) {
                resultado.add(corpus.group(i));
            }*/
           resultado.add(corpus.group(0));
        }
        return resultado;
    }

    @Override
    public boolean validar(Actividades obj) {
       return true;
    }
    
    
    
}
