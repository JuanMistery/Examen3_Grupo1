/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author 22ram
 */
public class CuentaAhorro extends Cuenta {
    private float limiteDeRetiro;
    private GregorianCalendar fechaDeCorte;
    
    
    
    public CuentaAhorro(float saldoCuenta,String clave, int tipoCuenta,float limiteDeRetiro){
        super(saldoCuenta,clave, tipoCuenta);
        this.limiteDeRetiro = limiteDeRetiro;
    }
    public CuentaAhorro(String clave, int tipoCuenta,float limiteDeRetiro){
        super(clave, tipoCuenta);
        this.limiteDeRetiro = limiteDeRetiro;
    }

    public float getLimiteDeRetiro() {
        return limiteDeRetiro;
    }

    public void setLimiteDeRetiro(float limiteDeRetiro) {
        this.limiteDeRetiro = limiteDeRetiro;
    }
    
    
}
