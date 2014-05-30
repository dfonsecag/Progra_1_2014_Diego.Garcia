/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author DIEGO
 */
public class ejercisio2 {
    private String cadena;    

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public String MediaCadena()
    {
        String retorno= "";
        for (int i = 0; i < getCadena().length()/2; i++) {
                   retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
    public String UltimoValor()
    {
        return getCadena().charAt(getCadena().length()-1)+"";
    }
    public String Alrevez()
    {
        String retorno= "";
        for (int i = getCadena().length()-1; i>=0; i--) {
                   retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
    public String Guion()
    {
        String retorno= "";
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().length()-1==i)
            {
                retorno+=getCadena().charAt(i);
            }
            else
            {
                   retorno+=getCadena().charAt(i)+"-";
            }
        }
        return retorno;
    }
    public int vocales()
    {       
        int CantidadVocales=0;
        
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().charAt(i)=='a'||getCadena().charAt(i)=='A'||getCadena().charAt(i)=='e'||getCadena().charAt(i)=='E'||getCadena().charAt(i)=='i'||getCadena().charAt(i)=='I'
                    ||getCadena().charAt(i)=='o'||getCadena().charAt(i)=='O'||getCadena().charAt(i)=='u'||getCadena().charAt(i)=='U')
            {
                CantidadVocales++;
                
            }
            
        }return CantidadVocales;
            
    }
    /*
    palabra que se lee igual de atras para adelante..
    */
    public boolean Palindromo()
    {
        String Palabraanreves="";
        for (int i = getCadena().length()-1; i >= 0; i--) {
            Palabraanreves+= getCadena().charAt(i);            
        }
        if (getCadena().equals(Palabraanreves))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
