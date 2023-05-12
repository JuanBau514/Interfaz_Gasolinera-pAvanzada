/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controlador.ConTanqueo;
import Interfases.DAOTanqueo;
import Modelo.Tanqueo;
import java.util.ArrayList;

/**
 *
 * @author juanpbcl
 */
public class Factura extends javax.swing.JPanel {

    /**
     * Creates new form Factura
     */
    public Factura() {
        this.initComponents();
        this.Factura.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id_Producto", "Cantidad", "Precio Unitario", "Precio Final"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
    }

   

    @SuppressWarnings("unchecked")

    private void initComponents() {

        this.jLabel8 = new javax.swing.JLabel();
        this.jPanel1 = new javax.swing.JPanel();
        this.jPanel2 = new javax.swing.JPanel();
        this.jLabel1 = new javax.swing.JLabel();
        this.jPanel3 = new javax.swing.JPanel();
        this.jLabel2 = new javax.swing.JLabel();
        this.jTextField1 = new javax.swing.JTextField();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.Factura = new javax.swing.JTable();
        this.jLabel3 = new javax.swing.JLabel();
        this.jLabel4 = new javax.swing.JLabel();
        this.jLabel5 = new javax.swing.JLabel();
        this.jLabel6 = new javax.swing.JLabel();
        this.jLabel7 = new javax.swing.JLabel();
        this.jLabel9 = new javax.swing.JLabel();
        this.NombreUsuario = new javax.swing.JTextField();
        this.ApellidoUsuario = new javax.swing.JTextField();
        this.CorreoUsuario = new javax.swing.JTextField();
        this.TelefonoUsuario = new javax.swing.JTextField();
        this.Direccion = new javax.swing.JTextField();
        this.DescargarPDF = new javax.swing.JButton();
        this.TraerCompras = new javax.swing.JButton();

        this.jLabel8.setText("Apellido Usuario");

        this.jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        this.jPanel1.setPreferredSize(new java.awt.Dimension(749, 603));

        this.jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        this.jLabel1.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        this.jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        this.jLabel1.setText("Factura de venta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(this.jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        this.jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        this.jLabel2.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        this.jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        this.jLabel2.setText("Numero de Factura");

        this.jTextField1.setEditable(false);
        this.jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        this.jTextField1.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        this.jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(this.jLabel2)
                .addGap(12, 12, 12)
                .addComponent(this.jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel2)
                    .addComponent(this.jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        this.Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Cantidad", "Precio Unitario", "Precio Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return this.types [columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.Factura);

        this.jLabel3.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        this.jLabel3.setText("Gasolineria gasosaurius");

        this.jLabel4.setText("Nombre de Usuario");

        this.jLabel5.setText("Direccion");

        this.jLabel6.setText("Apellido Usuario");

        this.jLabel7.setText("Telefono");

        this.jLabel9.setText("Correo");

        this.NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.NombreUsuarioActionPerformed(evt);
            }
        });

        this.ApellidoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.ApellidoUsuarioActionPerformed(evt);
            }
        });

        this.CorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.CorreoUsuarioActionPerformed(evt);
            }
        });

        this.TelefonoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.TelefonoUsuarioActionPerformed(evt);
            }
        });

        this.Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.DireccionActionPerformed(evt);
            }
        });

        this.DescargarPDF.setBackground(new java.awt.Color(0, 0, 0));
        this.DescargarPDF.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.DescargarPDF.setForeground(new java.awt.Color(255, 255, 255));
        this.DescargarPDF.setText("Descargar Factura");
        this.DescargarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.DescargarPDFActionPerformed(evt);
            }
        });

        this.TraerCompras.setBackground(new java.awt.Color(0, 0, 0));
        this.TraerCompras.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.TraerCompras.setForeground(new java.awt.Color(255, 255, 255));
        this.TraerCompras.setText("Cargar DB");
        this.TraerCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factura.this.TraerComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(this.TelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(this.ApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(this.jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(this.CorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(this.jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(this.jLabel3)
                            .addGap(29, 29, 29)
                            .addComponent(this.jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(this.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(this.TraerCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(this.DescargarPDF)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(this.jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(this.jLabel3)
                    .addComponent(this.jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel4)
                    .addComponent(this.jLabel6)
                    .addComponent(this.jLabel9)
                    .addComponent(this.NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.ApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.CorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel5)
                    .addComponent(this.jLabel7)
                    .addComponent(this.TelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.DescargarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.TraerCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void mostrarDAtos(ArrayList<Tanqueo> compras) {
        for (Tanqueo compra : compras) {
            DefaultTableModel model = (DefaultTableModel) this.Factura.getModel();
            model.addRow(new Object[]{compra.getIdTanqueo(), compra.getCantidad(), compra.getPrecio(), compra.getTotal()});
        }
    }

    private void CorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoUsuarioActionPerformed

    private void TraerComprasActionPerformed(java.awt.event.ActionEvent evt) {
        DAOTanqueo dao = new ConTanqueo();
        try {
            ArrayList<Tanqueo> compras = dao.listar();
            this.mostrarDAtos(compras);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void DescargarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargarPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescargarPDFActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void TelefonoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoUsuarioActionPerformed

    private void ApellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoUsuarioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoUsuario;
    private javax.swing.JTextField CorreoUsuario;
    private javax.swing.JButton DescargarPDF;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTable Factura;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JTextField TelefonoUsuario;
    private javax.swing.JButton TraerCompras;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
