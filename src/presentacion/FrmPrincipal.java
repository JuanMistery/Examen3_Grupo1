/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import entidades.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author JuanMistery
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    private Cuenta cuentaB;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(Cuenta cuenta) {
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

        dspFondo = new javax.swing.JDesktopPane(){
            private Image fondo = new ImageIcon(getClass().getResource("/imagenes/ImagenFondo.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                if(fondo != null)
                {
                    g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
                }
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniInformacion = new javax.swing.JMenuItem();
        mniMovimientos = new javax.swing.JMenuItem();
        mniCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniDeposito = new javax.swing.JMenuItem();
        mniRetiro = new javax.swing.JMenuItem();
        mniTransferencia = new javax.swing.JMenuItem();
        mniEmitirCheque = new javax.swing.JMenuItem();
        mniCobrarCheque = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Cuenta");

        mniInformacion.setText("Informacion");
        jMenu1.add(mniInformacion);

        mniMovimientos.setText("Movimientos");
        mniMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMovimientosActionPerformed(evt);
            }
        });
        jMenu1.add(mniMovimientos);

        mniCerrarSesion.setText("Cerrar Sesion");
        mniCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(mniCerrarSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        mniDeposito.setText("Deposito");
        mniDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDepositoActionPerformed(evt);
            }
        });
        jMenu2.add(mniDeposito);

        mniRetiro.setText("Retiro");
        mniRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRetiroActionPerformed(evt);
            }
        });
        jMenu2.add(mniRetiro);

        mniTransferencia.setText("Transferencia");
        mniTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTransferenciaActionPerformed(evt);
            }
        });
        jMenu2.add(mniTransferencia);

        mniEmitirCheque.setText("Emitir Cheque");
        mniEmitirCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmitirChequeActionPerformed(evt);
            }
        });
        jMenu2.add(mniEmitirCheque);

        mniCobrarCheque.setText("Cobrar Cheque");
        mniCobrarCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCobrarChequeActionPerformed(evt);
            }
        });
        jMenu2.add(mniCobrarCheque);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMovimientosActionPerformed
        ifrmInformacion IfrmInformacion = new ifrmInformacion(cuentaB);
        CentrarIF(IfrmInformacion);
    }//GEN-LAST:event_mniMovimientosActionPerformed

    private void mniCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCerrarSesionActionPerformed
        frmLogin FrmLogin = new frmLogin();
        FrmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniCerrarSesionActionPerformed

    private void mniRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRetiroActionPerformed
        IfrmRetirar IfrmRetiro = new IfrmRetirar();
        CentrarIF(IfrmRetiro);
    }//GEN-LAST:event_mniRetiroActionPerformed

    private void mniEmitirChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmitirChequeActionPerformed
        IfrmEmitirCheques ifrmEmisionCheque = new IfrmEmitirCheques();
        CentrarIF(ifrmEmisionCheque);
    }//GEN-LAST:event_mniEmitirChequeActionPerformed

    private void mniDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDepositoActionPerformed
        IfrmDeposito ifrmDeposito = new IfrmDeposito(cuentaB);
        CentrarIF(ifrmDeposito);
    }//GEN-LAST:event_mniDepositoActionPerformed

    private void mniTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTransferenciaActionPerformed
        IfrmTransferencia ifrmTransferencia = new IfrmTransferencia();
        CentrarIF(ifrmTransferencia);
    }//GEN-LAST:event_mniTransferenciaActionPerformed

    private void mniCobrarChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCobrarChequeActionPerformed
        IfrmCobrarCheque ifrmCobrarCheque = new IfrmCobrarCheque();
        CentrarIF(ifrmCobrarCheque);
    }//GEN-LAST:event_mniCobrarChequeActionPerformed

    /**
     * @param args the command line arguments
     */
    private void CentrarIF(JInternalFrame IF)
    {
        int x=(dspFondo.getWidth()-IF.getWidth())/2;
        int y=(dspFondo.getHeight()-IF.getHeight())/2;
        if(IF.isShowing())
        {
            IF.setLocation(x, y);
        }
        else
        {
            dspFondo.add(IF);
            IF.setLocation(x, y);
            IF.show();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dspFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCerrarSesion;
    private javax.swing.JMenuItem mniCobrarCheque;
    private javax.swing.JMenuItem mniDeposito;
    private javax.swing.JMenuItem mniEmitirCheque;
    private javax.swing.JMenuItem mniInformacion;
    private javax.swing.JMenuItem mniMovimientos;
    private javax.swing.JMenuItem mniRetiro;
    private javax.swing.JMenuItem mniTransferencia;
    // End of variables declaration//GEN-END:variables
}
