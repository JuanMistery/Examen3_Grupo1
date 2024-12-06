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
    
    public CuentaCorriente(float saldoCuenta,String clave, int tipoCuenta,float limiteDeGiro){
        super(saldoCuenta,clave, tipoCuenta);
        this.limiteDeGiro = limiteDeGiro;
    }
    public CuentaCorriente(String clave, int tipoCuenta,float limiteDeGiro){
        super(clave, tipoCuenta);
        this.limiteDeGiro = limiteDeGiro;
    }

    public float getLimiteDeGiro() {
        return limiteDeGiro;
    }

    public void setLimiteDeGiro(float limiteDeGiro) {
        this.limiteDeGiro = limiteDeGiro;
    }
    
    
}
