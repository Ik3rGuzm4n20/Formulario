/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.mycompany.formulario.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iaguz
 */
public final class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    Conexion con1=new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfcantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfvalor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfestado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btguardar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(83, 100, 255));

        jPanel2.setBackground(new java.awt.Color(27, 31, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(735, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        jPanel3.setBackground(new java.awt.Color(24, 24, 27));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Producto:");

        tfnombre.setBackground(new java.awt.Color(51, 51, 51));
        tfnombre.setForeground(new java.awt.Color(255, 255, 255));
        tfnombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        tfnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfnombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");

        tfdescripcion.setBackground(new java.awt.Color(51, 51, 51));
        tfdescripcion.setForeground(new java.awt.Color(255, 255, 255));
        tfdescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfdescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        tfdescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfdescripcion.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad:");

        tfcantidad.setBackground(new java.awt.Color(51, 51, 51));
        tfcantidad.setForeground(new java.awt.Color(255, 255, 255));
        tfcantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfcantidad.setCaretColor(new java.awt.Color(255, 255, 255));
        tfcantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfcantidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor:");

        tfvalor.setBackground(new java.awt.Color(51, 51, 51));
        tfvalor.setForeground(new java.awt.Color(255, 255, 255));
        tfvalor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfvalor.setCaretColor(new java.awt.Color(255, 255, 255));
        tfvalor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfvalor.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código:");

        tfcodigo.setBackground(new java.awt.Color(51, 51, 51));
        tfcodigo.setForeground(new java.awt.Color(255, 255, 255));
        tfcodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfcodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        tfcodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfcodigo.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");

        tfestado.setBackground(new java.awt.Color(51, 51, 51));
        tfestado.setForeground(new java.awt.Color(255, 255, 255));
        tfestado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfestado.setCaretColor(new java.awt.Color(255, 255, 255));
        tfestado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfestado.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barreno.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btguardar.setBackground(new java.awt.Color(0, 0, 255));
        btguardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btguardar.setForeground(new java.awt.Color(255, 255, 255));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disquete.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        btmodificar.setBackground(new java.awt.Color(255, 255, 51));
        btmodificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btmodificar.setForeground(new java.awt.Color(51, 51, 51));
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btmodificar.setText("Modificar");
        btmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        bteliminar.setBackground(new java.awt.Color(255, 0, 0));
        bteliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bteliminar.setForeground(new java.awt.Color(255, 255, 255));
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        bteliminar.setText("Eliminar");
        bteliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bteliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(255, 102, 0));
        btsalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btsalir.setForeground(new java.awt.Color(255, 255, 255));
        btsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btsalir.setText("Salir");
        btsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(79, 79, 82));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Inventario:");

        jTextField7.setBackground(new java.awt.Color(14, 165, 233));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Tabla.setBackground(new java.awt.Color(153, 153, 153));
        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad", "Valor", "Estado"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(153, 153, 153));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla);

        btlimpiar.setBackground(new java.awt.Color(51, 255, 51));
        btlimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btlimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btlimpiar.setText("Limpiar");
        btlimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // TODO add your handling code here:
        Agregar();
        consultar();
    }//GEN-LAST:event_btguardarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
        Modificar();
        consultar();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here
        Eliminar();
        consultar();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila=Tabla.getSelectedRow();
        if (fila == -1){

            JOptionPane.showMessageDialog(null, "No Se Seleccionó Fila");
        }else{
            String codigo= (String) Tabla.getValueAt (fila, 0).toString();
            String nproducto= (String) Tabla.getValueAt (fila, 1);
            String descripcion= (String) Tabla.getValueAt (fila, 2);
            String cantidad= (String) Tabla.getValueAt (fila, 3);
            String valor= (String) Tabla.getValueAt (fila, 4);
            String estado= (String) Tabla.getValueAt (fila, 5);

            tfcodigo.setText(codigo);
            tfnombre.setText(nproducto);
            tfdescripcion.setText(descripcion);
            tfcantidad.setText(cantidad);
            tfvalor.setText(valor);
            tfestado.setText(estado);

        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_btlimpiarActionPerformed

    void Agregar(){
    try{
        if (tfcodigo.getText().equals("")||tfnombre.getText().equals("")||tfdescripcion.getText().equals("")||tfcantidad.getText().equals("")||tfvalor.getText().equals("")||tfestado.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"ERROR: Campos Vacios");
        } else {
            String sql="insert into producto(codigo, nproducto, descripcion, cantidad, valor, estado) values ('"+tfcodigo.getText()+"','"+tfnombre.getText()+"','"+tfdescripcion.getText()+"','"+tfcantidad.getText()+"','"+tfvalor.getText()+"','"+tfestado.getText()+"')";
            conet=con1.getConnection();
            st=conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Producto Agregado");
        }
        } catch (SQLException e) {
            if(e.getErrorCode() == 1062){
            JOptionPane.showMessageDialog(null,"ERROR Codigo del Producto Existente");            
            }
        }
}
    
    
    void consultar(){
            String sql ="Select * from producto";
    
            try{
                conet=con1.getConnection();
                st = conet.createStatement();
                rs= st.executeQuery(sql);
                Object[] producto=new Object[6];
                modelo=(DefaultTableModel) Tabla.getModel();
                while (rs.next()){
                    producto [0]=rs.getInt("codigo");
                    producto [1]=rs.getString("nproducto");
                    producto [2]=rs.getString("descripcion");
                    producto [3]=rs.getString("cantidad");
                    producto [4]=rs.getString("valor");
                    producto [5]=rs.getString("estado");
                    
                    modelo.addRow(producto);
                }
                Tabla.setModel(modelo);
                
                } catch (SQLException e) {
                }
    }    

    void Modificar(){
    try{
        if (tfcodigo.getText().equals("")||tfnombre.getText().equals("")||tfdescripcion.getText().equals("")||tfcantidad.getText().equals("")||tfvalor.getText().equals("")||tfestado.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"ERROR: Campos Vacios");
        } else {
            String sql="Update producto set codigo='"+tfcodigo.getText()+"', nproducto='"+tfnombre.getText()+"', descripcion='"+tfdescripcion.getText()+"', cantidad='"+tfcantidad.getText()+"', valor='"+tfvalor.getText()+"', estado='"+tfestado.getText()+"' where codigo="+tfcodigo.getText();
            conet=con1.getConnection();
            st=conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Datos del Producto Modificados");
            limpiarTabla();
        }
        } catch (SQLException e) {
        }
    }
    
    
    
     void Eliminar(){
        int fila=Tabla.getSelectedRow();
        try {
             if(fila<0){
            JOptionPane.showMessageDialog(null,"Producto No Seleccionado");
            limpiarTabla();
             }
             else{
                 String sql="delete from producto where codigo="+tfcodigo.getText();
                 conet=con1.getConnection();
                 st=conet.createStatement();
                 st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Producto ELIMINADO");
                limpiarTabla();
             }   
            } catch (SQLException e) {
            }
    }
    
    void nuevo(){
            tfcodigo.setText("");
            tfnombre.setText("");
            tfdescripcion.setText("");
            tfcantidad.setText("");
            tfvalor.setText("");
            tfestado.setText("");
            tfnombre.requestFocus();
    }
    
    void limpiarTabla(){
            for (int i=0; i<Tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
            }
    }   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField tfcantidad;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfdescripcion;
    private javax.swing.JTextField tfestado;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfvalor;
    // End of variables declaration//GEN-END:variables
}
