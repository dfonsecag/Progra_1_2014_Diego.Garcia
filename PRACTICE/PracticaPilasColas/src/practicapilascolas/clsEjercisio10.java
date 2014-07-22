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
public class clsEjercisio10 {
    private NodoLista raiz;
    private NodoLista raiz2;
public clsEjercisio10()
{
raiz=null;
raiz=null;
}        
    public void Push(String dato)
{
NodoLista nuevo;
nuevo=new NodoLista();
nuevo.setDato(dato);
if(raiz==null)
{
dato="";
raiz=nuevo;
}   
else
{
nuevo.setSiguiente(raiz);
raiz=nuevo;
}

}  
    public void Intercambiar()
{
NodoLista recorrido=raiz;
NodoLista nuevo1;
nuevo1=new NodoLista();

    
while(recorrido!=null)
{
   
  if(raiz2==null)
{
dato="";
raiz2=nuevo;
}   
else
{
nuevo.setSiguiente(raiz2);
raiz2=nuevo;
}
}   
    System.out.println();
} 
}
