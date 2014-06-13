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
public class clsclase3 {
    private int [][] matriz;
private Scanner teclado;
    public void CargarmatrizDiagonal()
   {
    teclado=new Scanner(System.in);
    matriz=new int[3][4];
    for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j]= teclado.nextInt();
           }
           
       }
            
   }
    public void PrimeraFila()
    {
        System.out.println("PRIMERA FILA DE MATRICES");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[0][i]);
        }
    }
    public void UltimaFila()
    {
        System.out.println();
        System.out.println("ULTIMA FILA DE MATRICES");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[2][i]);
        }
    }
}
