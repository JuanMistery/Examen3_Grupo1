/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import entidades.Cuenta;
import entidades.CuentaCorriente;
import entidades.CuentaCorriente.Chequera;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class IfrmEmitirCheques extends javax.swing.JInternalFrame {

    Cuenta cuenta;
    /**
     * Creates new form IfrmEmitirCheques
     */
    public IfrmEmitirCheques(Cuenta cuenta) {
        initComponents();
        this.cuenta = cuenta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmitirCheque = new javax.swing.JLabel();
        lblMontoCheque = new javax.swing.JLabel();
        txtMontoChequera = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnEmitirCheque = new javax.swing.JButton();
        lblCobrador = new javax.swing.JLabel();
        txtCobrador = new javax.swing.JTextField();

        lblEmitirCheque.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        lblEmitirCheque.setText("EMITIR CHEQUE");

        lblMontoCheque.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblMontoCheque.setText("Monto: ");

        btnVolver.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEmitirCheque.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEmitirCheque.setText("Emitir");
        btnEmitirCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirChequeActionPerformed(evt);
            }
        });

        lblCobrador.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblCobrador.setText("Cobrador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(btnEmitirCheque))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCobrador)
                                .addGap(18, 18, 18)
                                .addComponent(txtCobrador, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMontoCheque))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmitirCheque)
                    .addComponent(txtMontoChequera, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmitirCheque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCobrador)
                    .addComponent(txtCobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoCheque)
                    .addComponent(txtMontoChequera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnEmitirCheque))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEmitirChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirChequeActionPerformed
        float montoCheque = Float.parseFloat(txtMontoChequera.getText());
        String cobrador = txtCobrador.getText();
        int posicion = ((CuentaCorriente)cuenta).buscarChequeraDisponible();
        if(posicion!=-1){
            Chequera chequera = ((CuentaCorriente)cuenta).obtenerChequera(posicion);
            chequera.agregarCheque(cobrador, montoCheque);
            int posicionCheque = chequera.getNumeroCheques()-1;
            JOptionPane.showMessageDialog(null, "Cheque emitido \nNumero Cheque: "+chequera.obtenerCheque(posicionCheque).getNumeroCheque()+
                    "\nCobrador: "+cobrador+" Monto: " + chequera.obtenerCheque(posicionCheque).getMonto());
            
            
        }
        else JOptionPane.showMessageDialog(null, "Porfavor crear una una chequera\ntodas las chequeras han alcanzado el limite");
        
    }//GEN-LAST:event_btnEmitirChequeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirCheque;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCobrador;
    private javax.swing.JLabel lblEmitirCheque;
    private javax.swing.JLabel lblMontoCheque;
    private javax.swing.JTextField txtCobrador;
    private javax.swing.JTextField txtMontoChequera;
    // End of variables declaration//GEN-END:variables
}
