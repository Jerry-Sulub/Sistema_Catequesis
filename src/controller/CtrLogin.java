/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.Login;
import view.Principal;

/**
 *
 * @author Gerardo
 */
public class CtrLogin implements ActionListener, MouseListener{
    
    private Login login;
    
    public CtrLogin(Login login){
        this.login = login;
        this.login.setVisible(true);
        this.login.setLocationRelativeTo(null);
        this.login.btnIniciarSesion.addActionListener(this);
        this.login.btnCerrar.addMouseListener(this);
        this.login.btnMinimizar.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String pwd = String.valueOf(this.login.jpwd.getPassword());
        if(pwd.equals("admin")){
            Principal principal = new Principal();
            CtrPrincipal Cprincipal = new CtrPrincipal(principal);
            this.login.dispose();
        }else{
            JOptionPane.showMessageDialog(login, "Contraseña inválida", "Error al acceder al sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        if(arg0.getSource()==this.login.btnCerrar){
            System.exit(0);
        }else{
            if(arg0.getSource()==this.login.btnMinimizar){
                this.login.setExtendedState(JFrame.ICONIFIED);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        if(arg0.getSource()==this.login.btnCerrar){
            this.login.btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }else{
            if(arg0.getSource()==this.login.btnMinimizar){
                this.login.btnMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }
}
