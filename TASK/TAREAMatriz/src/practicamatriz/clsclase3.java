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
public class clsclase3 {

    int filas, columnas;
    private int[][] matriz;
    private Scanner teclado;

    public void CargarmatrizDiagonal() {
        teclado = new Scanner(System.in);

        System.out.println("INGRESE LA CANTIDAD DE FILAS");
        filas = teclado.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE COLUMNAS");
        columnas = teclado.nextInt();
        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("INGRESE EL NUMERO CORRESPONDIENTE");
                matriz[i][j] = teclado.nextInt();
            }

        }

    }

    public void Vertices() {
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //
                if (i == 0 && j == 0) {
                    System.out.print(matriz[i][j]+" ");
                } 
                else if (i == 0&&columnas-1==j) 
                {
                    System.out.print(matriz[i][j]+" ");
                } 
                else if(i==filas-1 && j==0)
                {                    
                  System.out.print(matriz[i][j]+" ");             
                }
                //
                else if(j==columnas-1&&filas-1==i)
                {
                    System.out.print(matriz[i][j]+" ");
                  
                }
                else 
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
