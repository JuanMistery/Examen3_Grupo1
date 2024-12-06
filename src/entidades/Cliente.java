/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author JuanMistery
 */
public class Cliente extends Persona{
    private int tipoCliente;

    public Cliente(int tipoCliente, String nombreCompleto, String direccion, String telefono, String correoElectronico) {
        super(nombreCompleto, direccion, telefono, correoElectronico);
        this.tipoCliente = tipoCliente;
    }
    
}
