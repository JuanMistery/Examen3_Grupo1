/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 22ram
 */
public class CuentaCorriente extends Cuenta{
    private float limiteDeGiro;

    public CuentaCorriente(float limiteDeGiro, float saldoCuenta, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(saldoCuenta, clave, tipoCuenta, titularDeCuenta);
        this.limiteDeGiro = limiteDeGiro;
    }

    public CuentaCorriente(float limiteDeGiro, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(clave, tipoCuenta, titularDeCuenta);
        this.limiteDeGiro = limiteDeGiro;
    }

    public float getLimiteDeGiro() {
        return limiteDeGiro;
    }

    public void setLimiteDeGiro(float limiteDeGiro) {
        this.limiteDeGiro = limiteDeGiro;
    }

    @Override
    public float calcularITF(float cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
