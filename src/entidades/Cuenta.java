/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 22ram
 */
public class Cuenta {
    private String numeroCuenta;
    private float saldoCuenta;
    private String clave;
    private GregorianCalendar fechaCreacion;
    private int tipoCuenta;
    private int tipoMonedaCuenta;
    private static int totalCuentasAhorro;
    private static int totalCuentasCorriente;
    
    
    public Cuenta(float saldoCuenta, String clave, int tipoCuenta) { 
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
        this.clave = clave;
        fechaCreacion = new GregorianCalendar();
        if(tipoCuenta == 1)
            ++totalCuentasAhorro;
        else
            ++totalCuentasCorriente;
        numeroCuenta = generarNumeroCuenta();
    }
    
    public Cuenta(String clave, int tipoCuenta) { 
        this.tipoCuenta = tipoCuenta;
        saldoCuenta = 0.0f;
        this.clave = clave;
        fechaCreacion = new GregorianCalendar();
        if(tipoCuenta == 1)
            ++totalCuentasAhorro;
        else
            ++totalCuentasCorriente;
        numeroCuenta = generarNumeroCuenta();
    }
    
    private String generarNumeroCuenta() {
        int numDig=0, num=0, dato=0;
        String numCuenta = "";
        switch(tipoCuenta) {
            case 1:
                num = dato = totalCuentasAhorro;
                numCuenta = "A";
                break;
            case 2:
                num = dato = totalCuentasCorriente;
                numCuenta = "C";
                break;
        }
        while (num > 9) {
            numDig++;
            num /= 10;
        }
        numDig++;
        for(int i=0;i<10-numDig; i++)
            numCuenta += "0";
        numCuenta += dato;        
        return numCuenta;
    } 
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
       
    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public float getSaldoCuenta() {
        return saldoCuenta;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String getClave() {
        return clave;
    }

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }
    
    public int getTipoCuenta() {
        return tipoCuenta;
    }
    
    public static int obtenerTotalCuentasAhorro() {
        return totalCuentasAhorro;
    }
    
    public static int obtenerTotalCuentasCorriente() {
        return totalCuentasCorriente;
    }
    
    @Override
    public String toString() {
        return "\n\tTipo de cuenta: " + (tipoCuenta==1?"Cuenta de Ahorro":"Cuenta Corriente") +
               "\n\tNumero de cuenta: " + getNumeroCuenta() + 
               "\n\tFecha de apertura: " + getFechaCreacionCorta();
    }
    
    public String getFechaCreacionCorta() {
        int dia, mes, anio;
        dia = getFechaCreacion().get(Calendar.DAY_OF_MONTH);
        mes = getFechaCreacion().get(Calendar.MONTH)+1;
        anio = getFechaCreacion().get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
    }

    public boolean validarClave(String clave) {
        return (getClave().compareTo(clave)==0);
    }
}
