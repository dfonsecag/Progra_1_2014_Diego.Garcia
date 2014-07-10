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
public class lista {
    private Nododelista raiz;
    public lista()
    {
        raiz= null;
    }
    public void Insertar(String dato,String cuenta)
    {
        Nododelista nuevo;
        nuevo = new Nododelista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuenta);
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            Nododelista auxiliar= raiz;
            while(auxiliar.getSiguiente()!=null)
            {
                auxiliar= auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public void Imprimir()
    {
        Nododelista recorrido=raiz;
        System.out.println("LISTADO DE TODOS LOS ELEMENTOS DE LA LISTA");
        while(recorrido!=null)
        {
            System.out.println(recorrido.getDato()+"  la cuenta bancaria es: "+recorrido.getCuentaBancaria());
            recorrido=recorrido.getSiguiente();
        }
        System.out.println("");
    }
    public boolean vacia()
    {
        if(raiz==null)
        {
            return true;
        }
        return false;
    }
}
