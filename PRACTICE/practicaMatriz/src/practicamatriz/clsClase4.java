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
public class clsClase4 {
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
   
        public void imprimirMayor() {
    	int mayor=matriz[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int f=0;f<filas;f++) {
            for(int c=0;c<columnas;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    }
    }

