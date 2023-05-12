/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.ConConsolidado;

/**
 *
 * @author juanpbaucl
 */
public class Consolidado extends javax.swing.JPanel {

    /**
     * Creates new form Consolidado
     */

     int auxid;
     int auxFkVentas;
     String auxNombreProducto;
     String auxDescripcion;
     int auxCantidadDisponible;
     int auxCantidadVendida;
     int auxFkProductos;
     int auxVentaTotal;
     
    public Consolidado() {
        this.initComponents();
        this.traerConsolidado();
    }

    
    public void traerConsolidado(){
        try {
            ConConsolidado controlador = new ConConsolidado();
            List<Modelo.Consolidado> consolidado = controlador.listar();
            DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
            modelo.setRowCount(0);
            for (Modelo.Consolidado con : consolidado) {
                Object[] dato = {con.getId(), con.getFk_Ventas(), con.getNombre_Producto(), con.getDescripcion(), con.getCantidadDisponible(), con.getCantidadVendida(), con.getFkProductos(), con.getVentaTotal()};
                modelo.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
    }

    public void eliminarConsolidado() {
        // eliminando el consolidado 
        try {
            ConConsolidado controlador = new ConConsolidado();
            Modelo.Consolidado consolidado = new Modelo.Consolidado(this.auxid, this.auxFkVentas, this.auxNombreProducto, this.auxDescripcion, this.auxCantidadDisponible, this.auxCantidadVendida, this.auxFkProductos, this.auxVentaTotal);
            controlador.eliminar(consolidado);
            this.traerConsolidado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void exportarDatosPDF () {
        try {
            ConConsolidado controlador = new ConConsolidado();
            List<Modelo.Consolidado> consolidado = controlador.listar();
            DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
            modelo.setRowCount(0);
            for (Modelo.Consolidado con : consolidado) {
                Object[] dato = {con.getId(), con.getFk_Ventas(), con.getNombre_Producto(), con.getDescripcion(), con.getCantidadDisponible(), con.getCantidadVendida(), con.getFkProductos(), con.getVentaTotal()};
                modelo.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.Background = new javax.swing.JPanel();
        this.Titulo = new javax.swing.JLabel();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jTable1 = new javax.swing.JTable();
        this.eliminarVenta = new javax.swing.JButton();
        this.Guardar = new javax.swing.JButton();
        this.DescargarPDF = new javax.swing.JButton();

        this.Background.setBackground(new java.awt.Color(255, 255, 255));

        this.Titulo.setFont(new java.awt.Font("URW Gothic", 1, 24)); // NOI18N
        this.Titulo.setText("Consolidado de Ventas Diaria");

        this.jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Producto", "Nombre Producto", "Descripcion", "Cantidad Disponible", "Cantidad Vendia", "Venta Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return this.types [columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);

        this.eliminarVenta.setBackground(new java.awt.Color(0, 0, 0));
        this.eliminarVenta.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.eliminarVenta.setForeground(new java.awt.Color(255, 255, 255));
        this.eliminarVenta.setText("Eliminar Venta");
        this.eliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consolidado.this.eliminarVentaActionPerformed(evt);
            }
        });

        this.Guardar.setBackground(new java.awt.Color(0, 0, 0));
        this.Guardar.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.Guardar.setForeground(new java.awt.Color(255, 255, 255));
        this.Guardar.setText("Guardar en CSV");
        this.Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consolidado.this.GuardarActionPerformed(evt);
            }
        });

        this.DescargarPDF.setBackground(new java.awt.Color(0, 0, 0));
        this.DescargarPDF.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        this.DescargarPDF.setForeground(new java.awt.Color(255, 255, 255));
        this.DescargarPDF.setText("Exportar PDF");
        this.DescargarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consolidado.this.DescargarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(this.Background);
        this.Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(this.Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(this.eliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(this.Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(this.DescargarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(this.Titulo)
                .addGap(18, 18, 18)
                .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(this.eliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.DescargarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void DescargarPDFActionPerformed(java.awt.event.ActionEvent evt) {
        this.exportarDatosPDF();

    }

    private void eliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {
        this.eliminarConsolidado();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton DescargarPDF;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton eliminarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
