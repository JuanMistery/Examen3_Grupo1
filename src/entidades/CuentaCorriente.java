/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author 22ram
 */
public class CuentaCorriente extends Cuenta implements Serializable{
    private float limiteDeGiro;
    private int LimiteDeCheques;

    public CuentaCorriente(float limiteDeGiro, int LimiteDeCheques, float saldoCuenta, String clave, Cliente titularDeCuenta,int tipoDeIntereses, int tipoMonedaCuenta) {
        super(saldoCuenta, clave, titularDeCuenta, 2, tipoDeIntereses, tipoMonedaCuenta);
        this.limiteDeGiro = limiteDeGiro;
        this.LimiteDeCheques = LimiteDeCheques;
    }

    public float getLimiteDeGiro() {
        return limiteDeGiro;
    }

    public void setLimiteDeGiro(float limiteDeGiro) {
        this.limiteDeGiro = limiteDeGiro;
    }

    public int getLimiteDeCheques() {
        return LimiteDeCheques;
    }

    public void setLimiteDeCheques(int LimiteDeCheques) {
        this.LimiteDeCheques = LimiteDeCheques;
    }
 
}
