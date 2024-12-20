/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import entidades.*;
import entidades.Cuenta.Operaciones;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JuanMistery
 */
public class ifrmOperaciones extends javax.swing.JInternalFrame {

    private ArrayList<Operaciones> listaOperaciones;

       public ifrmOperaciones(Cuenta cuenta) {
        initComponents();
        listaOperaciones = new ArrayList<>(cuenta.getOperaciones());
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Número de Operación");
        model.addColumn("Fecha de Operación");
        model.addColumn("Tipo de Operación");
        model.addColumn("Monto de Operación");
        for (Operaciones operacion : listaOperaciones) {
            String numeroOperacion = operacion.getNumeroOperacion();
            String fechaOperacion = operacion.getFechaOperacionCorta();
            int tipoOperacion = operacion.getTipoOperacion();
            float montoOperacion = operacion.getMontoOperacion();

            model.addRow(new Object[]{numeroOperacion, fechaOperacion, tipoOperacion, montoOperacion});
        }
         tblOperaciones.setModel(model);
    }
    private String obtenerNombreTipo(int tipoOperacion) {
        switch (tipoOperacion) {
            case 1:
                return "Depósito";
            case 2:
                return "Retiro";
            case 3:
                return "Transferencia";
            case 4:
                return "ITF";
            case 5:
                return "Interés Mensual";
            default:
                return "Desconocido";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperaciones = new javax.swing.JTable();

        setTitle("Operaciones");

        tblOperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero De Operacion", "Tipo De Operacion", "Monto De Operacion", "Fecha de Operacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOperaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOperaciones;
    // End of variables declaration//GEN-END:variables
}
