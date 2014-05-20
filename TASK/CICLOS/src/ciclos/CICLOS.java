/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;

/**
 * Name: EJERCISIO DE CICLOS.
 * DATE:18/05/2014
 * DESCRIPTION: practice of programming cycles
 * Copyriht...
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
            *Make a program that reads a number, then deploy that much *.
        */
         System.out.println("EJERCISIO NUMERO 1");
         System.out.println("DIGITE UN NUMERO PARA IMPRIMIR **");
         ast = Integer.parseInt(teclado.nextLine());
         for (int i =0; i<= ast; i++)
         {
             System.out.print("*" + '\n');
         }
                
         //////////////////
         // 2.EJERCISIO:
         /*
            *Given a value ny other value and display on-screen sequence numbers 
            *from 1 to n, substituting for * every time you deploy an appropriate 
            *multiple of y
         */
         System.out.println("//////////////////////////////////////////////////////////////");
          System.out.println("EJERCISIO NUMERO 2");
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
         
         /////////////////////////////////////////////////////////////7
         //EJERCISIO #3
         /*
            *Prompt user to enter a start value, an end value and the desired increase. These
            *values ​​must be decimal. The system will fill print the numbers generated by a for 
            *loop with the above parameters.
         */
          System.out.println("//////////////////////////////////////////////////////////////");
         System.out.println("EJERCISIO NUMERO 3");
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
         
        ////////////////////////////////////////////////////////////////
        // EJERCISIO #5
         System.out.println("//////////////////////////////////////////////////////////////");
         System.out.println("EJERCISIO NUMERO 5");
        /*
         *Construct an algorithm to raise a decimal number to an integer value entered by the 
         *user. You can not use mathematical functions the idea is to achieve this through the
         *use of the cycle.
         */
        double num;
        int elevacion;
        double operacion;
        
        System.out.println("DIGITE EL NUMERO");
        num = Double.parseDouble(teclado.nextLine());
        System.out.println("DIGITE LA ELEVACIO");
       elevacion = Integer.parseInt(teclado.nextLine());
        operacion = num;
        for (int i =1;i<elevacion;i++)
        {
            operacion = operacion* num;            
        }
        System.out.println("EL RESULTADO DE" +" " + num +" " + "ELEVADO A LA" +" " + elevacion +" " + "=" +" "+ operacion);
      
        ///////////////////////////////////////////////////////////////
        //EJERCISIO NUMERO 6:
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 6");
        /*
        *Build a program that prints the numbers that can be generated with the 5 digit combination of the digits from 1 to 9
        *example 11111, 11112, 11113, 99999 ...
        */
        int num6= 11111;
        while(num6<=99999)
        {
            num6++;
            System.out.println(num6);
        }

        ///////////////////////////////////////////////////////////7
        // EJECISIO NUMERO 7:
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 7");
       /*
        *Sign integers N and report the number of pairs and the number of odd.
        */
        int numeros;
        int contPares=0;
        int contImpares=0;
        System.out.println("DIGITE EL NUMERO PARA SABER CUANTOS NUMEROS ENTEROS HAY");
        numeros = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i <= numeros; i++) {
            if (i%2==0)
            {
                contPares =contPares+1;
            }
            else
            {
                contImpares=contImpares+1;
            }
            
        }
        System.out.println("NUMEROS PARES"+ " " + contPares+ "////"+ "NUMEROS IMPARES" + "  "+ contImpares);
        
        ///////////////////////////////////////
        //EJERCISIO #8
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 8");
        /*
        *Program that reads a number n then display the multiplication table for that number. Contents of the program: a) using for 
        *b) Using while c) using do while.
        */
        int tablaMulti;
        int resultado;
        System.out.println("INGRESE EL NUMERO QUE QUIERE CONOCER LA TABLA DE MULTIPLICAR:");
        tablaMulti = Integer.parseInt(teclado.nextLine());
        for (int i=1;i <=10;i++)
        {
            resultado=  tablaMulti*i;
            System.out.println(i + " " + "*" + tablaMulti + " " + "=" + " " +resultado);
        }       
        
        /////////////////////////////////////////////////////
        // EJERCISIO 9
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 9");
        /*
        *Develop a Java program using the while statement to read any 10 numbers and compute
        *the average of these.
        */
        int numPromedio;       
        int suma=0;
        for(int i=0;i <=10; i++)
        {
            System.out.println("INGRESE EL NUMERO");
            numPromedio= Integer.parseInt(teclado.nextLine());
            suma += numPromedio;
        }
        numPromedio = suma/10;
        System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ES:"+ " "+ numPromedio);
               
        /////////////////////////////////////////////////////////
        
        // EJERCISIO 10.
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 10");
        /*
        *Develop a Java program using the do-while loop to read a list of whole scores between
        *0 and 10. Such a program will repeat the cycle until the user enters a rating of 0. If 
        the user enters a different rating 0 then you should add them and calculate the average.
        */
        
     int numero;
     int sumas=0;
     double promedio10;    
    
         for (int i = 1; i != 0; i++) {
             System.out.println("DIGITE EL NUMERO");
        numero = Integer.parseInt(teclado.nextLine());
        sumas+=numero;
        if(numero<=0||numero>10)
        {
            i=0;
            promedio10=sumas/i;
             System.out.println("promedio"+ promedio10); 
        }
             else
        { 
             promedio10=sumas/i;
             System.out.println("promedio"+ promedio10); 
        }
              
              }
         
        ///////////////////////////////////////////////////////7
        //EJERCISIO 11:
         System.out.println("//////////////////////////////////////////////////////////////");
         System.out.println("EJERCISIO NUMERO 11");
         /*
         *Show the conversion of 1 to $ 10 colones, dollar after dollar, assuming
         *that the exchange rate is 560.
         */
       int  conv;
        for (int i = 1; i <= 10; i++) {
            conv= i*560;
            System.out.println("$"+i+" "+"son "+conv+ "colones ");
            
        }
                
        /////////////////////////
        //  EJERCISIO 12
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 12");
        /*
        *A person wants to invest $ 1000.00 in a bank, which gives you a 2% monthly 
        *interest. What will be the amount of money that this person will have after
        *a year if it reinvests all the money?
        */ 
        double interes;
        //double total;
        double monto=1000;
        for (int i = 0; i <= 12; i++) {
           interes = monto*0.02;
           monto+=interes;
        }
        System.out.println("EL MONTO GANADO ES"+ monto);
                 
       
        
        ///////////////////////////////////////////////////////////777
        // EJERCISIO 13
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("EJERCISIO NUMERO 13");
      /*
        *Simulate the behavior of a digital clock, printing the hour, minutes and seconds 
        in a day from 00:00:00 to 23:59:59
        */           
      
       int nummin=0;
       int numhora=0;
            
           do{
               for (int j = 0; j <= 60; j++) {
                   if(j>=60)
               {
                   nummin++;
                   j=0;
               }
               if (nummin>=60)
               {
                   numhora++;
                   nummin=0;
               }
               if(numhora==24)
               {
                   j=61;
               }
                   System.out.println(numhora+":"+nummin+":"+j);
                   
               }            
                
               
           }while(numhora!=24);
              
         ////////////////////////////////////////////////////////////////////////////////
          
            //  EJERCISIO 14
           System.out.println("//////////////////////////////////////////////////////////////");
           System.out.println("EJERCISIO NUMERO 14");
           /*
           *A person wants to invest $ 1000.00 in a bank, which gives 
           *you a 2% monthly interest. In few months will be over $ 1500,
           *if you roll all your money every month?
           */
        int meses=1;
        double inte;
         double  monto1=1000;
        while(monto1<=1500)
        {
            inte = monto*0.02;
            monto1+=inte;  
            meses++;
        }
        System.out.println("EN MESES"+meses);
       
              ///////////////////////////////////////////////////////////////////////7
        //EJERCISIO 15
       
        System.out.println("EJERCISIO NUMERO 15");
        System.out.println("//////////////////////////////////////////////////////////////");
         /*
        *Develop a program using an on-screen display function N rows of odd natural numbers,
        *and the following numbers as follows:
        */       
        int numm=1;      
        int filas;
        
        
        System.out.println("DIGITE LA CANTIDAD DE FILAS");
        filas = Integer.parseInt(teclado.nextLine());
     
        for (int i = 1; i <= filas; i=i+2) {
            
            for (int e=1; e<=numm; e=e+2)
        {                               
             System.out.print(e+" ");
             
        }           
             numm=i +2;            
            System.out.println("");            
        }   
      
       
        // TODO code application logic here
    }
    
}
