/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author 22ram
 */
public abstract class Cuenta implements ImptoTransaccionesFinancieras{
    private String numeroCuenta;
    private float saldoCuenta;
    private String clave;
    Cliente titularDeCuenta;
    private GregorianCalendar fechaCreacion;
    private int tipoCuenta;
    private int tipoDeIntereses;
    private int tipoMonedaCuenta;
    ArrayList<Operaciones> operaciones = new ArrayList<Operaciones>();
    private static int totalCuentasAhorro = 0;
    private static int totalCuentasCorriente = 0;
    
    
    
    public Cuenta (float saldoCuenta, String clave, int tipoCuenta, Cliente titularDeCuenta) { 
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
        this.clave = clave;
        this.titularDeCuenta = titularDeCuenta;
        fechaCreacion = new GregorianCalendar();
        
        if(tipoCuenta == 1)
            ++totalCuentasAhorro;
        else
            ++totalCuentasCorriente;
        numeroCuenta = generarNumeroCuenta();
    }
    
    public Cuenta(String clave, int tipoCuenta, Cliente titularDeCuenta) { 
        this.tipoCuenta = tipoCuenta;
        saldoCuenta = 0.0f;
        this.clave = clave;
        this.titularDeCuenta = titularDeCuenta;
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

    public Cliente getTitularDeCuenta() {
        return titularDeCuenta;
    }

    public void setTitularDeCuenta(Cliente titularDeCuenta) {
        this.titularDeCuenta = titularDeCuenta;
    }

    public int getTipoDeIntereses() {
        return tipoDeIntereses;
    }

    public void setTipoDeIntereses(int tipoDeIntereses) {
        this.tipoDeIntereses = tipoDeIntereses;
    }

    public int getTipoMonedaCuenta() {
        return tipoMonedaCuenta;
    }

    public void setTipoMonedaCuenta(int tipoMonedaCuenta) {
        this.tipoMonedaCuenta = tipoMonedaCuenta;
    }

    public static int getTotalCuentasAhorro() {
        return totalCuentasAhorro;
    }

    public static void setTotalCuentasAhorro(int totalCuentasAhorro) {
        Cuenta.totalCuentasAhorro = totalCuentasAhorro;
    }

    public static int getTotalCuentasCorriente() {
        return totalCuentasCorriente;
    }

    public static void setTotalCuentasCorriente(int totalCuentasCorriente) {
        Cuenta.totalCuentasCorriente = totalCuentasCorriente;
    }

    public ArrayList<Operaciones> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operaciones> operaciones) {
        this.operaciones = operaciones;
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
     public class Operaciones {
        private String numeroOperacion;
        private GregorianCalendar fechaOperacion;
        private int tipoOperacion;
        private float montoOperacion;

        public Operaciones(int tipoOperacion, float montoOperacion) {
            numeroOperacion = generarNumeroOperacion();
            fechaOperacion = new GregorianCalendar();
            this.tipoOperacion = tipoOperacion;
            this.montoOperacion = montoOperacion;
        }

        public String getNumeroOperacion() {
            return numeroOperacion;
        }

        public GregorianCalendar getFechaOperacion() {
            return fechaOperacion;
        }

        public void setTipoOperacion(int tipoOperacion) {
            this.tipoOperacion = tipoOperacion;
        }

        public int getTipoOperacion() {
            return tipoOperacion;
        }

        public void setMontoOperacion(float montoOperacion) {
            this.montoOperacion = montoOperacion;
        }
        
        public float getMontoOperacion() {
            return montoOperacion;
        }

        @Override
        public String toString() {
            String tipo = "";
            switch(tipoOperacion) {
                case 1: tipo = "Deposito"; break;
                case 2: tipo = "Retiro"; break;
                case 3: tipo = "Transferencia"; break;
                case 4: tipo = "ITF"; break;
                case 5: tipo = "Interes mensual"; break;
            }
            return "\n\tNumero de operacion: " + getNumeroOperacion() +
                   "\n\tFecha: " + getFechaOperacionCorta() + 
                   "\n\tTipo: " + tipo + "\n\tMonto: " + getMontoOperacion();
        }
        
        public String getFechaOperacionCorta() {
            int dia, mes, anio;
            dia = getFechaOperacion().get(Calendar.DAY_OF_MONTH);
            mes = getFechaOperacion().get(Calendar.MONTH)+1;
            anio = getFechaOperacion().get(Calendar.YEAR);
            return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
        }
        
        private String generarNumeroOperacion() {
            int numDig=0, num=0, dato=0;
            String numCuenta = "";
            num = dato = getOperaciones().size();
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
            public boolean realizarDeposito(float montoD) {
        Operaciones movimiento;
        setSaldoCuenta(getSaldoCuenta() + montoD);
        movimiento = new Operaciones(1, montoD);
        operaciones.add(movimiento);
        if(montoD >= 1000) {
            setSaldoCuenta(getSaldoCuenta() - calcularITF(montoD));
            movimiento = new Operaciones(4, calcularITF(montoD));
            operaciones.add(movimiento);
        }
        return true;
    }
    
    public boolean realizarRetiro(float montoR) {
        Operaciones movimiento;
        float montoITF = calcularITF(montoR);
        if(montoR >= 1000) {
            if(montoR + montoITF <= getSaldoCuenta()) {
                setSaldoCuenta(getSaldoCuenta() - montoR);
                movimiento = new Operaciones(2, montoR);
                operaciones.add(movimiento);
                setSaldoCuenta(getSaldoCuenta() - montoITF);
                movimiento = new Operaciones(4, montoITF);
                operaciones.add(movimiento);
                return true;
            }
            return false;
        } else {
            if(montoR <= getSaldoCuenta()) {
                setSaldoCuenta(getSaldoCuenta() - montoR);
                movimiento = new Operaciones(2, montoR);
                operaciones.add(movimiento);
                return true;
            }
        }
        return false;
    }
           
     public boolean realizarTransferencia(float montoTrans){
         return true;
     }
     public boolean emisionCheques(float montoCheque){
         return true;
     }
     public boolean cobroCheques(float montoCheque){
         return true;
     }
     public boolean verificacionCheques(String codigoCheque){
         return true;
     }
   }  
}

    
     

