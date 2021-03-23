/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.UIManager;
import view.CargaInicial;
import view.Login;

/**
 *
 * @author Gerardo
 */
public class CtrCargaInicial implements MouseListener{
    
    private CargaInicial cargaInicial;
    
    public CtrCargaInicial(CargaInicial cargaInicial){
        this.cargaInicial = cargaInicial;
        //this.cargaInicial.screenCarga.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
     
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
     
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        //this.cargaInicial.screenCarga.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }
}
