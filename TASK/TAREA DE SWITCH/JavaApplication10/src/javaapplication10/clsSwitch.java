/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author DIEGO
 */
public class clsSwitch {

   /*
    * METODO PARA INGRESAR UN NUMERO DEL NUMERO 1 AL 12, Y SABER A QUE MES PERTENECE:
    */
    public String mes(int Pnummes) {
        switch (Pnummes) {
            case 1: {
                return ("ENERO");
            }
            case 2: {
                return ("FEBRERO");
            }
            case 3: {
                return ("MARZO");
            }
            case 4: {
                return ("ABRIL");
            }
            case 5: {
                return ("MAYO");
            }
            case 6: {
                return ("JUNIO");
            }
            case 7: {
                return ("JULIO");
            }
            case 8: {
                return ("AGOSTO");
            }
            case 9: {
                return ("SEPTIEMBRE");
            }
            case 10: {
                return ("OCTUBRE");
            }
            case 11: {
                return ("NOVIEMBRE");
            }
            case 12: {
                return ("DICIEMBRE");
            }
            default:
                return ("NUMERO DE MES NO ENCONTRADO");
        }
    }
/*
    * METODO PARA HACER UNA SERI DE OPERACIONES DEPENDIENDO EL NUMERO INGRESADO AL USUARIO.. SI ES  2, 5, 8 ELEVARLO A LAS 2... SI ES 4,7,9
    MULTIPLICARLO POR 5... Y SI NO ES NINGUNA A LA ANTERIOR RETORNAR EL MISMO NUMERO.
    */
    public double numeroEntero(int Pnumero) {
        int residuo;
        int num = Pnumero;
        residuo = num % 10;
        if (num < 10) {
            if (num == 2 || num == 5 || num == 8) {
                return (Math.pow(num, 2));
            } else if (num == 4 || num == 7 || num == 9) {
                return (num * 5);
            } else {
                return (num);
            }

        } else {
            if (residuo == 2 || residuo == 5 || residuo == 8) {
                return (Math.pow(num, 2));
            } else if (residuo == 4 || residuo == 7 || residuo == 9) {
                return (num * 5);
            } else {
                return (num);
            }
        }
    }
/*
    * INGRESAR UNA LETRA DE A,B,C,D,E... DEPENDIDENDO DE LA LETRA VA A RETORNAR UN VALOR..
    */
    public String letra(String pLetra) {
        switch (pLetra) {
            case "A":
                return ("EXCELENTE");
            case "B":
                return "BUENO";
            case "C":
                return "REGULAR";
            case "D":
                return "MALO";
            case "E":
                return "PESIMO";
            default:
                return "OPCION NO EXISTENTE";
        }
    }
    /*
    * METODO PARA INGRESAR UN MES Y AÑO Y RETORNAR EL NUMERO DE DIAS QUE TIENE DICHO MES...
    */

