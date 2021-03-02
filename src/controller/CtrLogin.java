/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Login;
import view.Principal;

/**
 *
 * @author Gerardo
 */
public class CtrLogin implements ActionListener{
    
    private Login login;
    
    public CtrLogin(Login login){
        this.login = login;
        this.login.setVisible(true);
        this.login.setLocationRelativeTo(null);
        this.login.btnIniciarSesion.addActionListener(this);
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
}
