/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class clsClase11 {
   private int [][] matriz;
   private Scanner teclado;
   
   public void CargarMatriz()
   {
       teclado=new Scanner(System.in);
       matriz=new int [3][5];
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j]= teclado.nextInt();
           }
           
       }
   }
   public void Imprimir()
   {
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(matriz[i][j]+" ");
           }
           System.out.println();
       }
   }

    
}
