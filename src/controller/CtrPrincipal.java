/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Catequista;
import view.Principal;

/**
 *
 * @author Gerardo
 */
public class CtrPrincipal implements ActionListener{
    
    private Principal principal;
    
    public CtrPrincipal(Principal principal){
        this.principal = principal;
        this.principal.btnAlumno.addActionListener(this);
        this.principal.btnCatequista.addActionListener(this);
        this.principal.btnTutor.addActionListener(this);
        this.principal.btnOracion.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.principal.btnAlumno){
            System.out.println("Se selecciono al alumno");
        }else{
            if(arg0.getSource()==this.principal.btnCatequista){
                Catequista catequista = new Catequista();
                this.principal.contenido.remove(this.principal.panelContenido);
                this.principal.contenido.add(catequista);
                this.principal.contenido.revalidate();
                this.principal.contenido.repaint();
            }
        }
    }
    
}
