/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.util.ArrayList;
import entidades.*;
import java.io.*;
/**
 *
 * @author JuanMistery
 */
public class ListaCuentas implements Serializable{
    int cantidadCuentasAhorro=0;
    int cantidadCuentasCorriente=0;
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    public ListaCuentas() {
    }
    
    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
     
    public boolean agregarCuenta(Cuenta cuenta) {
        if(cuenta != null) {
            listaCuentas.add(cuenta);
            if(cuenta.getTipoCuenta()==1)
                cantidadCuentasAhorro++;
            else cantidadCuentasCorriente++;
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
        Cliente clienteB;
        for(int i=0; i<listaCuentas.size(); i++) {
            cuentaB = listaCuentas.get(i);
            clienteB=cuentaB.getTitularDeCuenta();
            switch(cuentaB.getTipoCuenta()) {
                case 1: 
                    if(clienteB.getApellidos().compareToIgnoreCase(apellido)==0)
                        return i;
                    break;
                case 2: 
                    if(clienteB.getApellidos().compareToIgnoreCase(apellido)==0)
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
    
    public int buscarPorNumeroCuenta(String numero) {
        Cuenta cuentaB;
        for(int i=0; i<listaCuentas.size(); i++) {
            cuentaB = listaCuentas.get(i);
            if(cuentaB.getNumeroCuenta().compareToIgnoreCase(numero)==0)
                return i;
        }
        return -1;
    }
    
    public boolean guardarEnArchivo(String Archivo) {
        actualizarNumeroCuentas();  

    
        System.out.println("Saldo antes de guardar: " + obtenerCuenta(0).getSaldoCuenta()); 

    
        File archivo = new File(Archivo);
        if (archivo.exists()) {
            archivo.delete(); 
        }

    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Archivo))) {
      
            oos.writeObject(this); 
            System.out.println("Ahorro: " + cantidadCuentasAhorro + " Corriente: " + cantidadCuentasCorriente);
            return true;  
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
            e.printStackTrace();  
            return false; 
        }
        
    }

    
    public static ListaCuentas cargarCuentas(String Archivo)
    {
        ListaCuentas lista = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Archivo))) {
            lista = (ListaCuentas) ois.readObject(); // Cargar la lista de cuentas desde el archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar el archivo o el archivo está vacío. Se devolverá una lista vacía.");
            lista = new ListaCuentas(); 
        }
        return lista;
    }
    
    public void actualizarLista(Cuenta cuenta)
    {
        for(int i=0;i<listaCuentas.size();i++)
        {
            if(listaCuentas.get(i).getNumeroCuenta().equalsIgnoreCase(cuenta.getNumeroCuenta()))
            {
                listaCuentas.set(i, cuenta);
            }
        }
    }
    
    public void actualizarNumeroCuentas(){
        Cuenta.setTotalCuentasAhorro(cantidadCuentasAhorro);
        Cuenta.setTotalCuentasCorriente(cantidadCuentasCorriente);
    }
    
    public void mostrarCuentas(){
        Cuenta cuentaB;
        for(int i=0; i<listaCuentas.size(); i++) {
            cuentaB = listaCuentas.get(i);
            System.out.println(cuentaB.toString());
                
        }
        
    }
    
    public int buscarChequeraCuentaCorriente(String numeroCheque){
        Cuenta cuentaB;
        int posicion;
        for(int i=0;i<listaCuentas.size();i++){
            cuentaB = listaCuentas.get(i);
            if(cuentaB.getTipoCuenta()==2){
                posicion = ((CuentaCorriente)cuentaB).buscarChequeTodasChequeras(numeroCheque);
                if(posicion!=-1)
                    return i;
            }
        }
        return -1;
    }
}