    public int añoDias(int pMesA, int pañoA) {
        // 2012 visiesto 29 dias
        switch (pMesA) {
            case 1:
                return 31;
            case 2:
                if (pañoA >= 2012) {
                    for (int i = 2012; i <= pañoA; i = i + 4) {
                        if (i == pañoA) 
                            return 29;
                       }
                    return 28;
                } else {
                    for (int i = 2012; i >= pañoA; i = i - 4) {
                        if (i == pañoA) 
                            return 29;                     

                    }
                    return 28;
                }

            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
   /*
    * METODO PARA INGRESAR UNA FECHA: DIA/MES/ AÑO.. Y RETORNAR EL DIA ANTERIOR DE LA FECHA...
    */

    public String añoAnterior(int pDia,int pMes, int pAño) 
    {
       
        int diaActual,mesactual,añoactual, mesguardar;        
        String sdiaActual,smesactual,sañoactual,sdatos;
        mesguardar= pMes;
        diaActual= pDia;
        mesactual=pMes;
        añoactual=pAño;
        if (diaActual == 1&&mesactual>1) {

            mesactual--;
            switch (mesguardar) {
                case 1:
                    diaActual = 31;
                    break;
                case 2:
                    diaActual = 31;
                    break;
                case 3:
                    if (añoactual >= 2012) {
                    for (int i = 2012; i <= añoactual; i = i + 4) {
                        if (i == añoactual)
                        {
                            diaActual=29;
                        }
                        else
                        {
                            diaActual=28;
                        }
                       }
                   // diaActual= 28;
                } 
                    else {
                    for (int i = 2012; i >= añoactual; i = i - 4) {
                        if (i == añoactual) 
                        {
                            diaActual=29;   
                        }
                        else
                        {
                            diaActual=28;
                        }
                    }
                   
                }
                    break;
                case 4:
                    diaActual = 31;
                    break;
                case 5:
                    diaActual = 30;
                    break;
                case 6:
                    diaActual = 31;
                    break;
                case 7:
                    diaActual = 30;
                    break;
                case 8:
                    diaActual = 31;
                    break;
                case 9:
                    diaActual = 31;
                    break;
                case 10:
                    diaActual = 30;
                    break;
                case 11:
                    diaActual = 31;
                    break;
                case 12:
                    diaActual = 30;
                    break;
                default:

            }
        } else if (diaActual > 1) {
            diaActual--;
          
        } 
        else if (diaActual == 1 && mesactual == 1) 
        {
            mesactual = 12;
            diaActual = 31;
            añoactual--;
        }
        sdiaActual= Integer.toString(diaActual);
        smesactual= Integer.toString(mesactual);
        sañoactual= Integer.toString(añoactual);
        sdatos= sdiaActual+" / "+smesactual+" / "+sañoactual;
       return sdatos;
    }
    /*
    * METODO PARA RETORNAR EL  DIA QUE ESTAMOS, SABIENDO QUE EL PRIMER DIA DEL MES FUE LUNES...
    */
 public String repotarDia(int Pdia)
 {   
     
         switch(Pdia)
         {
             case 1:
                 return("LUNES");
             case 2:
                 return ("MARTES");
             case 3:
                 return ("MIERCOLES");
             case 4:
                 return ("JUEVES");
             case 5:
                 return ("VIERNES");
             case 6:
                 return ("SABADO");                 
             case 7:
                 return ("DOMINGO");
             case 8:
                 return("LUNES");
             case 9:
                 return ("MARTES");
             case 10:
                 return ("MIERCOLES");
             case 11:
                 return ("JUEVES");
             case 12:
                 return ("VIERNES");
             case 13:
                 return ("SABADO");                 
             case 14:
                 return ("DOMINGO");
             case 15:
                 return("LUNES");
             case 16:
                 return ("MARTES");
             case 17:
                 return ("MIERCOLES");
             case 18:
                 return ("JUEVES");
             case 19:
                 return ("VIERNES");
             case 20:
                 return ("SABADO");                 
             case 21:
                 return ("DOMINGO");
             case 22:
                 return("LUNES");
             case 23:
                 return ("MARTES");
             case 24:
                 return ("MIERCOLES");
             case 25:
                 return ("JUEVES");
             case 26:
                 return ("VIERNES");
             case 27:
                 return ("SABADO");                 
             case 28:
                 return ("DOMINGO");
             case 29:
                 return ("LUNES");
             case 30:
                 return ("MARTES");
             default:
                 return ("NADA");
         
     }
     
 }
 /*
 * METODO PARA UN NUMERO ALEATORIO, CON PARAMETROS DE 1 HASTA 3000, I CUANDO OBTENGA DICHO NUMERO RETORNAR EN UN STRING 
 DEL NUMERO ALEATORIO Y CONVERTIRLO A NUMERO ROMANOS...
 */
public String ramdon()
{
    int U,D,C,M;
    int numero = (int)(Math.random()*3000);
    String Romano,unidad,decena,centena, millar;
    U=numero%10; 
D=((int) numero/10)%10; 
C=((int) numero/100)%10; 
M=((int) numero/1000)%10; 

switch(U) 
{ 
case 1: unidad="I"; 
break; 
case 2: unidad="II"; 
break; 
case 3: unidad="III"; 
break; 
case 4: unidad="IV"; 
break; 
case 5: unidad="V"; 
break; 
case 6: unidad="VI"; 
break; 
case 7: unidad="VII"; 
break; 
case 8: unidad="VII"; 
break; 
case 9: unidad="VIII"; 
break; 
default: unidad=""; 
} 
switch(D) 
{ 
case 1: decena="X"; 
break; 
case 2: decena="XX"; 
break; 
case 3: decena="XXX"; 
break; 
case 4: decena="XL"; 
break; 
case 5: decena="L"; 
break; 
case 6: decena="LX"; 
break; 
case 7: decena="LXX"; 
break; 
case 8: decena="LXXX"; 
break; 
case 9: decena="XC"; 
break; 
default: decena=""; 
} 
switch(C) 
{ 
case 1: centena="C"; 
break; 
case 2: centena="CC"; 
break; 
case 3: centena="CCC"; 
break; 
case 4: centena="CD"; 
break; 
case 5: centena="D"; 
break; 
case 6: centena="DC"; 
break; 
case 7: centena="DCC"; 
break; 
case 8: centena="DCCC"; 
break; 
case 9: centena="CM"; 
break; 
default: centena=""; 
} 
switch(M) 
{ 
case 1: millar="M"; 
break; 
case 2: millar="MM"; 
break; 
case 3: millar="MMM"; 
break; 
default: millar=""; 
} 
Romano=millar+centena+decena+unidad; 
return (Romano);

} 



}
