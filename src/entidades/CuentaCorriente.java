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
    private int LimiteDeCheques;

    public CuentaCorriente(float limiteDeGiro, int LimiteDeCheques, float saldoCuenta, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(saldoCuenta, clave, tipoCuenta, titularDeCuenta);
        this.limiteDeGiro = limiteDeGiro;
        this.LimiteDeCheques = LimiteDeCheques;
    }

    public CuentaCorriente(float limiteDeGiro, int LimiteDeCheques, String clave, int tipoCuenta, Cliente titularDeCuenta) {
        super(clave, tipoCuenta, titularDeCuenta);
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
