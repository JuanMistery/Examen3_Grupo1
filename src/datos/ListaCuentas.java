/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.util.ArrayList;
import entidades.*;
/**
 *
 * @author JuanMistery
 */
 class ListaCuentas {
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();
    
    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
     
    public boolean agregarCuenta(Cuenta cuenta) {
        if(cuenta != null) {
            listaCuentas.add(cuenta);
            return true;
        }
        return false;
    }
    
    public Cuenta obtenerCuenta(int pos) {
        if(pos>=0 && pos<listaCuentas.size()) 
            return listaCuentas.get(pos);
        return null;
    }
    
    public int buscarPorApellido(String apellido) {
        Cuenta cuentaB;
        for(int i=0; i<listaCuentas.size(); i++) {
            cuentaB = listaCuentas.get(i);
            switch(cuentaB.getTipoCuenta()) {
                case 1: 
                    if(((CuentaAhorro)cuentaB).getApellidos().compareToIgnoreCase(apellido)==0)
                        return i;
                    break;
                case 2: 
                    if(((CuentaCorriente)cuentaB).getApellidos().compareToIgnoreCase(apellido)==0)
                        return i;
                    break;
            }
        }
        return -1;
    }
    
    public int getTamanio() {
        return listaCuentas.size();
    }
      
    public ArrayList<Cuenta> listarCuentasPorTipo(int tipo) {
        Cuenta cuenta;
        ArrayList<Cuenta> lista = new ArrayList<>();
        for(int i=0; i<getTamanio(); i++) {
            cuenta = listaCuentas.get(i);
            if(cuenta.getTipoCuenta()==tipo) 
                lista.add(cuenta);
        }
        return lista;
    }               
}