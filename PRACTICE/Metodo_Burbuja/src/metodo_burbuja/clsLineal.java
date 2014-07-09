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
// LINEAL O SENCUENCIAL...
public class clsLineal {
 public int BuscarNombre(String[] Nombres, String busqueda)
 {
     for (int i = 0; i < Nombres.length; i++) {
         if(Nombres[i].equals(busqueda))
         {
         return i;
         }
     }
     return -1;
 }
}
