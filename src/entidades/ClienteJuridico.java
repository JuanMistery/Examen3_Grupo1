/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;



/**
 *
 * @author JuanMistery
 */
public class ClienteJuridico extends Cliente{
    private String razonSocial;
    private String ruc;
    private String documentoConstitucion;
    private Persona representanteLegal;

    public ClienteJuridico(String razonSocial, String ruc, String documentoConstitucion, Persona representanteLegal, int tipoCliente, String nombreCompleto, String direccion, String telefono, String correoElectronico) {
        super(tipoCliente, nombreCompleto, direccion, telefono, correoElectronico);
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.documentoConstitucion = documentoConstitucion;
        this.representanteLegal = representanteLegal;
    }
    
}
