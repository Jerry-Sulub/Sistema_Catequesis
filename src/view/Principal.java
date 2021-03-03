/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Cursor;

/**
 *
 * @author Gerardo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnAlumno = new javax.swing.JButton();
        btnCatequista = new javax.swing.JButton();
        btnTutor = new javax.swing.JButton();
        btnOracion = new javax.swing.JButton();
        separadorAlumno = new javax.swing.JSeparator();
        separadorCatequista = new javax.swing.JSeparator();
        separadorTutor = new javax.swing.JSeparator();
        separadorOracion = new javax.swing.JSeparator();
        menu_superior = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblMaximizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contenido.setLayout(new java.awt.BorderLayout());

        menu.setBackground(new java.awt.Color(0, 32, 96));
        menu.setPreferredSize(new java.awt.Dimension(125, 417));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlumno.setBackground(new java.awt.Color(0, 32, 96));
        btnAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/alumno.png"))); // NOI18N
        btnAlumno.setText("Alumnos");
        btnAlumno.setBorder(null);
        btnAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumno.setFocusable(false);
        btnAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(btnAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 105, -1));

        btnCatequista.setBackground(new java.awt.Color(0, 32, 96));
        btnCatequista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCatequista.setForeground(new java.awt.Color(255, 255, 255));
        btnCatequista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/Catequista.png"))); // NOI18N
        btnCatequista.setText("Catequistas");
        btnCatequista.setBorder(null);
        btnCatequista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatequista.setFocusable(false);
        btnCatequista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatequista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(btnCatequista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 105, -1));

        btnTutor.setBackground(new java.awt.Color(0, 32, 96));
        btnTutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTutor.setForeground(new java.awt.Color(255, 255, 255));
        btnTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/tutores.png"))); // NOI18N
        btnTutor.setText("Tutores");
        btnTutor.setBorder(null);
        btnTutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTutor.setFocusable(false);
        btnTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(btnTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, 105, -1));

        btnOracion.setBackground(new java.awt.Color(0, 32, 96));
        btnOracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOracion.setForeground(new java.awt.Color(255, 255, 255));
        btnOracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/oraciones.png"))); // NOI18N
        btnOracion.setText("Oraciones");
        btnOracion.setBorder(null);
        btnOracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOracion.setFocusable(false);
        btnOracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(btnOracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 105, -1));

        separadorAlumno.setBackground(new java.awt.Color(0, 176, 240));
        separadorAlumno.setForeground(new java.awt.Color(0, 176, 240));
        menu.add(separadorAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 105, 3));

        separadorCatequista.setBackground(new java.awt.Color(0, 176, 240));
        separadorCatequista.setForeground(new java.awt.Color(0, 176, 240));
        menu.add(separadorCatequista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 105, 5));

        separadorTutor.setBackground(new java.awt.Color(0, 176, 240));
        separadorTutor.setForeground(new java.awt.Color(0, 176, 240));
        menu.add(separadorTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 327, 105, 5));

        separadorOracion.setBackground(new java.awt.Color(0, 176, 240));
        separadorOracion.setForeground(new java.awt.Color(0, 176, 240));
        menu.add(separadorOracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 441, 105, 10));

        contenido.add(menu, java.awt.BorderLayout.LINE_START);

        menu_superior.setBackground(new java.awt.Color(0, 176, 240));
        menu_superior.setPreferredSize(new java.awt.Dimension(908, 40));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText(" ADMINISTRACIÓN CATEQUESIS");

        lblMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/maximizar_pantalla.png"))); // NOI18N

        lblCerrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/cerrar_v.png"))); // NOI18N

        lblminimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/menu/minimizar_v.png"))); // NOI18N

        javax.swing.GroupLayout menu_superiorLayout = new javax.swing.GroupLayout(menu_superior);
        menu_superior.setLayout(menu_superiorLayout);
        menu_superiorLayout.setHorizontalGroup(
            menu_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_superiorLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_superiorLayout.setVerticalGroup(
            menu_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_superiorLayout.createSequentialGroup()
                .addGroup(menu_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaximizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenido.add(menu_superior, java.awt.BorderLayout.PAGE_START);

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        contenido.add(panelContenido, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAlumno;
    public javax.swing.JButton btnCatequista;
    public javax.swing.JButton btnOracion;
    public javax.swing.JButton btnTutor;
    public javax.swing.JPanel contenido;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblMaximizar;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblminimizar;
    private javax.swing.JPanel menu;
    public javax.swing.JPanel menu_superior;
    public javax.swing.JPanel panelContenido;
    public javax.swing.JSeparator separadorAlumno;
    public javax.swing.JSeparator separadorCatequista;
    public javax.swing.JSeparator separadorOracion;
    public javax.swing.JSeparator separadorTutor;
    // End of variables declaration//GEN-END:variables
}
