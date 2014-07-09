/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodo_burbuja;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class clsMetodoBurbuja {
    public int[] Ordenamiento(int []arreglo, String ordenamiento)
    {
        String a="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE 'A PARA FORMA ASCENDENTE || 'D' PARA FORMA DESCENDENTE" );
        a = teclado.nextLine();
        int indice;
        int indice2;
        int Auxiliar;
        if(a.equals("A")||a.equals("a")){
        for (indice = 0; indice < arreglo.length-1; indice++) {
            
            for (indice2 = 0; indice2 < (((arreglo.length)-indice)-1); indice2++) {
                if(arreglo[indice2+1]<arreglo[indice2])
                {
                    Auxiliar=arreglo[indice2+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=Auxiliar;
                }
            }
        }
        }
        else
        {
            for (indice = 0; indice < arreglo.length-1; indice++) {
            
            for (indice2 = 0; indice2 < (((arreglo.length)-indice)-1); indice2++) {
                if(arreglo[indice2+1]>arreglo[indice2])
                {
                    Auxiliar=arreglo[indice2+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=Auxiliar;
                }
            }
        }
        }
        return arreglo;
    }
    
}
