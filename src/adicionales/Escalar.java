/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adicionales;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author ramos
 */
public class Escalar {
    public void escalarLabel(JLabel label, String rutaImagen) {
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(rutaImagen)).getImage()
                .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
    }
    
    public void escalarBoton(JButton boton, String rutaImagen) {
    boton.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(rutaImagen)).getImage()
            .getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
}
}
