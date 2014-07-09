/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_burbuja;

/**
 *
 * @author DIEGO
 */
public class Metodo_Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int[] arreglo = {56, 4, 85, 85, 42};
        int[] arregloOrdenado;
        clsMetodoBurbuja cls = new clsMetodoBurbuja();
        arregloOrdenado = cls.Ordenamiento(arreglo, "A");
        System.out.println("ORDENAMIENTO BURBUJA");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
            
        }
    }*/
        String[] Arreglo1 ={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        clsLineal cls1 = new clsLineal();
        System.out.println("La busqueda lineal es:  "+cls1.BuscarNombre(Arreglo1, "Efren"));
        System.out.println();
         String[] Arreglo2 ={"Campbell","Agustin","Susana","Elias","Efren","Mario"};
        clsBusquedaBinaria cls2 = new clsBusquedaBinaria();
        System.out.println("LA BUSQUEDA BINARIA ES:  "+cls2.BuscarNombre(Arreglo2, "Campbell"));
    }
    
}
