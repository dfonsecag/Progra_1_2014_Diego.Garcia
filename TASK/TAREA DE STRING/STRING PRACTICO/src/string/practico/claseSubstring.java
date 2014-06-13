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
public class claseSubstring {

    private String hielera;
    /*
     metodo para  establecer mediante parametros de donde deseo ver la cadena
     con el final que deseo.
     */

    public String Substring(int begin, int end) throws Exception {
        if (end < begin) {
            throw new Exception("ERROR AL FINAL NO PUEDE SER MENOR AL INICIO");
        }
        if (hielera.length() < 0) {
            throw new Exception("LA HIELERA TIENE QUE CONTENER CARACTERERES");
        }

        String retorno = "";
        for (int i = begin - 1; i < end; i++) {
            retorno += hielera.charAt(i);
        }
        return retorno;
    }

    public String ToUpperCase() 
    {
        String retorno = "";
        String mayuscula = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minuscula = "abcdefghijklmnñopqrstuvwxyz";
        
        int index = 0;
        for (int i = 0; i < hielera.length(); i++) {

            if (Character.isLowerCase(hielera.charAt(i))) {
                index = minuscula.indexOf(hielera.charAt(i));
                retorno += mayuscula.charAt(index);
            } else {
                retorno += hielera.charAt(i);
            }
        }return retorno;
    }

}
