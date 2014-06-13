/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.practico;

/**
 *
 * @author DIEGO
 */
public class clsejer1 {
    private  String Cadena;
private  String buscar;
private String comparar;
private String compararCadena;
private String IncioCadena;
private String FinalCadena;
private String Buscarentre;
private String BuscarRepeticiones;

    public String getBuscarRepeticiones() {
        return BuscarRepeticiones;
    }

    public void setBuscarRepeticiones(String BuscarRepeticiones) {
        this.BuscarRepeticiones = BuscarRepeticiones;
    }

    public String getBuscarentre() {
        return Buscarentre;
    }

    public void setBuscarentre(String Buscarentre) {
        this.Buscarentre = Buscarentre;
    }

    public String getCompararCadena() {
        return compararCadena;
    }

    public String getIncioCadena() {
        return IncioCadena;
    }

    public void setIncioCadena(String IncioCadena) {
        this.IncioCadena = IncioCadena;
    }

    public String getFinalCadena() {
        return FinalCadena;
    }

    public void setFinalCadena(String FinalCadena) {
        this.FinalCadena = FinalCadena;
    }

    public void setCompararCadena(String compararCadena) {
        this.compararCadena = compararCadena;
    }
    public String getComparar() {
        return comparar;
    }

    public void setComparar(String comparar) {
        this.comparar = comparar;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }
    /*
    metodo para buscar una palabra entre la misma cadena.
    */
    public String Indexof()
    {
        String dato;
        int Posicion;
        Posicion= getCadena().indexOf(getBuscarentre());
        if(Posicion==-1)
        {
            dato= "NO EXISTE LA LETRA QUE BUSCO ENTRE LA CADENA";
        }
        else
        {
            dato = "LA PALABRA BUSCADA"+ " "+ getBuscarentre()+" "+"ESTA EN LA POSICIO"+ " "+ Posicion;
        }
       return dato;
    }
    /*
    metodo para convertir a mayuscula la cadena de texto
    */
    public String TOUpperCase()
    {
        String Mayuscula;
        Mayuscula= getCadena().toUpperCase();
        return Mayuscula;
    }/*
    public int Valueof()
    {
       // return getvalueOf(getCadena());
    }*/
   
    /*
    metodo para invertir la cadena.
    */
    public String Inversa()
    {
        String retorno= "";
        for (int i = getCadena().length()-1; i>=0; i--) {
                   retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
    /*
    metodo para formar un palindromo apartir de una palabra.
    */
    public String Palindromo()
    {
        String Palabraanreves="";
        String cadena;
        String cadena2="";
        //String cadena2="";
        for (int i = getCadena().length()-1; i >= 0; i--) {
            Palabraanreves+= getCadena().charAt(i);            
        }  
        for (int i = 0; i < getCadena().length()-1; i++) {
            cadena2+=getCadena().charAt(i);
        }
            cadena = cadena2+Palabraanreves;
            return cadena;
        
        
    }
    /*
    metodo para comparar dos cadenas para ver cual es mayor
    */
    public String CompararCadenas()
    {
        if(getCadena().compareTo(getCompararCadena())==0)
        {
            return "LAS CADENAS "+" "+ getCadena()+"+"+" "+ getCompararCadena()+" " +"SON IGUALES.";
        }
        else if(getCadena().compareTo(getCompararCadena())<0)
        {
            return "LA CADENA"+" "+ getCadena()+" "+" ES MENOR A "+" "+getCompararCadena()+" "+" CADENA";
        }
        else
        {
            return  "LA CADENA"+" "+ getCadena()+" "+" ES MAYOR A "+" "+getCompararCadena()+" "+" CADENA";
        }
    }
    /*
    metodo para buscar una palabra entre la misma cadena.
    */
     public String Buscarpalabra( )
     {
        int POCICION;
        String datos="";
        
        POCICION = getCadena().indexOf(getBuscar());

        if(POCICION == -1)
        {
            datos= "NO EXISTEN LETRAS \"a\" EN LA CADENA";
        }
        else
        {
            for (int i = 0; i <getCadena().length(); i++) {
                if(i==POCICION)
                {
                    datos+= "-"+getCadena().charAt(i);
                }
                else
                {
                    datos+=getCadena().charAt(i);
                }
            }
            //datos= "LA PRIMERA LETRA \"a\" ESTA EN LA POCICION : " + (POCICION);
        }
        return datos;
    }
     /*
     metodo para averiguar la longitud cde la cadena.
     */
     public int TamañoCadena()
     {
         int largo;
         largo= getCadena().length();
         return largo;
     }
     /*
     metodo para saber que caracter esta mediante la posicion insertada por el
     ususario.
     */
     public char Posicion()
     {
         int compararar;
         char letra ='i';
        compararar= Integer.parseInt(getComparar());
         for (int i = 0; i <= compararar; i++) {
             if(i==compararar)
             {
                 letra=getCadena().charAt(i);
             }
             
         }return letra;
     }
             
   
}
