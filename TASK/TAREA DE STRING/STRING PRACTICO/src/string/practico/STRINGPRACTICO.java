/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.practico;

import java.util.Scanner;

/**
 *NAME: PRACTICA DE STRING
 * DATE:01/06/2014
 * COPYRIHT
 * @author DIEGO
 */
public class STRINGPRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hago la instacia para leer el teclado..
        Scanner teclado = new Scanner(System.in);
        // instancia de la clase clsejer1
        clsejer1 ejr = new clsejer1();
           // variable para almacenar la opcion
        int opc = 0;

        do {

            System.out.println("DIGITE EL NUMERO DE OPCION DEL 1 HASTA 5 // (6.SALIR)");
            
            opc = teclado.nextInt();
            switch (opc) {
                // EN ESTE METODO VAMOS A INVERTIR LA  CADENA DE CARACTERES..
                case 1:
                    System.out.println("DIGITE UNA CADENA DE CARACTERES");
                    Scanner teclado1 = new Scanner(System.in);
                    ejr.setCadena(teclado1.nextLine());
                    System.out.println("LA CADENA INVERSA ES" + "  " + ejr.Inversa());
                    break;
                    // EN ESTE METODO SE CREA PARA FORMAR UN PALINDROMO
                case 2:
                    System.out.println("DIGITE UNA CADENA DE CARACTERES");
                    Scanner teclado2 = new Scanner(System.in);
                    ejr.setCadena(teclado2.nextLine());
                    System.out.println(ejr.Palindromo());
                    break;
                    // EN ESTE METODO BUSCAMOS UNA PALABRA Y LA MARCAMOS DENTRO DE LA CADENA DE CARACTERES..
                case 3:
                    System.out.println("DIGITE UNA CADENA DE CARACTERES");
                    Scanner teclado3 = new Scanner(System.in);
                    ejr.setCadena(teclado3.nextLine());
                    System.out.println("DIGITE LA PALABRA A BUSCAR");
                    ejr.setBuscar(teclado3.nextLine());
                    System.out.println(ejr.Buscarpalabra());
                    break;
                case 4:
                    Scanner teclado5 = new Scanner(System.in);
                    System.out.println("DIGITE LA CADENA DE CARACTERES");
                    ejr.setCadena(teclado5.nextLine());
                    System.out.println("DIGITE LA PALABRA QUE DESEA BUSCAR EN EL TEXTO");
                    ejr.setBuscarRepeticiones(teclado5.nextLine());
                    //System.out.println("LA PALABRA BUSCADA" + " " + ejr.getBuscarRepeticiones() + " " + "SE REPITEN" + " " + ejr.retornarCantidadPalabra());
                    break;
                    // EN ESTE CASE VAMOS A TENER VARIOS METODOS EN UNO SOLO, EN CADA UNO LO VOY A COMENTARIAR.
                case 5:
                    // RETORNA LA POSICION DEL CARACTER DE ACUERDO A LA POSICION QUE EL USUARIO DIGITE.
                    System.out.println("DIGITE UNA CADENA DE CARACTERES");
                    Scanner teclado4 = new Scanner(System.in);
                    ejr.setCadena(teclado4.nextLine());
                    System.out.println("INGRESE LA POSICION QUE DESEA VER EL CARACTER");
                    ejr.setComparar(teclado4.nextLine());
                    System.out.println("LA LETRA EN EL ESPACIO ES" + " " + ejr.Posicion());
                    // EN ESTE METODO VAMOS A COMPARAR DOS CADENAS DE CARACTERES MEDIANTE COMPARE TO..
                    System.out.println("DIGITE UNA OTRA CADENA DE CARCTERES QUE DESEA COMPARAR");
                    ejr.setCompararCadena(teclado4.nextLine());
                    System.out.println(ejr.CompararCadenas());
                    // EN ESTE METODO VEMOS LA LONGITUD DE LA CADENA..
                    System.out.println("LA LONGITUD DE LA CADENA ES" + " " + ejr.TamañoCadena());
                    //EN ESTE METODO MEDIANTE SUBSTRING VEMOS EL INICIO Y EL FINAL MEDIANTE LA POSICION
                    //QUE EL USUARIO DIGITE E IMPRIME DE ACUERDO A ESO PARAMETROS.
                    System.out.println("DIGITE EN NUMERO EL INICIO DE LA CADENA");
                    ejr.setIncioCadena(teclado4.nextLine());
                    System.out.println("DIGITE EN NUMERO EL FINAL DE LA CADENA");
                    ejr.setFinalCadena(teclado4.nextLine());
                    System.out.println("LOS PARAMETROS DE LA CADENA QUE DIGITO SON" + " " + ejr.UsoSubstring());
                    // EN ESTE METODO VAMOS A COVERTIR A  MAYUSCULA TODOS LOS CARACTERES DEL TEXTO.
                    System.out.println(ejr.TOUpperCase());                    
                    // EN ESTE METODO BUSCAMOS ENTRE UNA MISMA CADENA  MEDIANTE INDEX OF UNA PALABRA O TEXTO.
                    System.out.println("INGRESE LO QUE DESEA BUSCAR DENTRO DE LA CADENA");
                    ejr.setBuscarentre(teclado4.nextLine());
                    System.out.println(ejr.Indexof());
            }
        } while (opc <= 5);
    }

}
