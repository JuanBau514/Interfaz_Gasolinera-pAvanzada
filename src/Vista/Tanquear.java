/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.ConTanqueo;
import Interfases.DAOTanqueo;
import Modelo.Tanqueo;

/**
 *
 * @author juanpbcl
 */
public class Tanquear extends javax.swing.JPanel {

    private float precioV;
    private float volumenV;
    private float resultadoV;

    private String tipoCombustible;
    private boolean tanqueo;

    private boolean pararTanqueo;
    private boolean limpiar;
    
    public Tanquear() {
        this.initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanel1 = new javax.swing.JPanel();
        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.Parar_Tanqueo = new javax.swing.JButton();
        this.jLabel3 = new javax.swing.JLabel();
        this.campoPrecio = new javax.swing.JTextField();
        this.campoVolumen = new javax.swing.JTextField();
        this.CampoResultado = new javax.swing.JTextField();
        this.EmpezarTanquo = new javax.swing.JButton();
        this.Limpiar = new javax.swing.JButton();
        this.jLabel4 = new javax.swing.JLabel();
        this.jLabel5 = new javax.swing.JLabel();
        this.jLabel6 = new javax.swing.JLabel();
        this.opcDiesel = new javax.swing.JButton();
        this.opcPremium = new javax.swing.JButton();
        this.opcCorriente = new javax.swing.JButton();

        this.jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        this.jPanel1.setPreferredSize(new java.awt.Dimension(749, 603));

        this.jLabel1.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        this.jLabel1.setText("Volumen Cantidad Galones");

        this.jLabel2.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        this.jLabel2.setText("Final  $ Precio / Galon");

        this.Parar_Tanqueo.setBackground(new java.awt.Color(255, 51, 51));
        this.Parar_Tanqueo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.Parar_Tanqueo.setForeground(new java.awt.Color(255, 255, 255));
        this.Parar_Tanqueo.setText("Parar Tanqueo");
        this.Parar_Tanqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.Parar_TanqueoActionPerformed(evt);
            }
        });

        this.jLabel3.setFont(new java.awt.Font("URW Gothic", 1, 18)); // NOI18N
        this.jLabel3.setText("Precio $");

        this.CampoResultado.setEditable(false);
        this.CampoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        this.EmpezarTanquo.setBackground(new java.awt.Color(0, 153, 153));
        this.EmpezarTanquo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.EmpezarTanquo.setForeground(new java.awt.Color(255, 255, 255));
        this.EmpezarTanquo.setText("Empezar Tanqueo");
        this.EmpezarTanquo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.EmpezarTanquoActionPerformed(evt);
            }
        });

        this.Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        this.Limpiar.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        this.Limpiar.setText("Limpiar");
        this.Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.LimpiarActionPerformed(evt);
            }
        });

        this.jLabel4.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.jLabel4.setText("Premium");

        this.jLabel5.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.jLabel5.setText("Corriente");

        this.jLabel6.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        this.jLabel6.setText("Diesel");

        this.opcDiesel.setBackground(new java.awt.Color(51, 51, 51));
        this.opcDiesel.setForeground(new java.awt.Color(255, 255, 255));
        this.opcDiesel.setText("D");
        this.opcDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.opcDieselActionPerformed(evt);
            }
        });

        this.opcPremium.setBackground(new java.awt.Color(0, 153, 153));
        this.opcPremium.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        this.opcPremium.setForeground(new java.awt.Color(255, 255, 255));
        this.opcPremium.setText("P");
        this.opcPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.opcPremiumActionPerformed(evt);
            }
        });

        this.opcCorriente.setBackground(new java.awt.Color(255, 51, 51));
        this.opcCorriente.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        this.opcCorriente.setForeground(new java.awt.Color(255, 255, 255));
        this.opcCorriente.setText("C");
        this.opcCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanquear.this.opcCorrienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(this.jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(this.campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(this.EmpezarTanquo)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.Parar_Tanqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(this.opcPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.opcCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(this.Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(this.jLabel5)
                                        .addGap(28, 28, 28)
                                        .addComponent(this.opcDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(this.campoVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(this.jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(this.CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel3)
                    .addComponent(this.campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel1)
                    .addComponent(this.campoVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel2)
                    .addComponent(this.CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.EmpezarTanquo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.Parar_Tanqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabel4)
                    .addComponent(this.jLabel5)
                    .addComponent(this.jLabel6)
                    .addComponent(this.opcDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.opcPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.opcCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
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

    private void opcPremiumActionPerformed(java.awt.event.ActionEvent evt) {
        this.precioV = 20000;
    }

    private void opcDieselActionPerformed(java.awt.event.ActionEvent evt) {
        this.precioV = 10560;
    }

    private void opcCorrienteActionPerformed(java.awt.event.ActionEvent evt) {
        this.precioV = 12420;
    }

    private void EmpezarTanquoActionPerformed(java.awt.event.ActionEvent evt) {

        if (this.campoVolumen.getText().isEmpty()) {

           float precio = Float.parseFloat(this.campoPrecio.getText());
            Tanqueo auxTanqueo = new Tanqueo(precio,this.precioV);
            auxTanqueo.registrarTanqueoPrecio();
            this.CampoResultado.setText(String.valueOf(auxTanqueo.getTotal()));

            // registrando tanqueo en la base de datos

            try {
                DAOTanqueo daoTanqueo = new ConTanqueo();
                daoTanqueo.registrar(auxTanqueo);
            } catch (Exception e) {
                System.out.println("Error al registrar el tanqueo");
            }
            
        } else if (this.campoPrecio.getText().isEmpty()) {

            float volumenV = Float.parseFloat(this.campoVolumen.getText());
            Tanqueo auxTanqueo = new Tanqueo(volumenV, this.precioV);
            auxTanqueo.registrarTanqueoCantidad();
            this.CampoResultado.setText(String.valueOf(auxTanqueo.getTotal()));

            // registrando tanqueo en la base de datos
            try {
                DAOTanqueo daoTanqueo = new ConTanqueo();
                daoTanqueo.registrar(auxTanqueo);
            } catch (Exception e) {
                System.out.println("Error al registrar el tanqueo");
            }
        } 
        else {
            this.CampoResultado.setText("Error de ingreso");
        }

    }

    private void Parar_TanqueoActionPerformed(java.awt.event.ActionEvent evt) {
        this.pararTanqueo = true;
    }

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        this.campoPrecio.setText("");
        this.campoVolumen.setText("");
        this.CampoResultado.setText("");
    }
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JButton EmpezarTanquo;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Parar_Tanqueo;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opcCorriente;
    private javax.swing.JButton opcDiesel;
    private javax.swing.JButton opcPremium;
    // End of variables declaration//GEN-END:variables
}
