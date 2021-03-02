/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Oraciones;

/**
 *
 * @author Gerardo
 */
public class CtrOraciones {
    
    private Oraciones oraciones;
    
    public CtrOraciones(Oraciones oraciones){
        this.oraciones = oraciones;
        this.oraciones.jcomOraciones.setVisible(false);
    }
}
