/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        Scanner teclado = new Scanner(System.in);
        clsejercisio oclsejercisio = new clsejercisio();
        do {
            System.out.println("DIGITE EL EJERCISIO QUE DESEA VER// 5.SALIR");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    oclsejercisio.Agregarvalores();
                    oclsejercisio.Imprimir();
                    break;
                case 2:
                     oclsejercisio.AgregarvaloresSuma();
                    oclsejercisio.sumarValores();                    
                    break;
                case 3:
                   oclsejercisio.AgregarCursoA();
                    oclsejercisio.AgregarCursoB();
                    oclsejercisio.promedio();
                    break;
                case 4:
                    oclsejercisio.AgregarOrdenado();
                    oclsejercisio.Ordenado();
                    break;

            }
        } while (opc <= 4);
    }
}
