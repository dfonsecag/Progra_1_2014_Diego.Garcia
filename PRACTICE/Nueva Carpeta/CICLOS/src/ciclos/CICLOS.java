/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ast;
        
        Scanner teclado=new Scanner(System.in);
        // EJERCISIO #1
        /*
         
         System.out.println("DIGITE UN NUMERO PARA IMPRIMIR **");
         ast = Integer.parseInt(teclado.nextLine());
         for (int i =0; i<= ast; i++)
         {
             System.out.print("*" + '\n');
         }
                */
         //////////////////
         // 2.EJERCISIO:
         /*
         int N;
         System.out.println("DIGITE EL MULTIPLO");
         N = Integer.parseInt(teclado.nextLine());
         int Y;
         System.out.println("DIGITE EL FINAL DEL CICLO");
         Y = Integer.parseInt(teclado.nextLine());
         
         
         for (int i =0; i <= Y; i++)
         {
             if ((i%N)==0)
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(i);
             }
         }
         */
         /////////////////////////////////////////////////////////////7
         //EJERCISIO #3
        /*
        double inicio;
         double fin;
         double incremento;
         System.out.println("DIGITE EL NUMERO INICIAL DEL CICLO");
         inicio = Double.parseDouble(teclado.nextLine());
         System.out.println("DIGITE EL INCREMENTO DEL CICLO");
         incremento = Double.parseDouble(teclado.nextLine());
         System.out.println("DIGITE EL FINAL DEL CICLO");
         fin = Double.parseDouble(teclado.nextLine());          
          
         for (double i = inicio; i <= fin; i=i +incremento)
         {             
             System.out.print(i+ "--");
         }
         */
        ////////////////////////////////////////////////////////////////
        // EJERCISIO #5
        double num;
        int elevacion;
        double operacion;
        System.out.println("DIGITE EL NUMERO");
        num = Double.parseDouble(teclado.nextLine());
        System.out.println("DIGITE LA ELEVACIO");
       elevacion = Integer.parseInt(teclado.nextLine());
        
        for (int i =0;i<=elevacion;i++)
        {
            operacion = num * num;
            System.out.println(operacion);
        }
        // TODO code application logic here
    }
    
}
