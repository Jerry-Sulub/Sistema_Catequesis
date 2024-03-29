/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gerardo
 */
public class AlumnoView extends javax.swing.JPanel {

    /**
     * Creates new form Alumno
     */
    public AlumnoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txfBuscarIdenti = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtlAlumnos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txfIdentAlumno = new javax.swing.JTextField();
        txfNombreA = new javax.swing.JTextField();
        txfApeA = new javax.swing.JTextField();
        txfEdadA = new javax.swing.JTextField();
        jcomGradoA = new javax.swing.JComboBox<>();
        JRBautizo = new javax.swing.JRadioButton();
        JRBSBautizo = new javax.swing.JRadioButton();
        btnAgregarA = new javax.swing.JButton();
        btnEliminarA = new javax.swing.JButton();
        btnActualizarA = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(810, 507));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 32, 96));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACIÓN ALUMNOS");

        txfBuscarIdenti.setBackground(new java.awt.Color(225, 255, 250));
        txfBuscarIdenti.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txfBuscarIdenti.setForeground(new java.awt.Color(0, 32, 96));
        txfBuscarIdenti.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscarIdenti.setText("Identificador");
        txfBuscarIdenti.setBorder(null);
        txfBuscarIdenti.setPreferredSize(new java.awt.Dimension(62, 25));

        btnBuscar.setBackground(new java.awt.Color(150, 215, 244));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 32, 96));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/components/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setFocusable(false);
        btnBuscar.setPreferredSize(new java.awt.Dimension(45, 25));

        jPanel2.setBackground(new java.awt.Color(150, 215, 244));

        jtlAlumnos.setBackground(new java.awt.Color(225, 255, 250));
        jtlAlumnos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtlAlumnos.setForeground(new java.awt.Color(0, 32, 96));
        jtlAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Apellido", "Grado", "Butizo"
            }
        ));
        jScrollPane2.setViewportView(jtlAlumnos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(150, 215, 244));

        txfIdentAlumno.setBackground(new java.awt.Color(225, 255, 250));
        txfIdentAlumno.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txfIdentAlumno.setForeground(new java.awt.Color(0, 32, 96));
        txfIdentAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentAlumno.setText("Identificador");
        txfIdentAlumno.setBorder(null);
        txfIdentAlumno.setPreferredSize(new java.awt.Dimension(62, 25));

        txfNombreA.setBackground(new java.awt.Color(225, 255, 250));
        txfNombreA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txfNombreA.setForeground(new java.awt.Color(0, 32, 96));
        txfNombreA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreA.setText("Nombre completo");
        txfNombreA.setBorder(null);
        txfNombreA.setPreferredSize(new java.awt.Dimension(62, 25));

        txfApeA.setBackground(new java.awt.Color(225, 255, 250));
        txfApeA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txfApeA.setForeground(new java.awt.Color(0, 32, 96));
        txfApeA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApeA.setText("Apellido Completo");
        txfApeA.setBorder(null);
        txfApeA.setPreferredSize(new java.awt.Dimension(62, 25));

        txfEdadA.setBackground(new java.awt.Color(225, 255, 250));
        txfEdadA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txfEdadA.setForeground(new java.awt.Color(0, 32, 96));
        txfEdadA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEdadA.setText("Edad");
        txfEdadA.setBorder(null);
        txfEdadA.setPreferredSize(new java.awt.Dimension(62, 25));

        jcomGradoA.setBackground(new java.awt.Color(225, 255, 250));
        jcomGradoA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jcomGradoA.setForeground(new java.awt.Color(0, 32, 96));
        jcomGradoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grado", "1", "2", "3", "4", "5", "6" }));
        jcomGradoA.setPreferredSize(new java.awt.Dimension(40, 26));

        JRBautizo.setBackground(new java.awt.Color(150, 215, 244));
        JRBautizo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        JRBautizo.setForeground(new java.awt.Color(0, 32, 96));
        JRBautizo.setText("Con bautizo");

        JRBSBautizo.setBackground(new java.awt.Color(150, 215, 244));
        JRBSBautizo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        JRBSBautizo.setForeground(new java.awt.Color(0, 32, 96));
        JRBSBautizo.setText("Sin bautizo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfApeA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNombreA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfIdentAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcomGradoA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JRBautizo)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfEdadA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JRBSBautizo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfIdentAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfApeA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBautizo)
                    .addComponent(JRBSBautizo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomGradoA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfEdadA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btnAgregarA.setBackground(new java.awt.Color(150, 215, 244));
        btnAgregarA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnAgregarA.setForeground(new java.awt.Color(0, 32, 96));
        btnAgregarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/components/anadir.png"))); // NOI18N
        btnAgregarA.setText("Agregar");
        btnAgregarA.setBorder(null);
        btnAgregarA.setFocusable(false);
        btnAgregarA.setPreferredSize(new java.awt.Dimension(45, 25));

        btnEliminarA.setBackground(new java.awt.Color(150, 215, 244));
        btnEliminarA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnEliminarA.setForeground(new java.awt.Color(0, 32, 96));
        btnEliminarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/components/eliminar.png"))); // NOI18N
        btnEliminarA.setText("Eliminar");
        btnEliminarA.setBorder(null);
        btnEliminarA.setFocusable(false);
        btnEliminarA.setPreferredSize(new java.awt.Dimension(45, 25));

        btnActualizarA.setBackground(new java.awt.Color(150, 215, 244));
        btnActualizarA.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnActualizarA.setForeground(new java.awt.Color(0, 32, 96));
        btnActualizarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/components/actualizar.png"))); // NOI18N
        btnActualizarA.setText("Actualizar");
        btnActualizarA.setBorder(null);
        btnActualizarA.setFocusable(false);
        btnActualizarA.setPreferredSize(new java.awt.Dimension(45, 25));

        btnLimpiar.setBackground(new java.awt.Color(150, 215, 244));
        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 32, 96));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/components/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(45, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizarA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txfBuscarIdenti, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txfBuscarIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton JRBSBautizo;
    public javax.swing.JRadioButton JRBautizo;
    public javax.swing.JButton btnActualizarA;
    public javax.swing.JButton btnAgregarA;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminarA;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> jcomGradoA;
    public javax.swing.JTable jtlAlumnos;
    public javax.swing.JTextField txfApeA;
    public javax.swing.JTextField txfBuscarIdenti;
    public javax.swing.JTextField txfEdadA;
    public javax.swing.JTextField txfIdentAlumno;
    public javax.swing.JTextField txfNombreA;
    // End of variables declaration//GEN-END:variables
}
