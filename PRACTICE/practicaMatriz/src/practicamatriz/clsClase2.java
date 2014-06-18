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
public class clsClase2 {
    int filas, columnas;
    private int [][] matriz;
private Scanner teclado;

    public void CargarmatrizDiagonal()
   {
       teclado = new Scanner(System.in);
               
       System.out.println("INGRESE LA CANTIDAD DE FILAS");
       filas= teclado.nextInt();
       System.out.println("INGRESE LA CANTIDAD DE COLUMNAS");
       columnas= teclado.nextInt();
       matriz=new int[filas][columnas];
       
       
    for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j]= teclado.nextInt();
           }
           
       }
            
   }
    public void Intercambiarfila1()
    {
        /*
        filas columnas
        1      1  2 3
        2
        */
        
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
    public void Intercambiarfila2()
    {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
    public void filas()
       {
        for (int i = 2; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }     
}
