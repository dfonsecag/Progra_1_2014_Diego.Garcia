/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 * NAME:STRING DATE 28/05/2014
 *
 * @author DIEGO
 */
public class STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// REALIZAR UNA CLASE  
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        String cadena;
        do {
            System.out.println("DIGITE EL NUMERO DE OPCION");
            System.out.println("1.EJERCISIO");
            System.out.println("2.EJERCISIO");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("DIGITE EL CORREO ELECTRONICO PERTENECIENTE A EVALUAR");
                    teclado= new Scanner(System.in);
                    ejercisioString op = new ejercisioString(teclado.nextLine());
                    System.out.println(op.ValidarCorreo());
                    break;
                case 2:  
                    System.out.println("DIGITE LA CADENA DE CARACTERES");
                    ejercisio2 ejr = new ejercisio2();
                    teclado= new Scanner(System.in);                    
                    ejr.setCadena(teclado.nextLine());                    
                    System.out.println(ejr.MediaCadena());
                    System.out.println(ejr.UltimoValor());
                    System.out.println(ejr.Alrevez());
                    System.out.println(ejr.Guion());
                    System.out.println(ejr.vocales());
                    System.out.println(ejr.Palindromo());
                    break;
            }
        } while (opc <= 7);

// TODO code application logic here
    }

}
