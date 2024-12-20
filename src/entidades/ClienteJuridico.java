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
    private String direccionFiscal;
    private String direccionOperacion;
    private String telefonoJuridico;
    private String correoElectronicoJuridico;
    private String documentoConstitucion;

    public ClienteJuridico(String razonSocial, String ruc, String direccionFiscal, String direccionOperacion, String telefonoJuridico, String correoElectronicoJuridico, String documentoConstitucion,String nombres, String apellidos, String direccion, String telefono, String correoElectronico) {
        super(2, nombres, apellidos, direccion, telefono, correoElectronico);
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.direccionFiscal = direccionFiscal;
        this.direccionOperacion = direccionOperacion;
        this.telefonoJuridico = telefonoJuridico;
        this.correoElectronicoJuridico = correoElectronicoJuridico;
        this.documentoConstitucion = documentoConstitucion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getDireccionOperacion() {
        return direccionOperacion;
    }

    public void setDireccionOperacion(String direccionOperacion) {
        this.direccionOperacion = direccionOperacion;
    }

    public String getTelefonoJuridico() {
        return telefonoJuridico;
    }

    public void setTelefonoJuridico(String telefonoJuridico) {
        this.telefonoJuridico = telefonoJuridico;
    }

    public String getCorreoElectronicoJuridico() {
        return correoElectronicoJuridico;
    }

    public void setCorreoElectronicoJuridico(String correoElectronicoJuridico) {
        this.correoElectronicoJuridico = correoElectronicoJuridico;
    }

    public String getDocumentoConstitucion() {
        return documentoConstitucion;
    }

    public void setDocumentoConstitucion(String documentoConstitucion) {
        this.documentoConstitucion = documentoConstitucion;
    }
    
    @Override
    public String toString()
    {
        return "\n\tRazon Social: "+ getRazonSocial()+
                "\n\tRUC: "+ getRuc()+
                "\n\tDireccion Fiscal: "+ getDireccionFiscal()+
                "\n\tDireccion de Operacion: " + getDireccionOperacion()+
                "\n\tTelefono: "+ getTelefonoJuridico()+
                "\n\tCorreo Electronico: "+ getCorreoElectronicoJuridico()+
                super.toString()+
                "\n\tDocumento de Constitucion: "+ getDocumentoConstitucion();
    }
}
