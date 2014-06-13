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
public class clsClase2 
{
private int [][] matriz;
private Scanner teclado;
    public void CargarmatrizDiagonal()
   {
    teclado=new Scanner(System.in);
    matriz=new int[4][4];
    for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j]= teclado.nextInt();
           }
           
       }
            
   }
    public void ImprimirDiagonal()
    {
         for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
              if(i==j)
              {
                  System.out.print(matriz[i][j]+"*");
              }
              else
              {
                  System.out.print("_"+" ");
              }
           }
             System.out.println();
       }
    }
    
}
