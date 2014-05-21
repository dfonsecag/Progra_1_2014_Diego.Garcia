/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validar = true;
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        char continuar;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        operaciones ope = new operaciones();
        do {
            System.out.println("DIGITE LA OPERACION A REALIZAR");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("3.MULTIPLICACION");
            System.out.println("4.DIVISION");
            System.out.println("5.RAIZ");
            System.out.println("6.POTENCIA");
            
            opcion= Integer.parseInt(teclado.nextLine());
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());
                     System.out.println("DIGITE EL SEGUNDO NUMERO");
                    valor2= Double.parseDouble(teclado.nextLine());
                     resultado= ope.Sumar(valor1, valor2);
                     System.out.println("EL RESULTADO ES :"+resultado);
                    break;
                }
                case 2:
                {
                     System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());
                     System.out.println("DIGITE EL SEGUNDO NUMERO");
                    valor2= Double.parseDouble(teclado.nextLine());
                     resultado= ope.Restar(valor1, valor2);
                     System.out.println("EL RESULTADO ES:"+resultado);
                     break;
                }
                case 3:
                {
                     System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());
                     System.out.println("DIGITE EL SEGUNDO NUMERO");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=ope.Multiplicar(valor1, valor2);
                    System.out.println("EL ERSULTADO ES:"+resultado);
                    break;
                    
                }
                case 4:
                {
                     System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());
                     System.out.println("DIGITE EL SEGUNDO NUMERO");
                    valor2= Double.parseDouble(teclado.nextLine());
                     resultado=ope.Dividir(valor1, valor2);
                     System.out.println("EL RESULTADO ES"+resultado);
                     break;
                }
                case 5:
                {
                     System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());                     
                   resultado= ope.Raiz(valor1);
                    System.out.println("EL RESULTADO ES"+resultado);
                    break;
                }
                case 6:
                {
                     System.out.println("DIGITE EL PRIMER NUMERO");
                    valor1= Double.parseDouble(teclado.nextLine());
                     System.out.println("DIGITE EL SEGUNDO NUMERO");
                    valor2= Double.parseDouble(teclado.nextLine());
                    resultado=ope.Potencia(valor1, valor2);
                    System.out.println("EL RESULTADO ES:"+resultado);
                    break;
                }
                default:
                {
                    System.out.println("DISCULPE DIGITO UNA OPCION NO EXISTENTE");
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
        // TODO code application logic here
    }

}
