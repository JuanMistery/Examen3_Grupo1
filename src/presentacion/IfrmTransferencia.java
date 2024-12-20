/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.ListaCuentas;
import entidades.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class IfrmTransferencia extends javax.swing.JInternalFrame {

    ListaCuentas listaC = ListaCuentas.cargarCuentas("src/datos/DatosCuentas.dat");
    Cuenta cuenta;
    /**
     * Creates new form IfrmTransferencia
     */
    public IfrmTransferencia(Cuenta cuenta) {
        this.cuenta = cuenta;
        initComponents();
    }
    
    public void habilitarBtnTransferir(){
        if(!txtMontoTransferencia.getText().isEmpty()&&
                !txtNumDeCuenta.getText().isEmpty())
            btnTransferir.setEnabled(true);
        else btnTransferir.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTransferencia = new javax.swing.JLabel();
        lblNdeCuenta = new javax.swing.JLabel();
        lblMontoATransferir = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtNumDeCuenta = new javax.swing.JTextField();
        txtMontoTransferencia = new javax.swing.JTextField();

        lblTransferencia.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        lblTransferencia.setText("TRANSFERENCIA");

        lblNdeCuenta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNdeCuenta.setText("N° de Cuenta:");

        lblMontoATransferir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblMontoATransferir.setText("Monto: ");

        btnTransferir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtMontoTransferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoTransferenciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTransferenciaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMontoATransferir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMontoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNdeCuenta)
                                .addGap(27, 27, 27)
                                .addComponent(txtNumDeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblTransferencia)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransferir)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferencia)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNdeCuenta)
                    .addComponent(txtNumDeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoATransferir)
                    .addComponent(txtMontoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnTransferir))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        float montoTransferencia = Float.parseFloat(txtMontoTransferencia.getText());
        String numeroTransferencia = txtNumDeCuenta.getText();
        int posicion = listaC.buscarPorNumeroCuenta(numeroTransferencia);
        Cuenta cuentaB = listaC.obtenerCuenta(posicion);
        if(posicion!=-1){
            if(JOptionPane.showConfirmDialog(null, "Esta por realizar una operacion a: "+cuentaB.getTitularDeCuenta().getNombres(), "TRANSFERENCIA", 2)==0){
                if(cuenta.realizarTransferencia(cuentaB, montoTransferencia))
                JOptionPane.showMessageDialog(null, "Transferencia realizada ");
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada: ");
        }
        
        this.dispose();
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtMontoTransferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTransferenciaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoTransferenciaKeyTyped

    private void txtMontoTransferenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTransferenciaKeyReleased
        habilitarBtnTransferir();
    }//GEN-LAST:event_txtMontoTransferenciaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblMontoATransferir;
    private javax.swing.JLabel lblNdeCuenta;
    private javax.swing.JLabel lblTransferencia;
    private javax.swing.JTextField txtMontoTransferencia;
    private javax.swing.JTextField txtNumDeCuenta;
    // End of variables declaration//GEN-END:variables
}
