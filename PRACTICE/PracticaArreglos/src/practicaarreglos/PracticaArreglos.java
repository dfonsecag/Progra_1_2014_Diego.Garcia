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
        do
        {
            System.out.println("DIGITE EL EJERCISIO QUE DESEA VER");
            opc= teclado.nextInt();
            switch(opc)
            {
                case 1:
             
     oclsejercisio.AgregarCursoA();
     oclsejercisio.AgregarCursoB();
     oclsejercisio.promedio();
                    break;
                    case 2:
             oclsejercisio.Agregarvalores();
                        oclsejercisio.Imprimir();
                        break;
                    case 3:
                        oclsejercisio.AgregarOrdenado();
                        oclsejercisio.Ordenado();
                        break;
                    case 4:
                        oclsejercisio.AgregarvaloresSuma();
                        oclsejercisio.sumarValores();
                         
            }
        }while(opc<=4);
    }
}
