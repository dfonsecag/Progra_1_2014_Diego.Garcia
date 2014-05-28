/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

import java.util.Scanner;

/**
 *NAME:STRING
 * DATE 28/05/2014
 * @author DIEGO
 */
public class STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// REALIZAR UNA CLASE         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("DIGITE EL CORREO ELECTRONICO PERTENECIENTE A EVALUAR");
        
        ejercisioString op = new ejercisioString(teclado.nextLine());
        System.out.println(op.ValidarCorreo());
// TODO code application logic here
    }
    
}
