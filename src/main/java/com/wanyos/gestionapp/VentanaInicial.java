
package com.wanyos.gestionapp;

import com.wanyos.componentes.Button;
import com.wanyos.componentes.PanelImagen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaInicial extends javax.swing.JFrame {

   public ImageIcon ICONO_EMPLEADO = new ImageIcon(getClass().getResource("/icons/icon-empleado.png"));
   public ImageIcon ICONO_CONTRATO = new ImageIcon(getClass().getResource("/icons/icon-contrato.png"));
   public ImageIcon ICONO_PUESTO = new ImageIcon(getClass().getResource("/icons/icon-puesto.png"));
   public ImageIcon ICONO_RESUMEN = new ImageIcon(getClass().getResource("/icons/icon-resumen.png"));
   public Image IMAGEN_GESTION = new ImageIcon(getClass().getResource("/image/gestion.jpg")).getImage();
   
   private Button btnEmpleado, btnContrato, btnPuesto, btnResumen;
   private PanelGestion pnEmpleado, pnContrato, pnPuesto, pnResumen;
   private PanelImagen pnImagen;
    
    public VentanaInicial() {
        initComponents();
        setPanelMenu();
        setListenerBtn();
    }
    
    private void setPanelMenu(){
        pnImagen = new PanelImagen();
        this.pnCtr.add(pnImagen);
        this.pnCtr.updateUI();
        btnEmpleado = new Button("Empleado", ICONO_EMPLEADO, "Gestión Empleado");
        btnContrato = new Button("Contrato", ICONO_CONTRATO, "Gestión Contratos");
        btnPuesto = new Button("Puesto", ICONO_PUESTO, "Gestión Puesto Trabajo");
        btnResumen = new Button("Resumen", ICONO_RESUMEN, "Resumen Gestión App");
        this.pnMenu.add(btnEmpleado);
        this.pnMenu.add(btnContrato);
        this.pnMenu.add(btnPuesto);
        this.pnMenu.add(btnResumen);
        this.pack();
    }
    
    private void setListenerBtn(){
        this.btnEmpleado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnEmpleado = new PanelGestion();
                pnEmpleado.setLayout(new FlowLayout());
                pnEmpleado.setTitulo("Gestión Empleados");
                pnCtr.removeAll();
                pnCtr.add(pnEmpleado);
                pnCtr.updateUI();
            }
        });
        this.btnContrato.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnContrato = new PanelGestion();
                pnContrato.setLayout(new FlowLayout());
                pnContrato.setTitulo("Gestión Contratos");
                pnCtr.removeAll();
                pnCtr.add(pnContrato);
                pnCtr.updateUI();
            }
        });
        this.btnPuesto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnPuesto = new PanelGestion();
                pnPuesto.setLayout(new FlowLayout());
                pnPuesto.setTitulo("Gestión Puestos");
                pnCtr.removeAll();
                pnCtr.add(pnPuesto);
                pnCtr.updateUI();
            }
        });
        this.btnResumen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnResumen = new PanelGestion();
                pnResumen.setLayout(new FlowLayout());
                pnResumen.setTitulo("Gestión Resumen");
                pnCtr.removeAll();
                pnCtr.add(pnResumen);
                pnCtr.updateUI();
            }
        });
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen1 = new com.wanyos.componentes.PanelImagen();
        jPanel1 = new javax.swing.JPanel();
        pnSup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnWest = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        pnCtr = new javax.swing.JPanel();

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnSup.setBackground(new java.awt.Color(72, 93, 107));
        pnSup.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión App Empleados");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon-logo.png"))); // NOI18N

        javax.swing.GroupLayout pnSupLayout = new javax.swing.GroupLayout(pnSup);
        pnSup.setLayout(pnSupLayout);
        pnSupLayout.setHorizontalGroup(
            pnSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSupLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 559, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
        );
        pnSupLayout.setVerticalGroup(
            pnSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSupLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnSupLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2))
        );

        pnWest.setBackground(new java.awt.Color(167, 191, 206));
        pnWest.setPreferredSize(new java.awt.Dimension(300, 454));
        pnWest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setOpaque(false);
        pnMenu.setLayout(new java.awt.GridLayout(4, 1, 0, 10));
        pnWest.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 500));

        pnCtr.setBackground(new java.awt.Color(204, 204, 204));
        pnCtr.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnWest, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnWest, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(pnCtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.wanyos.componentes.PanelImagen panelImagen1;
    private javax.swing.JPanel pnCtr;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnSup;
    private javax.swing.JPanel pnWest;
    // End of variables declaration//GEN-END:variables
}
