/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author ramos
 */
public class IfrmTransferencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmTransferencia
     */
    public IfrmTransferencia() {
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

        lblTransferencia = new javax.swing.JLabel();
        lblNdeCuenta = new javax.swing.JLabel();
        lblMontoATransferir = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblMNombresPersonaTransferir = new javax.swing.JLabel();
        lblNombresPersona = new javax.swing.JLabel();
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

        lblMNombresPersonaTransferir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMNombresPersonaTransferir.setText("Nombres de la persona a transferir: ");

        lblNombresPersona.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNombresPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombresPersona.setText("nombre Persona");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombresPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransferir)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblMNombresPersonaTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMNombresPersonaTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblNombresPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnTransferir))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblMNombresPersonaTransferir;
    private javax.swing.JLabel lblMontoATransferir;
    private javax.swing.JLabel lblNdeCuenta;
    private javax.swing.JLabel lblNombresPersona;
    private javax.swing.JLabel lblTransferencia;
    private javax.swing.JTextField txtMontoTransferencia;
    private javax.swing.JTextField txtNumDeCuenta;
    // End of variables declaration//GEN-END:variables
}
