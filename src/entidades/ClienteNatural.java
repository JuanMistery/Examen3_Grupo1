/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author misterioso
 */
public class ClienteNatural extends Cliente {
    private int tipoDeDocumentoDeIdentidad;
    private String documentoDeIdentidad;
    private String estadoCivil;
    private GregorianCalendar fechaNacimiento;

    public ClienteNatural(int tipoDeDocumentoDeIdentidad, String documentoDeIdentidad, String estadoCivil, GregorianCalendar fechaNacimiento, int tipoCliente, String nombres, String apellidos, String direccion, String telefono, String correoElectronico) {
        super(tipoCliente, nombres, apellidos, direccion, telefono, correoElectronico);
        this.tipoDeDocumentoDeIdentidad = tipoDeDocumentoDeIdentidad;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTipoDeDocumentoDeIdentidad() {
        return tipoDeDocumentoDeIdentidad;
    }

    public String getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ DocumentoDeIdentidad()+
                "\n\tEstado Civil: "+ getEstadoCivil()+
                "\n\tFecha Nacimiento: "+ getFechaNacimientoCorta();
    }
    
    public String DocumentoDeIdentidad()
    {
        if(getTipoDeDocumentoDeIdentidad()==1)
        {
            return "\n\tDNI: "+ getDocumentoDeIdentidad();
        }
        else
        {
            if(getTipoDeDocumentoDeIdentidad()==2)
            {
                return "\n\tPasaporte: "+getDocumentoDeIdentidad();
            }
            else
            {
                return "\n\tCedula: "+getDocumentoDeIdentidad();
            }
        }
    }
    
    public String getFechaNacimientoCorta() {
        int dia, mes, anio;
        dia = getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        mes = getFechaNacimiento().get(Calendar.MONTH)+1;
        anio = getFechaNacimiento().get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
    }
}
