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
public class ClienteNatural {
    private String dni;
    private String estadoCivil;
    private GregorianCalendar fechaNacimiento;

    public ClienteNatural(String dni, String estadoCivil, GregorianCalendar fechaNacimiento) {
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
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
        return super.toString()+
                "\n\tDNI: "+ getDni()+
                "\n\tEstado Civil: "+ getEstadoCivil()+
                "\n\tFecha Nacimiento: "+ getFechaNacimientoCorta();
    }
    
    public String getFechaNacimientoCorta() {
        int dia, mes, anio;
        dia = getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        mes = getFechaNacimiento().get(Calendar.MONTH)+1;
        anio = getFechaNacimiento().get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
    }
}
