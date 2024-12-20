/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.util.*;
import javax.swing.*;
import entidades.*;

/**
 *
 * @author JuanMistery
 */
public class panBeneficiarios extends javax.swing.JPanel {

    private ArrayList<Persona> listaP;
    private int index;
    /**
     * Creates new form panBeneficiarios
     */
    public panBeneficiarios() {
        initComponents();
        listaP= new ArrayList<>();
        index=0;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreBeneficiario = new javax.swing.JLabel();
        lblApellidosBeneficiarios = new javax.swing.JLabel();
        lblCorreoElectronicoBeneficiario = new javax.swing.JLabel();
        lblTelefonoBeneficiario = new javax.swing.JLabel();
        lblDireccionBeneficiario = new javax.swing.JLabel();
        txtNombresBeneficiario = new javax.swing.JTextField();
        txtApellidosBeneficiario = new javax.swing.JTextField();
        txtDireccionBeneficiario = new javax.swing.JTextField();
        txtTelefonoBeneficiario = new javax.swing.JTextField();
        txtCorreoElectronicoBeneficiario = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));

        lblNombreBeneficiario.setText("Nombres:");

        lblApellidosBeneficiarios.setText("Apellidos");

        lblCorreoElectronicoBeneficiario.setText("Correo Electronico");

        lblTelefonoBeneficiario.setText("Telefono:");

        lblDireccionBeneficiario.setText("Direccion:");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.setEnabled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreBeneficiario)
                    .addComponent(lblApellidosBeneficiarios)
                    .addComponent(lblDireccionBeneficiario)
                    .addComponent(lblTelefonoBeneficiario)
                    .addComponent(lblCorreoElectronicoBeneficiario)
                    .addComponent(btnAtras))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidosBeneficiario)
                    .addComponent(txtNombresBeneficiario)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtCorreoElectronicoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTelefonoBeneficiario)
                    .addComponent(txtDireccionBeneficiario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreBeneficiario)
                    .addComponent(txtNombresBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosBeneficiarios)
                    .addComponent(txtApellidosBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionBeneficiario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefonoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoBeneficiario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoElectronicoBeneficiario)
                    .addComponent(txtCorreoElectronicoBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAtras))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        retroceder();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        avanzar();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void avanzar()
    {
        if (listaP != null && index < getTamanio() - 1)
         {
            index++;
            mostrarPersona(listaP.get(index));
         }
         else
         {
             if(camposCompletos())
             {
               try {
                Persona persona = new Persona(txtNombresBeneficiario.getText(), txtApellidosBeneficiario.getText(), txtDireccionBeneficiario.getText(), txtTelefonoBeneficiario.getText(), txtCorreoElectronicoBeneficiario.getText());
                listaP.add(persona);
                index++;
                limpiarCampos();
                btnAtras.setEnabled(index>0);
            }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al agregar beneficiario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
             }else
            {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            }
        }
    }
    private int getTamanio()
    {
        return (listaP != null) ? listaP.size() : 0;
    }
    
    private void retroceder()
    {
        if(index>0)
        {
            index--;
            mostrarPersona(listaP.get(index));
        }
        btnAtras.setEnabled(index>0);
    }
    
    private boolean camposCompletos() {
        return !txtNombresBeneficiario.getText().isEmpty() && !txtApellidosBeneficiario.getText().isEmpty() && !txtDireccionBeneficiario.getText().isEmpty() && !txtTelefonoBeneficiario.getText().isEmpty() && !txtCorreoElectronicoBeneficiario.getText().isEmpty();
    }
    
    private void mostrarPersona(Persona persona)
    {
        txtNombresBeneficiario.setText(persona.getNombres());
        txtApellidosBeneficiario.setText(persona.getApellidos());
        txtDireccionBeneficiario.setText(persona.getDireccion());
        txtTelefonoBeneficiario.setText(persona.getTelefono());
        txtCorreoElectronicoBeneficiario.setText(persona.getCorreoElectronico());
    }
    
    private void limpiarCampos()
    {
        txtNombresBeneficiario.setText("");
        txtApellidosBeneficiario.setText("");
        txtDireccionBeneficiario.setText("");
        txtTelefonoBeneficiario.setText("");
        txtCorreoElectronicoBeneficiario.setText("");
        
    }
    
    public ArrayList<Persona> recuperarListaP()
    {
        return listaP;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidosBeneficiarios;
    private javax.swing.JLabel lblCorreoElectronicoBeneficiario;
    private javax.swing.JLabel lblDireccionBeneficiario;
    private javax.swing.JLabel lblNombreBeneficiario;
    private javax.swing.JLabel lblTelefonoBeneficiario;
    private javax.swing.JTextField txtApellidosBeneficiario;
    private javax.swing.JTextField txtCorreoElectronicoBeneficiario;
    private javax.swing.JTextField txtDireccionBeneficiario;
    private javax.swing.JTextField txtNombresBeneficiario;
    private javax.swing.JTextField txtTelefonoBeneficiario;
    // End of variables declaration//GEN-END:variables
}
