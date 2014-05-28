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
public class ejercisioString {

    private String email;

    public ejercisioString(String Pemail) {
        this.email = Pemail;
    }

    public String ValidarCorreo() {
        String mensaje = "EL CORREO NO CONTIENE @";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                mensaje = "EL CORREO CONTIENE '@'";
            }

        }
        return (mensaje);

    }

}
