/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication10;

import java.util.Scanner;

/**
 * NAME STUDENT: DIEGO GARCIA FONSECA.
 *NAME: TAREA DE SWITCH
 * DATE: 28/05/2014
 * COPYRIHT..
 * @author DIEGO
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        clsSwitch op= new clsSwitch();
      // decalaracion de variables...
        int mes;
        int numeroEntero;
        String letra;
        int diaMes;
        int opcion;
        char continuar;
        boolean validar=true;
        // CICLO DO WHILE PARA INFORMAR AL USUARIO CUANDO DESEA SALIR DE LA APLICAION..
        do {
            System.out.println("DIGITE EL NUMERO DE EJERCISIO QUE DESEA UTILIZAR:");
            System.out.print("1.EJERCISIO"+"//"+"2.EJERCISIO"+"//"+"3.EJERCISIO"+"//"+"4.EJERCISIO"+"//"+"5.EJERCISIO"+"//"+"6.EJRCISIO"+"//"+"7.EJERCISIO");
            opcion= Integer.parseInt(teclado.nextLine());
            switch(opcion)
            {
                case 1:         
        System.out.println("DIGITE EL NUMERO DE MES PARA SABER");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.println(op.mes(mes));
               break;
                case 2:
        System.out.println("DIGITE UN NUMERO ENTERO");
        numeroEntero= Integer.parseInt(teclado.nextLine());
        System.out.println("EL RESULTADDO ES:"+ " " +op.numeroEntero(numeroEntero));//
                break;
         case 3:
        System.out.println("INGRESE LAS LETRAS A, B, C, D, E");
        letra= teclado.nextLine();
        System.out.println(op.letra(letra));
        break;
         case 4:
             // declaracion de avariables para el ejercisio 4.
        int mesA;
        int añoA;
        System.out.println("DIGITE EL NUMERO DE MES");
        mesA = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL AÑO");
         añoA= Integer.parseInt(teclado.nextLine());
         System.out.println("EL NUMERO DE DIAS DEL MES" + " "+ mesA +" "+ "="+" "+ op.añoDias(mesA, añoA));
          break;
         case 5:
             System.out.println("EL NUMERO ALEATRORIO ES:"+ "  "+op.ramdon());
             break;
         case 6:
             // declaracion de variables para el ejercisio numero 6
        int diaAnterior;
       int mesAnterior;
       int añoAnterior;
        System.out.println("DIGITE EL DIA");
        diaAnterior= Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL MES");
        mesAnterior = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL AÑO");
        añoAnterior= Integer.parseInt(teclado.nextLine());
        System.out.println("EL DIA ANTERIOR ES:"+ op.añoAnterior(diaAnterior, mesAnterior, añoAnterior));
        break;
         case 7:
             // decalaracion de variables para el ejercisio numero 7
              int diaA, diahoy;
        System.out.println("INGRESE UN DIA EN NUMERO DEL MES");
        diaMes= Integer.parseInt(teclado.nextLine());
        System.out.println("REPORTAR EL DIA:"+ " " + op.repotarDia(diaMes));
       
        System.out.println("INGRESE EL PRIMER DIA DEL MES");
        diaA= Integer.parseInt(teclado.nextLine());
        System.out.println("INGRESE EL DIA DE HOY");
        diahoy= Integer.parseInt(teclado.nextLine());
        break;
        default:
        {
            System.err.println("EL NUMERO DE OPCION NO EXISTE");
        }
            }
        System.out.println("DESEA CONTINUAR CON OTRA OPERACION");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true;
            } else {
                validar = false;
            }           
        
            
    
}while(validar);
        
}
}
