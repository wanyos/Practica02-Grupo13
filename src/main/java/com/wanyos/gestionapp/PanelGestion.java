
package com.wanyos.gestionapp;

public class PanelGestion extends javax.swing.JPanel {

    public PanelGestion() {
        initComponents();
    }
    
    public void setTitulo(String titulo){
        this.lblTitulo.setText(titulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Titulo panel");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblTitulo, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
