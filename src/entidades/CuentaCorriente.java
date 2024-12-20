/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidades.CuentaCorriente.Chequera.Cheque;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 22ram
 */
public class CuentaCorriente extends Cuenta implements Serializable{
    private float limiteDeGiro;
    private int LimiteDeCheques;
    ArrayList<Chequera> chequeras = new ArrayList<Chequera>();

    public CuentaCorriente(float limiteDeGiro, int LimiteDeCheques, float saldoCuenta, String clave, Cliente titularDeCuenta,int tipoDeIntereses, int tipoMonedaCuenta) {
        super(saldoCuenta, clave, titularDeCuenta, 2, tipoDeIntereses, tipoMonedaCuenta);
        this.limiteDeGiro = limiteDeGiro;
        this.LimiteDeCheques = LimiteDeCheques;
        crearChequera(LimiteDeCheques);
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
    
    public class Chequera implements Serializable{
        private int limiteCheques;
        private String numeroChequera;
        private int numeroCheques=0;
        private float comisionPorCheques;
        private static int numeroDeChequeras=0;
        ArrayList<Cheque> cheques = new ArrayList<Cheque>();

        public Chequera(int limiteCheques, float comisionPorCheques) {
            this.limiteCheques = limiteCheques;
            this.comisionPorCheques = comisionPorCheques;
            numeroDeChequeras++;
            numeroChequera = generarNumeroChequera();
        
        }
        
        public Chequera(int limiteCheques) {
            this.limiteCheques = limiteCheques;
            this.comisionPorCheques = 0.01f;
            numeroDeChequeras++;
            numeroChequera = generarNumeroChequera();
       
        }
    
        public String generarNumeroChequera(){
            int numDig=0, num=0, dato=0;
            String numCuenta = "";
        
            num = dato = numeroDeChequeras;
            numCuenta = "C-";
        
            while (num > 9) {
                numDig++;
                num /= 10;
            }
            numDig++;
            for(int i=0;i<4-numDig; i++)
                numCuenta += "0";
            numCuenta += dato;
            return numCuenta;
        }

        public int getLimiteCheques() {
            return limiteCheques;
        }

        public String getNumeroChequera() {
            return numeroChequera;
        }

        public float getComisionPorCheques() {
            return comisionPorCheques;
        }

        public void setComisionPorCheques(float comisionPorCheques) {
            this.comisionPorCheques = comisionPorCheques;
        }

        public static int getNumeroDeChequeras() {
            return numeroDeChequeras;
        }

        public int getNumeroCheques() {
            return numeroCheques;
        }
        

        @Override
        public String toString() {
            return "Chequera: "+getNumeroChequera()+
                    "Cantidad maxima de cheques: "+getLimiteCheques()+
                    "Comision por cheques: "+getComisionPorCheques();
        }
        
        public class Cheque implements Serializable{
            private String numeroCheque="";
            private String cobrador;
            private float monto;
            private boolean cobrado;
            
            public Cheque(String cobrador, int numeroCheque, float monto){
                this.cobrador = cobrador;
                this.numeroCheque = numeroChequera+"C-"+numeroCheque;
                this.monto = monto;
                cobrado = false;
            }

            public String getNumeroCheque() {
                return numeroCheque;
            }

            public String getCobrador() {
                return cobrador;
            }

            public float getMonto() {
                return monto;
            }

            public boolean getCobrado() {
                return cobrado;
            }

            public void setCobrado(boolean cobrado) {
                this.cobrado = cobrado;
            }
            
            
        }
        
        public boolean agregarCheque(String cobrador, float monto){
            numeroCheques++;
            if(limiteCheques<=numeroCheques){
                return false;
            }
            Cheque cheque = new Cheque(cobrador, numeroCheques , monto);
            cheques.add(cheque);
            
            return true;
        }
        public Cheque obtenerCheque(int posicion){
            return cheques.get(posicion);
        }
        
        public int buscarCheque(String numeroCheque){
            Cheque cheque;
            for (int i=0;i<cheques.size();i++){
                cheque = cheques.get(i);
                if(!cheque.getCobrado()){
                    if(cheque.getNumeroCheque().compareTo(numeroCheque)==0)
                        return i;
                }
            }
            return -1;
        }
        
    }
    
    public boolean crearChequera(int limiteCheques){
        Chequera chequera = new Chequera(limiteCheques);
        chequeras.add(chequera);
        return true;
    }
    
    public int buscarChequeTodasChequeras(String numeroCheque){
        Chequera chequera;
        for (int i=0;i<chequeras.size();i++){
            chequera = chequeras.get(i);
            int posicion = chequera.buscarCheque(numeroCheque);
            if(posicion !=-1)
                return i;
        }
        return -1;
    }
    
    public boolean cobrarChequera(String numeroCheque){
        Chequera chequera;
        Cheque cheque;
        int posicion = buscarChequeTodasChequeras(numeroCheque);
        chequera = chequeras.get(posicion);
        int posicionCheque = chequera.buscarCheque(numeroCheque);
        cheque = chequera.obtenerCheque(posicion);
        cheque.setCobrado(true);
        super.setSaldoCuenta(super.getSaldoCuenta()-cheque.monto);
        return true;
    }
    
    public boolean cobrarChequera(int posicionCheqera, int posicionCheque, float monto){
        Chequera chequera;
        Cheque cheque;
        chequera = chequeras.get(posicionCheqera);
        cheque = chequera.obtenerCheque(posicionCheque);
        cheque.setCobrado(true);
        super.setSaldoCuenta(super.getSaldoCuenta()-monto);
        return true;
    }
    
    
     public Chequera obtenerChequera(int posicion){
         return chequeras.get(posicion);
     }
     
     public int buscarChequeraDisponible(){
         Chequera chequera;
         System.out.println(chequeras.size());
        for (int i=0;i<chequeras.size();i++){
            chequera = chequeras.get(i);
            
            System.out.println("Chequera " + i + ": NumeroCheques=" + chequera.getNumeroCheques() + 
                           ", LimiteCheques=" + chequera.getLimiteCheques());
            if(chequera.getNumeroCheques()<=chequera.getLimiteCheques())
                return i;
        }
        
         System.out.println("-1");
        return -1;
     }
    
}
