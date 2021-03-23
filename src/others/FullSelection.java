/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.awt.event.FocusAdapter;

/**
 *
 * @author Gerardo
 */
public class FullSelection extends FocusAdapter{
    public FullSelection(){
        
    }
    
    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
 
    }
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        Object o = evt.getSource();
        if(o instanceof javax.swing.JTextField){
            javax.swing.JTextField txt = (javax.swing.JTextField) o;
            txt.setSelectionStart(0);
            txt.setSelectionEnd(txt.getText().length());
        }
    }
}
