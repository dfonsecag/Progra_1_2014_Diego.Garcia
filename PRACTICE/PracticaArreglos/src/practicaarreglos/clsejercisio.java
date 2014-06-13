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
public class clsejercisio {
    private int valores1;
   
    Scanner teclado = new Scanner(System.in);
    int [] valoresV = new int[8];
    int [] valoresVV = new int[10];
    int [] cursoA = new int[5];
    int [] cursoB = new int[5];
    int [] cursoAA = new int[4];
    int [] cursoBB = new int[4];
    int pcursoA;
    int pcursoB;
    public void AgregarCursoA()
    {
        for (int i = 0; i < cursoA.length; i++) {
            if(cursoA[i]==0)
            {
                System.out.println("Digite las notas curso A");
                pcursoA= teclado.nextInt();
            cursoA[i]=pcursoA;            
            }
        }
    }
    public void AgregarCursoB()
    {
        for (int i = 0; i < cursoB.length; i++) {
            if(cursoB[i]==0)
            {
            System.out.println("Digite las notas curso B");
            pcursoB= teclado.nextInt();
            cursoB[i]=pcursoB;            
            }
        }
    }
    public void promedio()
    {
        int suma1=0;
        int suma2=0;
        int promedio1=0;
        int promedio2=0;
        for (int i = 0; i < cursoA.length; i++) {
            suma1+=cursoA[i];
        }
        promedio1=suma1/cursoA.length;
        for (int i = 0; i < cursoB.length; i++) {
            suma2+=cursoB[i];
        }
         promedio2=suma2/cursoB.length;
        if(promedio1==promedio2)
        {
            System.out.println("AMBOS CURSOS OBTUVEIRON EL MISMO PROMEDIO");
        }
        else if(promedio1>promedio2)
        {
            System.out.println("EL CURSO A OBTUVO MAYOR PROMEDIO"+" "+promedio1);
        }
        else
        {
            System.out.println("EL CURSO B OBTUVO MAYOR PROMEDIO"+" "+promedio2);
        }
    }
     public void Agregarvalores()
    {
        int valores;
         
        for (int i = 0; i < valoresV.length; i++) 
        {
            System.out.println("DIGITE LOS VALORES");
                valores= teclado.nextInt();
            if(valoresV[i]==0)
            {
                valoresV[i]=valores;  
                
            }
            }
    }
     public void Imprimir()
     {
         int valores;
         int sumarpromedio=0;
        int Mayor36=0;
        int Mayor50=0;
         for (int i = 0; i < valoresV.length; i++) {
             valores= valoresV[i];
             sumarpromedio+=valoresV[i];
             if(valores>=36&&valores<50)
            {
                Mayor36+=valoresV[i];
            }
            else if(valores>=50)
                    {
                     Mayor50++;
                    }
         }
          
              System.out.println("EL VALOR ACUMULADO ES DE "+sumarpromedio+" VALOR ACUMULADO DE MAYORES QUE 36 Y MENORES QUE 50 "+ Mayor36+" CANTIDAD DE VALORES MAYORES QUE 50 "+Mayor50);  
            }
      public void AgregarOrdenado()
     {
          int valores;
         
        for (int i = 0; i < valoresVV.length; i++) 
        {
            System.out.println("DIGITE LOS VALORES");
                valores= teclado.nextInt();
            if(valoresVV[i]==0)
            {
                valoresVV[i]=valores;  
                
            }
            }
     }
     public void Ordenado()
     {
         boolean verdad=false;
         int valores;
         int comp=0;
         for (int i = 0; i < valoresVV.length; i++) {
             valores= valoresVV[i];
             if(comp<=valoresVV[i])
             {
                 verdad=true;
             }
             
             else
             {
                 verdad=false;               
                  break;
             }
             comp=valores;
         }
         if(verdad==true)
         {
             System.out.println("LA CADENA DE NUMEROS ESTA ORDENADA");
         }
         else
         {
             System.out.println("LA CADENA DE NUMEROS NO ESTA ORDENADA");
         }
     }
     public void AgregarvaloresSuma()
     {
     
    
    int valores, valores2;
         
        for (int i = 0; i < cursoAA.length; i++) 
        {
            System.out.println("DIGITE LOS VALORES 1");
                valores= teclado.nextInt();
            if(cursoAA[i]==0)
            {
               cursoAA[i]=valores;
            }
            }
        for (int j = 0; j < cursoBB.length; j++) 
        {
            System.out.println("DIGITE LOS VALORES 2");
                valores2= teclado.nextInt();
            if(cursoBB[j]==0)
            {
                cursoBB[j]=valores2;
            }
            }
        
     }
     public void sumarValores()
     {
         int [] Suma = new int[4];
         Suma[0]= cursoAA[0]+cursoBB[0];
         Suma[1]= cursoAA[1]+cursoBB[1];
         Suma[2]= cursoAA[2]+cursoBB[2];
         Suma[3]= cursoAA[3]+cursoBB[3];
         for (int i = 0; i <Suma.length ; i++) {
             System.out.print(Suma[i]+" ");
         }
     }
        }
       
     
     
    

