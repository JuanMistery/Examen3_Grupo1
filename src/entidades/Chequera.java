/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author ramos
 */
public class Chequera {
    private int limiteCheques;
    private String numeroChequera;
    private float comisionPorCheques;
    private static int numeroDeChequeras=0;

    public Chequera(int limiteCheques, float comisionPorCheques) {
        this.limiteCheques = limiteCheques;
        this.comisionPorCheques = comisionPorCheques;
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
        for(int i=0;i<8-numDig; i++)
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

    @Override
    public String toString() {
        return "Chequera: "+getNumeroChequera()+
                "Cantidad maxima de cheques: "+getLimiteCheques()+
                "Comision por cheques: "+getComisionPorCheques();
    }

    
    
    
    
}
