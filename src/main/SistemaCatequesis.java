/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.CtrCargaInicial;
import controller.CtrPrincipal;
import view.CargaInicial;
import view.Principal;

/**
 *
 * @author Gerardo
 */
public class SistemaCatequesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CargaInicial carga = new CargaInicial();
        CtrCargaInicial ctrCarga = new CtrCargaInicial(carga);
        System.out.println("Hello world");
    }
    
}
