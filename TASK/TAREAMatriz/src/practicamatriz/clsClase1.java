/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class clsClase1 {
    private int [][] matriz;
    private int [][] matriz2;
private Scanner teclado;
    public void CargarmatrizDiagonal()
   {
    teclado=new Scanner(System.in);
    matriz=new int[5][2];
   // matriz2=new int[2][5];
    for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j]= teclado.nextInt();
           }
           
       }
            
   }
    public void Imprimir()
   {
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(matriz[j][i]+"_");
           }
           System.out.println();
       }
   }
}
