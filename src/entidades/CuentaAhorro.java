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
    private ArrayList<Persona> beneficiarios;

    public CuentaAhorro(float limiteDeRetiro, ArrayList<Persona> beneficiarios, float saldoCuenta, String clave, Cliente titularDeCuenta,int tipoDeIntereses, int tipoMonedaCuenta) {
        super(saldoCuenta, clave, titularDeCuenta, 1, tipoDeIntereses, tipoMonedaCuenta);
        this.limiteDeRetiro = limiteDeRetiro;
        this.beneficiarios = beneficiarios;
    }

    public float getLimiteDeRetiro() {
        return limiteDeRetiro;
    }

    public void setLimiteDeRetiro(float limiteDeRetiro) {
        this.limiteDeRetiro = limiteDeRetiro;
    }
    
}
