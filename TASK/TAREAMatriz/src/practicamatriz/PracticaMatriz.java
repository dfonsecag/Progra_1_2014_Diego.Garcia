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
public class PracticaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("DIGITE EL EJERCISIO QUE DESEA VER DEL 1 AL 4");
            opc= teclado.nextInt();
            switch(opc)
            {
                case 1:
                     clsClase1 cls1= new clsClase1();
        cls1.CargarmatrizDiagonal();
        cls1.Imprimir();
                    break;
                case 2:
        clsClase2 cls2 = new clsClase2();
        cls2.CargarmatrizDiagonal(); 
        System.out.println("INTERCAMBIO DE POSICIONES DE LA  MATRIZ");
        cls2.Intercambiarfila1();
        cls2.Intercambiarfila2();
                    break;
                case 3:
        clsclase3 cls3 = new clsclase3();
        cls3.CargarmatrizDiagonal();
        cls3.Vertices();
                    break;
                case 4:
        clsClase4 cls4 = new clsClase4();
        cls4.CargarmatrizDiagonal();
        cls4.imprimirMayor();   
                    break;
            }
        }while(opc<4);
                
       
    }
    
}
