/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoborrador;

/**
 *
 * @author DIEGO
 */
public class ListaJugador {
    private NodoJugador listaJugadores;
    private NodoJugador listaOrdenada;
 private int []arreglo;
    public void Insertar(String nombre, int edad) {
       arreglo = new int[12];NodoJugador nuevo;
        nuevo = new NodoJugador();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        for (int i = 0; i <arreglo.length; i++) {
            
        
         arreglo[i]=edad;
        if (getListaJugadores() == null) {
            nuevo.setSiguienteJugador(null);
            setListaJugadores(nuevo);
           
        } else {
            NodoJugador auxiliar = getListaJugadores();
            while (auxiliar.getSiguienteJugador()!= null) {
                auxiliar = auxiliar.getSiguienteJugador();
          
            }
            auxiliar.setSiguienteJugador(nuevo);
        }
        }
    }
public void Ordenar()
{
   int indice;
        int indice2;
        int auxiliar;
       
        
        for (indice = 0; indice < arreglo.length - 1; indice++) {

            for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    auxiliar = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = auxiliar;

                }

            }

        }
}
public void OrdenarLista()
{
     NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            for (int i = 0; i <arreglo.length; i++) {
                if(arreglo[i]==recorridoJugador.getEdad())
                {
                    NodoJugador nuevo;
        nuevo = new NodoJugador();
       //nuevo.setNombre(nombre);
      //  nuevo.setEdad(edad);
        if (getListaJugadores() == null) {
            nuevo.setSiguienteJugador(null);
            setListaJugadores(nuevo);
        } else {
            NodoJugador auxiliar = getListaJugadores();
            while (auxiliar.getSiguienteJugador() != null) {
                auxiliar = auxiliar.getSiguienteJugador();
            }
            auxiliar.setSiguienteJugador(nuevo);
        }
                }
            }
        }
     
}
         
    public void Imprimir() {
        NodoJugador recorridoJugador = listaOrdenada;

        System.out.println("Listado de todos los elementos de la lista ordenada");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getListaJugadores() == null;
    }

    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                if (siguienteJugador == listaJugadores) 
                {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }
    
    public NodoJugador BuscarJugador(String nombre)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }
    
    public void ModificarJugador(String nombre,String nuevoNombre,int edad)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
