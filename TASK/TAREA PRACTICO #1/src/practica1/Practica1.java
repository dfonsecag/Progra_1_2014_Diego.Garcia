/*
 * Name: PrimeraClase
 
 * Information:This is the second class.
  
 * Date:9/05/2014.
  
 * Copyrigh.
 
 */
package practica1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Campbell
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// cargamos la libreria para que lea el teclado
        Scanner teclado = new Scanner(System.in);

        //Primer ejemplo
        /**
         * 1.	Realice lo siguiente: declarar una variable N de tipo int, una
         * variable A de tipo double y una variable C de tipo char y asigna a
         * cada una un valor. A continuación muestra por pantalla: El valor de
         * cada variable, la suma de N + A, la diferencia de A - N, el valor
         * numérico correspondiente al carácter que contiene la variable C.
         */
        // declaracion de variables.
        int N; // creamos la variable entera
        double A; //creamos la variable doble
        char C; //creamos la varible char

// pedimos los datos al usuario
        // le imprimimos los datos al usuario
        System.out.println("Ingrese el valor de N");
        N = Integer.parseInt(teclado.nextLine());
        System.out.println("El valor de N es:" + N);

        System.out.println("Digite el valor de A");
        A = Double.parseDouble(teclado.nextLine());
        System.out.println("El valor de A es:" + A);

        System.out.println("Digite el valor de C");
        C = (teclado.nextLine()).charAt(0);
        System.out.println("El valor de C es:" + C + "\n");

        // operacion que suma
        double suma = N + A;

        // operacion que resta
        double resta = A - N;

        System.out.println("Mostraremos en pantalla las operaciones anteriores" + "\n");

        System.out.println("La Suma de N+A es :" + suma + "\n");
        System.out.println("La resta de A-N es:" + resta + "\n");
        System.out.println("El valor de C es:" + C);

        // segundo ejemplo
        /**
         * 2.	Realice lo siguiente: declarar dos variables X e Y de tipo int,
         * dos variables N y M de tipo double y asigna a cada una un valor. A
         * continuación reliza y muestra muestra por pantalla una serie de
         * operaciones entre ellas.
         */
        // declaramos las nuevas variables
        int X, Y;
        double L, M;
        // increso de datos
        System.out.println("Ingrese el valor de X");
        X = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese el valor de Y");
        Y = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite el valor de L");
        L = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite el valor de M");
        M = Double.parseDouble(teclado.nextLine());

        //operaciones
        double suma2 = M + X;
        int resta2 = X - Y;
        double division = M / X;
        double elevado = Math.pow(X, L);

        //imprecion de datos
        System.out.println("La suma entre M + X  ES:" + suma2 + "\n");

        System.out.println("La resta entre X - Y  ES:" + resta2 + "\n");

        System.out.println("La division entre M / X  ES:" + division + "\n");

        System.out.println("El elevado de M a L  ES:" + elevado + "\n");
        System.out.println("FIN");

        /**
         * 3er ejemplo 3.	Programa Java que declare una variable entera N y
         * asígnale un valor. A continuación escribe las instrucciones que
         * realicen lo siguiente: Incrementar N en 77, Decrementarla en 3,
         * Duplicar su valor.
         */
        // declaracion de variables
        Integer n;

        // pedimos los datos y los guardamos
        System.out.println("DIgite el valor de n");
        n = Integer.parseInt(teclado.nextLine());
        n = (((n + 77) - 3) * 2);
        System.out.println("}El nuevo valor de n es:" + " " + n + "\n");
        System.out.println("FIN");

        /**
         * ejemplo 4 4.	Declare cuatro variables enteras A, B, C y D y asígnale
         * un valor acada una. A continuación realiza las instrucciones
         * necesarias para que: B tome el valor de C, C tome el valor de A, A
         * tome el valor de D, D tome el valor de B.
         */
        // declaracion de variables 
        int a, b, c, d, an;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        an = b;

        a = d;
        b = c;
        c = a;
        d = an;

        /**
         * 5.	Declare una variable A de tipo entero y asígnale un valor. A
         * continuación muestra un mensaje indicando si A es par o impar.
         * Utiliza el operador condicional if para resolverlo.
         */
        // declaracion de variables 
        int par = 15;

        if ((par % 2) != 0) {
            System.out.println("El numero es impar");
        } else {
            System.out.println("El numero es par");
        }

        /**
         * 6.	Declare una variable B de tipo entero y asígnale un valor. A
         * continuación muestra un mensaje indicando si el valor de B es
         * positivo o negativo. Consideraremos el 0 como positivo. Utiliza el
         * operador condicional if para resolverlo.
         */
        //declaracion de variables
        int a1 = 10;

        // creamos la condicional con if
        if (a1 >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        /**
         * 7.	Declare una variable C de tipo entero y asígnale un valor. A
         * continuación muestra un mensaje indicando si el valor de C es
         * positivo o negativo, si es par o impar, si es múltiplo de 5, si es
         * múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0
         * como positivo. Utiliza el operador condicional if para resolverlo.
         */
        // declaracion de variables
        int c1;
        System.out.println("DIgite el valor del numero");
        c1 = Integer.parseInt(teclado.nextLine());

        if (c1 >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        if ((c1 % 2) != 0) {
            System.out.println("El numero es impar");
        } else {
            System.out.println("El numero es par");
        }
        if ((c1 % 5) != 0) {
            System.out.println("El numero no es multiplo de 5");
        } else {
            System.out.println("El numero si es multiplo de 5");
        }
        if ((c1 % 10) != 0) {
            System.out.println("El numero no es multiplo de 10");
        } else {
            System.out.println("El numero si es multiplo de 10");
        }
        if (c1 > 100) {
            System.out.println("El numero es mayor a 100");
        } else {
            System.out.println("El numero es menor a 100");
        }
    }

}
