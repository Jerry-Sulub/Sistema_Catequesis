/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Alumno;
import view.Catequista;
import view.Oraciones;
import view.Principal;
import view.Tutores;

/**
 *
 * @author Gerardo
 */
public class CtrPrincipal implements ActionListener{
    
    private Principal principal;
    
    public CtrPrincipal(Principal principal){
        this.principal = principal;
        this.principal.setVisible(true);
        this.principal.btnAlumno.addActionListener(this);
        this.principal.btnCatequista.addActionListener(this);
        this.principal.btnTutor.addActionListener(this);
        this.principal.btnOracion.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.principal.btnAlumno){
                Alumno alumno = new Alumno();
                this.principal.contenido.remove(this.principal.panelContenido);
                this.principal.panelContenido = alumno;
                this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                this.principal.panelContenido.revalidate();
                this.principal.panelContenido.repaint();
        }else{
            if(arg0.getSource()==this.principal.btnCatequista){
                Catequista catequista = new Catequista();
                this.principal.contenido.remove(this.principal.panelContenido);
                this.principal.panelContenido = catequista;
                this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                this.principal.panelContenido.revalidate();
                this.principal.panelContenido.repaint();
            }else{
                if(arg0.getSource()==this.principal.btnTutor){
                    Tutores tutores = new Tutores();
                    this.principal.contenido.remove(this.principal.panelContenido);
                    this.principal.panelContenido = tutores;
                    this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                    this.principal.panelContenido.revalidate();
                    this.principal.panelContenido.repaint();
                }else{
                    if(arg0.getSource()==this.principal.btnOracion){
                        Oraciones oraciones = new Oraciones();
                        this.principal.contenido.remove(this.principal.panelContenido);
                        this.principal.panelContenido = oraciones;
                        this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                        this.principal.panelContenido.revalidate();
                        this.principal.panelContenido.repaint();
                    }
                }
            }
        }
    }
    
}
