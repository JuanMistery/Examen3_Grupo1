/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author JuanMistery
 */
public abstract class Persona {
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Persona()
    {
        
    }

    public Persona(String nombres, String apellidos, String direccion, String telefono, String correoElectronico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    @Override
    public String toString()
    {
        return "\n\tNombre: "+ getNombres()+ getApellidos()+
                "\n\tTelefono: "+ getTelefono()+
                "\n\tDireccion: "+ getDireccion()+
                "\n\tCorreo Electronico: "+getCorreoElectronico();
    }
}
