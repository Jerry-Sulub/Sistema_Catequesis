/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import view.AlumnoView;
import view.Catequista;
import view.Oraciones;
import view.Principal;
import view.Tutores;
import model.AlumnoOperation;
import model.AlumnoModel;

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
        
        this.principal.separadorAlumno.setVisible(false);
        this.principal.separadorCatequista.setVisible(false);
        this.principal.separadorTutor.setVisible(false);
        this.principal.separadorOracion.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.principal.btnAlumno){
                AlumnoView alumnoView = new AlumnoView();
                AlumnoModel alumno = new AlumnoModel();
                AlumnoOperation alumnoModel = new AlumnoOperation();
                CtrlAlumno ctrAlumno = new CtrlAlumno(alumno, alumnoModel, alumnoView);
                this.principal.contenido.remove(this.principal.panelContenido);
                this.principal.panelContenido = alumnoView;
                this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                this.principal.panelContenido.revalidate();
                this.principal.panelContenido.repaint();
                /*SEPARADORES*/
                this.principal.separadorAlumno.setVisible(true);
                this.principal.separadorCatequista.setVisible(false);
                this.principal.separadorTutor.setVisible(false);
                this.principal.separadorOracion.setVisible(false);
                /*CAMBIO DE ICONO*/
                /*ALUMNO*/
                this.principal.btnAlumno.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/alumno_selected.png")));
                this.principal.btnAlumno.setForeground(new Color(0,176,240));
                /*CATEQUISTA*/
                this.principal.btnCatequista.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/Catequista.png"))); // NOI18N
                this.principal.btnCatequista.setForeground(new Color(255, 255, 255));
                /*PADRES*/
                this.principal.btnTutor.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/tutores.png")));
                this.principal.btnTutor.setForeground(new Color(255, 255, 255));
                /*ORACIONES*/
                this.principal.btnOracion.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/oraciones.png"))); // NOI18N
                this.principal.btnOracion.setForeground(new Color(255, 255, 255));
        }else{
            if(arg0.getSource()==this.principal.btnCatequista){
                Catequista catequista = new Catequista();
                this.principal.contenido.remove(this.principal.panelContenido);
                this.principal.panelContenido = catequista;
                this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                this.principal.panelContenido.revalidate();
                this.principal.panelContenido.repaint();
                /*SEPARADORES*/
                this.principal.separadorAlumno.setVisible(false);
                this.principal.separadorCatequista.setVisible(true);
                this.principal.separadorTutor.setVisible(false);
                this.principal.separadorOracion.setVisible(false);
                /*CAMBIO DE ICONO*/
                /*ALUMNO*/
                this.principal.btnAlumno.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/alumno.png")));
                this.principal.btnAlumno.setForeground(new Color(255, 255, 255));
                /*CATEQUISTA*/
                this.principal.btnCatequista.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/Catequista_selected.png"))); // NOI18N
                this.principal.btnCatequista.setForeground(new Color(0,176,240));
                /*PADRES*/
                this.principal.btnTutor.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/tutores.png")));
                this.principal.btnTutor.setForeground(new Color(255, 255, 255));
                /*ORACIONES*/
                this.principal.btnOracion.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/oraciones.png"))); // NOI18N
                this.principal.btnOracion.setForeground(new Color(255, 255, 255));
            }else{
                if(arg0.getSource()==this.principal.btnTutor){
                    Tutores tutores = new Tutores();
                    this.principal.contenido.remove(this.principal.panelContenido);
                    this.principal.panelContenido = tutores;
                    this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                    this.principal.panelContenido.revalidate();
                    this.principal.panelContenido.repaint();
                    /*SEPARADORES*/
                    this.principal.separadorAlumno.setVisible(false);
                    this.principal.separadorCatequista.setVisible(false);
                    this.principal.separadorTutor.setVisible(true);
                    this.principal.separadorOracion.setVisible(false);
                    /*CAMBIO DE ICONO*/
                    /*ALUMNO*/
                    this.principal.btnAlumno.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/alumno.png")));
                    this.principal.btnAlumno.setForeground(new Color(255, 255, 255));
                    /*CATEQUISTA*/
                    this.principal.btnCatequista.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/Catequista.png"))); // NOI18N
                    this.principal.btnCatequista.setForeground(new Color(255, 255, 255));
                    /*PADRES*/
                    this.principal.btnTutor.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/tutores_selected.png")));
                    this.principal.btnTutor.setForeground(new Color(0,176,240));
                    /*ORACIONES*/
                    this.principal.btnOracion.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/oraciones.png"))); // NOI18N
                    this.principal.btnOracion.setForeground(new Color(255, 255, 255));                    
                }else{
                    if(arg0.getSource()==this.principal.btnOracion){
                        Oraciones oraciones = new Oraciones();
                        this.principal.contenido.remove(this.principal.panelContenido);
                        this.principal.panelContenido = oraciones;
                        this.principal.contenido.add(this.principal.panelContenido, BorderLayout.CENTER);
                        this.principal.panelContenido.revalidate();
                        this.principal.panelContenido.repaint();
                        /*SEPARADORES*/
                        this.principal.separadorAlumno.setVisible(false);
                        this.principal.separadorCatequista.setVisible(false);
                        this.principal.separadorTutor.setVisible(false);
                        this.principal.separadorOracion.setVisible(true);
                        /*CAMBIO DE ICONO*/
                        /*ALUMNO*/
                        this.principal.btnAlumno.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/alumno.png")));
                        this.principal.btnAlumno.setForeground(new Color(255, 255, 255));
                        /*CATEQUISTA*/
                        this.principal.btnCatequista.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/Catequista.png"))); // NOI18N
                        this.principal.btnCatequista.setForeground(new Color(255, 255, 255));
                        /*PADRES*/
                        this.principal.btnTutor.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/tutores.png")));
                        this.principal.btnTutor.setForeground(new Color(255, 255, 255));
                        /*ORACIONES*/
                        this.principal.btnOracion.setIcon(new ImageIcon(getClass().getResource("/view/img/menu/oraciones_selected.png"))); // NOI18N
                        this.principal.btnOracion.setForeground(new Color(0,176,240));
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
               this.max = true;
            }else{
               if(arg0.getSource()==this.principal.lblMaximizar && max!=false){
                   this.principal.setSize(921, 547);
                   this.principal.setLocationRelativeTo(null);
                   this.max=false;
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
