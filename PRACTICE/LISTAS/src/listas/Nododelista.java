/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author DIEGO
 */
public class Nododelista {
    private String dato;
    private String CuentaBancaria;
    private Nododelista siguiente;
    public Nododelista()
    {
        dato="";
        siguiente=null;
    }

    /*
    return el dato
     */
    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    /*
    return el siguiente.
    */
    public Nododelista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nododelista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
