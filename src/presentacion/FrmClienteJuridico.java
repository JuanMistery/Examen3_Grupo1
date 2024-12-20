/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import datos.ListaCuentas;
import datos.*;
import entidades.*;

/**
 *
 * @author ramos
 */
public class FrmClienteJuridico extends javax.swing.JFrame {

    private Cuenta cuentaB;
    private ListaCuentas listaC = ListaCuentas.cargarCuentas("DatosCuentas.dat");
    /**
     * Creates new form frmRegistroClienteJuridico
     */
    public FrmClienteJuridico(Cuenta cuenta) {
        cuentaB=cuenta;
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

        lblTitulo = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblRUC = new javax.swing.JLabel();
        lblDireccionFiscal = new javax.swing.JLabel();
        lblDireccionOperacion = new javax.swing.JLabel();
        lblTelefonoJuridico = new javax.swing.JLabel();
        lblCorreoElectronicoJuridico = new javax.swing.JLabel();
        lblDocumentoConstitucion = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        txtDireccionFiscal = new javax.swing.JTextField();
        txtDireccionOperacion = new javax.swing.JTextField();
        txtTelefonoJuridico = new javax.swing.JTextField();
        txtDocumentoConstitucion = new javax.swing.JTextField();
        txtCorreoElectronicoJuridico = new javax.swing.JTextField();
        lblNombreRepresentante = new javax.swing.JLabel();
        lblApellidoRepresentante = new javax.swing.JLabel();
        lblDireccionRepresentante = new javax.swing.JLabel();
        lblTelefonoRepresentante = new javax.swing.JLabel();
        lblCorreoElectronicoRepresentante = new javax.swing.JLabel();
        lblDatosDelRepresentate = new javax.swing.JLabel();
        lblDatosDelRepresentate1 = new javax.swing.JLabel();
        txtNombreRepresentante = new javax.swing.JTextField();
        txtApellidoRepresentante = new javax.swing.JTextField();
        txtDireccionRepresentante = new javax.swing.JTextField();
        txtTelefonoRepresentante = new javax.swing.JTextField();
        txtCorreoElectronicoRepresentante = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblTitulo.setText("REGISTRO CLIENTE JURIDICO");

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreEmpresa.setText("Nombre de Empresa:");

        lblRUC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRUC.setText("RUC:");
        lblRUC.setToolTipText("");

        lblDireccionFiscal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDireccionFiscal.setText("Direccion Fiscal:");

        lblDireccionOperacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDireccionOperacion.setText("Direccion Operacion:");

        lblTelefonoJuridico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefonoJuridico.setText("Telefono Empresarial:");

        lblCorreoElectronicoJuridico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCorreoElectronicoJuridico.setText("Correo Electronico Empresarial:");

        lblDocumentoConstitucion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDocumentoConstitucion.setText("Documento De constitucion:");

        lblNombreRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreRepresentante.setText("Nombre:");

        lblApellidoRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellidoRepresentante.setText("Apellido:");

        lblDireccionRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDireccionRepresentante.setText("Direccion:");

        lblTelefonoRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefonoRepresentante.setText("Telefono:");

        lblCorreoElectronicoRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCorreoElectronicoRepresentante.setText("Correo Electronico:");

        lblDatosDelRepresentate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosDelRepresentate.setText("DATOS DE LA EMPRESA:");

        lblDatosDelRepresentate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosDelRepresentate1.setText("DATOS DEL REPRESENTANTE:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRetroceder.setText("Retroceder");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDireccionOperacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDireccionFiscal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCorreoElectronicoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefonoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellidoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRUC)
                                    .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefonoJuridico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCorreoElectronicoJuridico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(txtCorreoElectronicoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDocumentoConstitucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDocumentoConstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreoElectronicoRepresentante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoRepresentante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellidoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatosDelRepresentate, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatosDelRepresentate1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(2, 2, 2)
                .addComponent(lblDatosDelRepresentate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoRepresentante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoElectronicoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreoElectronicoRepresentante)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreRepresentante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidoRepresentante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccionRepresentante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosDelRepresentate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRUC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccionFiscal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccionOperacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTelefonoJuridico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreoElectronicoJuridico)
                            .addComponent(txtCorreoElectronicoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDocumentoConstitucion)
                            .addComponent(txtDocumentoConstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDireccionOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnRetroceder))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        frmRegistrarCuenta FrmRegistrarCuenta =  new frmRegistrarCuenta(cuentaB);
        FrmRegistrarCuenta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Cliente clienteB;
        String nombreRepresentate = txtNombreRepresentante.getText();
        String apellidosRepresentante = txtApellidoRepresentante.getText();
        String direccionRepresentante =  txtDireccionRepresentante.getText();
        String telefonoRepresentante = txtTelefonoRepresentante.getText();
        String correoElectronico = txtCorreoElectronicoRepresentante.getText();
        String razonSocial = txtNombreEmpresa.getText();
        String ruc = txtRUC.getText();
        String direccionFiscal = txtDireccionFiscal.getText();
        String direccionOperacion = txtDireccionOperacion.getText();
        String correoElectronicoJuridico = txtCorreoElectronicoJuridico.getText();
        String documentoConstitucion = txtDocumentoConstitucion.getText();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel lblApellidoRepresentante;
    private javax.swing.JLabel lblCorreoElectronicoJuridico;
    private javax.swing.JLabel lblCorreoElectronicoRepresentante;
    private javax.swing.JLabel lblDatosDelRepresentate;
    private javax.swing.JLabel lblDatosDelRepresentate1;
    private javax.swing.JLabel lblDireccionFiscal;
    private javax.swing.JLabel lblDireccionOperacion;
    private javax.swing.JLabel lblDireccionRepresentante;
    private javax.swing.JLabel lblDocumentoConstitucion;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreRepresentante;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JLabel lblTelefonoJuridico;
    private javax.swing.JLabel lblTelefonoRepresentante;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellidoRepresentante;
    private javax.swing.JTextField txtCorreoElectronicoJuridico;
    private javax.swing.JTextField txtCorreoElectronicoRepresentante;
    private javax.swing.JTextField txtDireccionFiscal;
    private javax.swing.JTextField txtDireccionOperacion;
    private javax.swing.JTextField txtDireccionRepresentante;
    private javax.swing.JTextField txtDocumentoConstitucion;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreRepresentante;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefonoJuridico;
    private javax.swing.JTextField txtTelefonoRepresentante;
    // End of variables declaration//GEN-END:variables
}
