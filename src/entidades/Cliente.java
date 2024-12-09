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

    public Cliente(int tipoCliente, String nombres, String apellidos, String direccion, String telefono, String correoElectronico) {
        super(nombres, apellidos, direccion, telefono, correoElectronico);
        this.tipoCliente = tipoCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public String toString()
    {
        if(tipoCliente==1)
        {
            return super.toString();
        }
        else
        {
            return "Representante Legal: "+ getNombres()+" "+getApellidos()+
                    "Direccion del Representante Legal: "+ getDireccion()+
                    "Telefono del Representante Legal: "+ getTelefono()+
                    "Correo Electronico del Representante Legal: "+ getCorreoElectronico();
        }
    }
    
}
