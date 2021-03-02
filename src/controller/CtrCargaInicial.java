/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.UIManager;
import view.CargaInicial;
import view.Login;

/**
 *
 * @author Gerardo
 */
public class CtrCargaInicial {
    
    private CargaInicial cargaInicial;
    
    public CtrCargaInicial(CargaInicial cargaInicial){
        this.cargaInicial = cargaInicial;
        cargaScreen();
    }
    
    private void cargaScreen(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                cargaInicial.setVisible(true);
            }
        });
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(40);
                this.cargaInicial.barra.setValue(i);
                this.cargaInicial.barra.setString(String.valueOf("Cargando: "+i+"%..."));
                UIManager.put( "nimbusOrange", new Color( 38, 139, 210 ) );
            }
        } catch (Exception e) {
            System.out.println("Error en: "+e.getClass()+"\n"+e.getMessage());
        }
        Login login = new Login();
        CtrLogin Clogin = new CtrLogin(login);
        this.cargaInicial.dispose();
    }
}
