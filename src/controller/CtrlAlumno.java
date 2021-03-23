/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.AlumnoOperation;
import model.AlumnoModel;
import others.FullSelection;
import view.AlumnoView;

/**
 *
 * @author Gerardo
 */
public class CtrlAlumno implements ActionListener{
    
    private AlumnoModel alumno;
    private AlumnoOperation alumnoModel;
    private AlumnoView alumnoVista;
    
    public CtrlAlumno(AlumnoModel alumno, AlumnoOperation alumnoModel, AlumnoView alumnosVista){
        this.alumno = alumno;
        this.alumnoModel = alumnoModel;
        this.alumnoVista = alumnosVista;
        
        this.alumnoVista.btnAgregarA.addActionListener(this);
        this.alumnoVista.btnAgregarA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.alumnoVista.btnEliminarA.addActionListener(this);
        this.alumnoVista.btnActualizarA.addActionListener(this);
        this.alumnoVista.btnBuscar.addActionListener(this);
        this.alumnoVista.btnLimpiar.addActionListener(this);
        this.alumnoVista.JRBautizo.addActionListener(this);
        this.alumnoVista.JRBSBautizo.addActionListener(this);
        
        /*TEXT FIELDS*/
        this.alumnoVista.txfNombreA.addFocusListener(new FullSelection());
        this.alumnoVista.txfIdentAlumno.addFocusListener(new FullSelection());
        this.alumnoVista.txfApeA.addFocusListener(new FullSelection());
        this.alumnoVista.txfEdadA.addFocusListener(new FullSelection());
        this.alumnoVista.txfBuscarIdenti.addFocusListener(new FullSelection());
    }
    
    private boolean selec = false;
    @Override
    public void actionPerformed(ActionEvent arg0) {
        /*------------------AGREGADO DE ALUMNO ---------REGISTRO DE ALUMNO----------------------------------------*/
        if(arg0.getSource()==this.alumnoVista.btnAgregarA){
            if(comprobarCampos()){
                cargarDatos();
                this.alumnoModel.registrarAlumno(alumno);
            }else{
                JOptionPane.showMessageDialog(alumnoVista, "Por favor llene todos los campos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        /*OPERACIONES PARA EL JRADIOBUTTON*/
        if(arg0.getSource()==this.alumnoVista.JRBautizo){
            this.alumnoVista.JRBSBautizo.setSelected(false);
            selec = true;
        }else{
            this.alumnoVista.JRBautizo.setSelected(false);
            selec = false;
        }
        
    }
    
    private String generateMat(){
        String nombre = this.alumnoVista.txfNombreA.getText();
        String apellido = this.alumnoVista.txfApeA.getText();
        int num = 0;
        do{
            num = new Random().nextInt(10000);
        }while(num<0);
        Calendar anio = Calendar.getInstance();
        int a = anio.get(Calendar.YEAR);
        
        char matricula[] = new char[20];
        matricula[0] = nombre.charAt(0);
        matricula[1] = apellido.charAt(0);
        
        for(int i = 0; i<apellido.length(); i++){
            if(apellido.charAt(i)==' '){
                matricula[2] = apellido.charAt(i+1);
            }
        }
        String mat = String.valueOf(matricula);
        mat += String.valueOf(num);
        String b = String.valueOf(a);
        int x = b.length();
        mat += b.charAt(x-2);
        mat += b.charAt(x-1);
        return mat;
    }
    
    private boolean comprobarCampos(){
         ArrayList<JTextField> campos = new ArrayList<JTextField>();
            campos.add(this.alumnoVista.txfIdentAlumno);
            campos.add(this.alumnoVista.txfNombreA);
            campos.add(this.alumnoVista.txfApeA);
            campos.add(this.alumnoVista.txfEdadA);
            for(int i = 0; i<campos.size(); i++){
                if(campos.get(i).getText().equals("")){
                    System.out.println(campos.get(i).getText());
                    return false;
                }
            }
            if(!(this.alumnoVista.JRBautizo.isSelected()) && !(this.alumnoVista.JRBSBautizo.isSelected())){
                return false;
            }            
            if(this.alumnoVista.jcomGradoA.getSelectedItem().toString().equals("Grado")){
                System.out.println(this.alumnoVista.jcomGradoA.getSelectedItem().toString().equals("Grado"));
                return false;
            }
            try{
                Integer.parseInt(this.alumnoVista.txfEdadA.getText());
            }catch(Exception e){
                System.out.println(""+e.getMessage());
                return false;
            }
        return true;
    }
    
    private void cargarDatos(){
            this.alumno.setMatricula(this.generateMat());
            this.alumno.setNombre(this.alumnoVista.txfNombreA.getText());
            this.alumno.setApellido(this.alumnoVista.txfApeA.getText());
            this.alumno.setEdad(Integer.parseInt(this.alumnoVista.txfEdadA.getText()));
            this.alumno.setGrado(Integer.parseInt(this.alumnoVista.jcomGradoA.getSelectedItem().toString()));
            this.alumno.setBautizo(selec);
    }
}
