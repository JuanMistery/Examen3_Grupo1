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
public class CuentaAhorro extends Cuenta {
    private float limiteDeRetiro;
    private GregorianCalendar fechaDeCorte;

    public CuentaAhorro(float limiteDeRetiro, GregorianCalendar fechaDeCorte, float saldoCuenta, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(saldoCuenta, clave, tipoCuenta, titularDeCuenta);
        this.limiteDeRetiro = limiteDeRetiro;
        this.fechaDeCorte = fechaDeCorte;
    }

    public CuentaAhorro(float limiteDeRetiro, GregorianCalendar fechaDeCorte, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(clave, tipoCuenta, titularDeCuenta);
        this.limiteDeRetiro = limiteDeRetiro;
        this.fechaDeCorte = fechaDeCorte;
    }

    public float getLimiteDeRetiro() {
        return limiteDeRetiro;
    }

    public void setLimiteDeRetiro(float limiteDeRetiro) {
        this.limiteDeRetiro = limiteDeRetiro;
    }
    
}
