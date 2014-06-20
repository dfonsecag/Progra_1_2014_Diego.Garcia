/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.de.matrices2;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class cls {
    private int [][] matriz;
    Scanner teclado = new Scanner(System.in);
    public void LLenarMatriz()
    {
        matriz = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite los numeros");
            matriz[i][j]=teclado.nextInt();
            }
        }
    }
    public void PromedioMatriz()
    {
        int Promedio,suma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                suma+=matriz[i][j];                
            }
        }
        Promedio= suma/15;
        System.out.println("EL PROMEDIO ES:  "+Promedio);
    }
    public void MayorImpar()
    {
        int cont=0,mayorTodos=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]%2==1)   
                {                   
                    if(matriz[i][j]>cont)
                    {
                        mayorTodos=matriz[i][j];
                        cont = mayorTodos;
                    }                   
                }
            }
        }
        System.out.println("EL NUMERO MAYOR DE LOS IMPARES ES:  "+  mayorTodos);
    }
    public void PromedioPares()
    {
        int suma=0,promedio=0,cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]%2==0)    
                {
                    suma+=matriz[i][j];
                    cont++;
                }
            }
        }
        promedio=suma/cont;
        System.out.println("EL PROMEDIO DEE LOS PARES ES:  "+promedio);
    }
    public void porcentajeImpares()
    {
        int cont=0,porcentaje;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]%2==1)
                {
                    cont++;
                }              
            }             
             porcentaje=(cont*100)/5;
             cont=0;
             System.out.println("El proemdio de imparese de la fila es:  "+porcentaje);
        }
    }
    public void MayorFila()
    {
        int mayortodos=0,cont=0;
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]>cont)
                {
                    mayortodos=matriz[i][j];
                    cont=mayortodos;
                }
            }
               System.out.println("El mayor impar de la fila es:   "+mayortodos);
        }
    }
    public void MenorColumna()
    {
        int cont=0, menortodos=0,fila=0,valor;  
       // cont=matriz[0][0];
         for (int i = 0; i < 3; i++) {
             cont= matriz[0][fila];
            for (int j = 0; j < fila; j++) {
                cont= matriz[i][j];
                if(matriz[0][j] <= cont)
                {
                    menortodos=matriz[i][j];
                    cont = menortodos;
                }
            }
            
            if(fila< 5)
            {
            fila++;
            }
            else
            {
                fila=0;
            }
             System.out.println("El menor de la columna es:  "+menortodos);
             if(i==2)
             {
                 i=0;
             }
        }
    }
    public void MenorImparFila()
    {
        int menor=0,cont=0;
        for (int i = 0; i < 3; i++) {
            cont=matriz[i][0];
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]%2==1)    
                {
                    if(matriz[i][j]<=cont)
                    menor=matriz[i][j];
                    cont=menor;
                }
            }
             System.out.println("El menor de la fila es:  "+menor);
        }        
       
    }
    public void FilasMayorCantidadPares()
    {
         int cont=0, fila1=0,fila2=0,fila3=0;
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]%2==0)    
                {
                    cont++;
                }
            }      
            if(i==0)
            {
                fila1=cont;
                cont=0;
            }
            else if(i==1)
            {
                fila2=cont;
                cont=0;
            }
            else if(i==2)
            {
                fila3=cont;
            }
            
        } 
        if(fila1>fila2&&fila1>fila3)
        {
            System.out.println("FILA 1 MAYOR DE PARES");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 5; j++) {
                    
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
        else if(fila2>fila3)
        {
                                System.out.println("FILA 2 MAYOR DE PARES");
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < 5; j++) {
                 System.out.print(matriz[i][j]+ " ");   
                }
            }
        }
        else
        {
            System.out.println("FILA 3 MAYOR DE PARES");
            for (int i = 2; i < 3; i++) {
                for (int j = 0; j < 5; j++) {                    
                  System.out.print(matriz[i][j]+ " ");  
                }
            }
        }
    }
    public void SumaFila()
    {
        int suma=0,cont=0;
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {                    
                  suma+=matriz[i][j]; 
                }
                System.out.println("La suma de la fila  "+(i+1)+"  es  "+suma);
                suma=0;
            }
    }
    public void PrimosMatriz()
    {/*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if
            }
            
        }*/
    }
}
