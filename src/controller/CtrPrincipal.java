/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import view.Alumno;
import view.Catequista;
import view.Oraciones;
import view.Principal;
import view.Tutores;

/**
 *
 * @author Gerardo
 */
public class CtrPrincipal implements ActionListener, MouseListener, MouseMotionListener{
    
    private Principal principal;
    
    public CtrPrincipal(Principal principal){
        this.principal = principal;
        this.principal.setVisible(true);
        this.principal.btnAlumno.addActionListener(this);
        this.principal.btnCatequista.addActionListener(this);
        this.principal.btnTutor.addActionListener(this);
        this.principal.btnOracion.addActionListener(this);
        this.principal.lblTitulo.addMouseListener(this);
        this.principal.lblTitulo.addMouseMotionListener(this);
        this.principal.lblCerrar.addMouseListener(this);
        this.principal.lblMaximizar.addMouseListener(this);
        this.principal.lblminimizar.addMouseListener(this);
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
    
    private boolean max = false;
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        if(arg0.getSource()==this.principal.lblCerrar){
            System.exit(0);
        }else{
            if(arg0.getSource()==this.principal.lblMaximizar && max!=true){
               this.principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }else{
               if(arg0.getSource()==this.principal.lblMaximizar && max!=false){
                   
               }
            }
        }
        if(arg0.getSource()==this.principal.lblminimizar){
            this.principal.setExtendedState(JFrame.ICONIFIED);
        }
    }
    
    private int x=0, y=0;
    @Override
    public void mousePressed(MouseEvent arg0) {
        x = arg0.getX();
        y = arg0.getY();
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        if(arg0.getSource()==this.principal.lblCerrar){
            this.principal.lblCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }else{
            if(arg0.getSource()==this.principal.lblMaximizar){
               this.principal.lblMaximizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }else{
                if(arg0.getSource()==this.principal.lblminimizar){
                   this.principal.lblminimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
   
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        int x2 = arg0.getXOnScreen();
        int y2 = arg0.getYOnScreen();
        this.principal.setLocation(x2-x, y2-y);
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        
    }
    
}
