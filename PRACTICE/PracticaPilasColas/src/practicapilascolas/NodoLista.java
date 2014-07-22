/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicapilascolas;

/**
 *
 * @author DIEGO
 */
public class NodoLista {
    private String dato;
private NodoLista siguiente;

public NodoLista()
{
dato="";
siguiente=null;
}   

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

}
