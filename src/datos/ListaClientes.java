/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Misterioso
 */
public class ListaClientes {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
     
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public boolean agregarCliente(Cliente cliente) {
        if(cliente != null) {
            listaClientes.add(cliente);
            return true;
            
        }
        return false;
    }
    
    public Cliente obtenerCliente(int pos) {
        if(pos>=0 && pos<listaClientes.size()) 
            return listaClientes.get(pos);
        return null;
    }
    
    public int buscarPorApellido(String apellido) {
        Cliente clienteB;
        for(int i=0; i<listaClientes.size(); i++) {
            clienteB = listaClientes.get(i);
            if(clienteB.getApellidos().compareToIgnoreCase(apellido)==0)
                return i;
        }
        return -1;
    }
    
    public int getTamanio() {
        return listaClientes.size();
    }            
}
