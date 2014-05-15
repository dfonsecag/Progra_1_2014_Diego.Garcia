/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercisio1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 * 
 * NAME: EJERCISIO 1
 * 
 * DATE: 13/05/2014
 * 
 * COPYRIGHT:
 */
public class Ejercisio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*PRIMER EJERCISIO:
           * Do this: declare a variable of type int N, 
           * a variable of type double A and a variable C
           * of type char and assigns each a value. Then 
           * the screen shows: The value of each variable, 
           * the sum of N + A, the difference of A - N, the 
           * numerical value corresponding to the variable character
           * containing C.
        */
        int N;
        double A;
        char C;
        double suma;
        double resta;
         System.out.println("DIGITE EL VALOR DE N");
         N = Integer.parseInt(teclado.nextLine());
        System.out.println("El VALOR DE N ES:" + N);
        
        System.out.println("DIGITE EL VALOR DE A");
        A = Double.parseDouble(teclado.nextLine());
        System.out.println("EL VALOR DE A ES" +A);
        
        System.out.println("DIGITE EL VALOR DE C");
        C = teclado.nextLine().charAt(0);
        System.out.println("EL VALOR DE C ES"+ C);
        // El valor de la suma:       
        suma = N +A;
        // El valor de la reta:
        resta = A -N;
        System.out.println("LA SUMA DE:"+N+ "+"+A +"="+ suma);
        System.out.println("LA RESTA DE:"+A+ "-" +N +"="+ resta);
        
        //////////////////////////////////////////////////////////////
        // EJERCISIO NUMERO 2:
        /*
           * Do this: declare two variables X and Y int, both N and M variables
           * of type double and assigns each a value. Below shows reliza and prints
           * out a series of operations between them.
        */
        
        int x,y;
        double n,m;
        double suma2;
        double resta2;
        double multi;
        double div;
        System.out.println("DIGITE EL VALOR DE X");
        x = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL VALOR DE Y");
        y = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL VALOR DE N");
        n = Double.parseDouble(teclado.nextLine());
        System.out.println("DIGITE EL VALOR DE M");
        m = Double.parseDouble(teclado.nextLine());
        suma2 = x + y;
        div = y /x;
        resta2 = m-n;
       multi = n*m;
         
        System.out.println("LA SUMA DE:"+x+ "+"+ y +"="+ suma2);
        System.out.println("LA RESTA DE:"+m+ "-"+ n +"="+ resta2);
        System.out.println("LA MULTIPLICACION DE:"+n+ "*" + m +"="+ multi);
        System.out.println("LA DIVISION DE:"+y+ "/"+ x +"="+ div);
        
        /////////////////////////////////////////////////////////////////
        // EJERCISIO NUMERO 3
        /*
            *Java program that declares an integer variable N and assign a value.Then
            * write the instructions to do the following: Increase in N 77,
            * decrease it in 3, Duplicate value.
        */
        
        int N3;
        int prodimiento;
        System.out.println("DIGITE EL VALOR DE N");
        N3 = Integer.parseInt(teclado.nextLine());
        prodimiento = (((N3+77)-3)*2);
        System.out.println("EL VALOR DEL PROCEDIMIENTO ES"+ " "+ prodimiento);
        
        /////////////////////////////////////////////////////////////////////////
        // EJERCISIO NUMERO 4:
        /*
           * Declare four integer variables A, B, C and D and give it an acada value
           * one. Then performs the necessary instructions for: B takes the value of C, 
           * C takes the value of A, A takes the value of D, D takes the value of B
        */
        
        int alm;
        int a;
        System.out.println("DIGITE EL VALOR DE A");
        a = Integer.parseInt(teclado.nextLine());
        int b;
        System.out.println("DIGITE EL VALOR DE B");
        b = Integer.parseInt(teclado.nextLine());
        int c;
        System.out.println("DIGITE EL VALOR DE C");
        c = Integer.parseInt(teclado.nextLine());
        int d;
        System.out.println("DIGITE EL VALOR DE D");
        d = Integer.parseInt(teclado.nextLine());
        b = c;
        c =a;
        a = d;
        d = b;
        alm = d;
        System.out.println("EL VALOR ES" + " " + alm);
        
        /////////////////////////////////////////////////
        //EJECISIO #5
        /*
        * To declare a variable of type integer and assign a
        * value. It then displays a message indicating whether A 
        * is even or odd. If you use the conditional operator to resolve it.
        */
        
        int A5;
        System.out.println("DIGITE EL VALOR DE A");
        A5 = Integer.parseInt(teclado.nextLine());
        int primo;
        primo = A5 % 2;
        if (primo == 0)
        {
            System.out.println("EL NUMERO" + " " + A5 + " " +" ES PAR");
        }
        else
        {
            System.out.println("EL NUMERO" + " " + A5 + " " +" ES IMPAR");
        }
        
        ////////////////////////////////////////////////////////////
        // EJERCISIO NUMERO 6
        /*
        * Declare an integer variable B and assign a value. It then displays a 
        * message indicating whether the value of B is positive or negative. Consider 
        * 0 as positive. If you use the conditional operator to resolve it.
        */
        int z;
        System.out.println("DIGITE EL NUMERO");
        z = Integer.parseInt(teclado.nextLine());
        if (z <=0)
        {
            System.out.println("EL NUMERO"+ " " + z + " " + "ES POSITIVO");
        }
        else
        {
            System.out.println("EL NUMERO"+ " " + z + " " + "ES NEGATIVO");
        }
         
        /////////////////////////////////////////////////////////////////
        // EJERCISIO NUMERO 7:
        
        /*
        * Declare a variable C of type integer and assign a value. Acontinuación displays 
        * a message indicating whether the value of C is positive or negative, if it is 
        * odd or even, if multiple of 5 if * multiple of 10 and if it is greater or less than 
        * 100. Consider 0 as positive. If you use the conditional operator to resolve it
        */
        int C7;
        int par;
        int multi5;
        int multi10;       
        System.out.println("DIGITE UN NUMERO");
        C7 = Integer.parseInt(teclado.nextLine());
        // DIVISIBILIDAD ENTRE 2,5 O 10:
         multi10 = C7%10;
        multi5 = C7%5;
        par = C7 %2;
        if (C7 <= 0)
        {
            System.out.println("EL NUMERO"+ " " + C + " " + "ES POSITIVO");
        }
        else
        {
            System.out.println("EL NUMERO"+ " " + C + " " + "ES POSITIVO");
        }
        if(par==0)
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES PAR");
        }
        else
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES PAR");
        }
        if (multi5==0)
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES MULTIPLO DE 5");
        }
        else
        {
            System.out.println("EL NUMERO" + " " + C + " " +" NO ES MULTIPLO DE 5");
        }
        if (multi10 == 0)
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES MULTIPLO DE 10");
        }
        else
        {
            System.out.println("EL NUMERO" + " " + C + " " +" NO ES MULTIPLO DE 10");
        }
        if (C7<100)
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES MENOR QUE 100");
        }
        else if(C7==100)
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES IGUAL QUE 100");
        }
        else 
        {
            System.out.println("EL NUMERO" + " " + C + " " +" ES MAYOR QUE 100");
        }
        // TODO code application logic here
    }
    
}
